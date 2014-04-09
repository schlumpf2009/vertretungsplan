/*  LS Vertretungsplan - Android-App f�r den Vertretungsplan der Lornsenschule Schleswig
    Copyright (C) 2014  Johan v. Forstner

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see [http://www.gnu.org/licenses/]. */

package com.johan.vertretungsplan;

import java.util.ArrayList;
import java.util.TreeSet;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import org.holoeverywhere.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import org.holoeverywhere.preference.PreferenceManager;
import org.holoeverywhere.widget.LinearLayout;
import org.holoeverywhere.widget.ListView;
import org.holoeverywhere.widget.ProgressBar;
import org.holoeverywhere.widget.Spinner;
import org.holoeverywhere.widget.TextView;

import com.johan.vertretungsplan.classes.KlassenVertretungsplan;
import com.johan.vertretungsplan.classes.Vertretung;
import com.johan.vertretungsplan.classes.Vertretungsplan;
import com.johan.vertretungsplan.utils.Animations;

public class AFragment extends VertretungsplanFragment {
	
	ListView list;
	Spinner klassen;
	ImageView image;
	TextView txtStand;
	ProgressBar pBar = null;
	Boolean showProgress = true;
	Vertretungsplan v;
	boolean ready = false;
	
    public static Context appContext;
    public static StartActivity startActivity;
    MyCustomAdapter listadapter = null;
	
	public static final String EXTRA_TITLE = "Vertretungsplan";
	public static final String PREFS_NAME = "VertretungsplanLS";
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {       
		View view = inflater.inflate(R.layout.afragment, container, false);

		appContext = getActivity().getApplicationContext();
		startActivity = (StartActivity) getActivity();
        
		
		// Restore preferences
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(appContext);
        String klasse = settings.getString("klasse", "5a");
        list = (ListView) view.findViewById(R.id.listView1);
        klassen = (Spinner) view.findViewById(R.id.spinner1);
        image = (ImageView) view.findViewById(R.id.imageView1);
        txtStand = (TextView) view.findViewById(R.id.txtStand);
        pBar = (ProgressBar) view.findViewById(R.id.progressBar1);
        Integer i;
        for(i=0; i < klassen.getAdapter().getCount(); i++) {
        	  if(klasse.equals(klassen.getAdapter().getItem(i).toString())){
        	    klassen.setSelection(i);
        	    break;
        	  }
        	}
        
        listadapter = new MyCustomAdapter(startActivity);
		list.setAdapter(listadapter);
        
        ready = true;
        if(v != null) aktualisieren(v);
		
		// Inflate the layout for this fragment
        return view;
    }
    
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
    	bgAktualisieren();
        progress(showProgress);
        mListener.onFragmentInteraction("ViewCreated", this);
        super.onViewCreated(view, savedInstanceState);
    }
    
    public static Bundle createBundle( String title ) {
        Bundle bundle = new Bundle();
        bundle.putString( EXTRA_TITLE, title );
        return bundle;
    }
    
    public void aktualisieren(Vertretungsplan v) { 
    	this.v = v;
    	if(ready) {
	    	txtStand.setText(v.getStand());
	        listadapter.clear();
	        String klasse = klassen.getSelectedItem().toString();
	        KlassenVertretungsplan kv = v.get(klasse);
	    	listadapter.addSeparatorItem(v.getDateHeute());
	        if (kv != null) {
		        if (kv.getVertretungHeute() != null && kv.getVertretungHeute().size() > 0) {
			        for (Vertretung i:kv.getVertretungHeute()) {
			        	listadapter.addItem(i);
			        }
		        } else {
		        	listadapter.addTextItem("keine Informationen");
		        }
	        } else {
	        	listadapter.addTextItem("keine Informationen");
	        }
		        
	    	listadapter.addSeparatorItem(v.getDateMorgen());
	        if (kv != null) {
		        if (kv.getVertretungMorgen() != null && kv.getVertretungMorgen().size() > 0) {
			        for (Vertretung i:kv.getVertretungMorgen()) {
			        	listadapter.addItem(i);
			        }
		        } else {
		        	listadapter.addTextItem("keine Informationen");
		        }
	        } else {
	        	listadapter.addTextItem("keine Informationen");
	        } 
    	}
    }
    
    public void bgAktualisieren() {
        // Restore preferences
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(appContext);
        Boolean bg = settings.getBoolean("bg", true);
        if (bg == true) {
        	image.setVisibility(View.VISIBLE);
        } else {
        	image.setVisibility(View.INVISIBLE);
        }
    }
    
    public void progress(boolean show) {
    	showProgress = show;
    	if (pBar != null) {
	    	if (show == true) {
	    		Animations.crossfade(list, pBar);
	    	} else {
	    		Animations.crossfade(pBar, list);
	    		list.setVisibility(View.VISIBLE);
	    	}
    	}
    }
    
    public class MyCustomAdapter extends BaseAdapter {
    	 
        private static final int TYPE_ITEM = 0;
        private static final int TYPE_SEPARATOR = 1;
        private static final int TYPE_TEXT = 2;
        private static final int TYPE_MAX_COUNT = TYPE_TEXT + 1;
 
        private ArrayList<Object> mData = new ArrayList<Object>();
        private LayoutInflater mInflater;
 
        private TreeSet<Object> mSeparatorsSet = new TreeSet<Object>();
        private TreeSet<Object> mTextsSet = new TreeSet<Object>();
 
        public MyCustomAdapter(Context context) {
            mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
 
        public void addItem(final Vertretung item) {
            mData.add(item);
            notifyDataSetChanged();
        }
 
        public void addSeparatorItem(final String item) {
            mData.add(item);
            // save separator position
            mSeparatorsSet.add(mData.size() - 1);
            notifyDataSetChanged();
        }
        
        public void addTextItem(final String item) {
            mData.add(item);
            // save separator position
            mTextsSet.add(mData.size() - 1);
            notifyDataSetChanged();
        }
 
        @Override
        public int getItemViewType(int position) {
        	return mSeparatorsSet.contains(position) ? TYPE_SEPARATOR : (mTextsSet.contains(position) ? TYPE_TEXT : TYPE_ITEM);
        }
 
        @Override
        public int getViewTypeCount() {
            return TYPE_MAX_COUNT;
        }
 
        @Override
        public int getCount() {
            return mData.size();
        }
 
        @Override
        public String getItem(int position) {
            return (String) mData.get(position);
        }
 
        @Override
        public long getItemId(int position) {
            return position;
        }
 
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
        	// Restore preferences
            SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(appContext);
            Boolean farben = settings.getBoolean("farben", true);
            
        	ViewHolder holder = null;
            int type = getItemViewType(position);         
            if (convertView == null) {
                holder = new ViewHolder();
                switch (type) {
                    case TYPE_ITEM:
                        convertView = mInflater.inflate(R.layout.vertretung, null);
                        holder.stunde = (TextView)convertView.findViewById(R.id.stunde);
                        holder.stunde.setText((CharSequence)((Vertretung) mData.get(position)).getLesson().toString());
                        
                        holder.art = (TextView)convertView.findViewById(R.id.art);
                        holder.art.setText((CharSequence)((Vertretung) mData.get(position)).getType());
                        
                        holder.text = (TextView)convertView.findViewById(R.id.text);
                        holder.text.setText((CharSequence)((Vertretung) mData.get(position)).toString());
                        
                        holder.stripe = (View) convertView.findViewById(R.id.stripe);
                        if (farben) {
                        	holder.stripe.setBackgroundColor(Color.parseColor((String)((Vertretung) mData.get(position)).getColor()));
                        } else {
                        	holder.stripe.setVisibility(View.GONE);
                		}
                        break;
                    case TYPE_SEPARATOR:
                        convertView = mInflater.inflate(R.layout.separator, null);
                        holder.textView = (TextView)convertView.findViewById(R.id.textSeparator);
                        holder.textView.setText((CharSequence) mData.get(position));
                        break;
                    case TYPE_TEXT:
                    	convertView = mInflater.inflate(R.layout.text, null);
                        holder.text = (TextView)convertView.findViewById(R.id.text);
                        holder.text.setText((CharSequence) mData.get(position));
                        
//                        if (farben) {
//                        	holder.layout = (LinearLayout)convertView.findViewById(R.id.layout);
//                        	holder.layout.setBackgroundColor(Color.parseColor("#4099CC00"));
//                        }
                        break;
                }
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder)convertView.getTag();
                
                switch (type) {
                case TYPE_ITEM:
                    holder.stunde = (TextView)convertView.findViewById(R.id.stunde);
                    holder.stunde.setText((CharSequence)((Vertretung) mData.get(position)).getLesson().toString());
                    
                    holder.art = (TextView)convertView.findViewById(R.id.art);
                    holder.art.setText((CharSequence)((Vertretung) mData.get(position)).getType());
                    
                    holder.text = (TextView)convertView.findViewById(R.id.text);
                    holder.text.setText((CharSequence)((Vertretung) mData.get(position)).toString());
                	
                    holder.stripe = (View) convertView.findViewById(R.id.stripe);
                    
                    if (farben) {
                    	holder.stripe.setBackgroundColor(Color.parseColor((String)((Vertretung) mData.get(position)).getColor()));
                    } else {
                    	holder.stripe.setVisibility(View.GONE);
            		}
                    break;
                case TYPE_SEPARATOR:
                    holder.textView = (TextView)convertView.findViewById(R.id.textSeparator);
                    holder.textView.setText((CharSequence) mData.get(position));
                    break;
                case TYPE_TEXT:
                    holder.text = (TextView)convertView.findViewById(R.id.text);
                    holder.text.setText((CharSequence) mData.get(position));
                    
//                    if (farben) {
//                    	holder.layout = (LinearLayout)convertView.findViewById(R.id.layout);
//                    	holder.layout.setBackgroundColor(Color.parseColor("#4099CC00"));
//                    }
                    break;
            }
            convertView.setTag(holder);
            }
            return convertView;
        }
        
        public void clear() {
        	mData.clear();
        	mSeparatorsSet.clear();
        	mTextsSet.clear();
        	notifyDataSetChanged();
        }
 
    }
    
    public static class ViewHolder {
        public TextView text;
		public TextView art;
		public TextView stunde;
		public TextView textView;
		public LinearLayout layout;
		public View stripe;
    }
    
}

