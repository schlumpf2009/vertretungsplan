/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-04-15 19:10:39 UTC)
 * on 2014-05-07 at 13:47:44 UTC 
 * Modify at your own risk.
 */

package com.johan.vertretungsplan_2.vertretungsplanserializedendpoint;

/**
 * Service definition for Vertretungsplanserializedendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link VertretungsplanserializedendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Vertretungsplanserializedendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the vertretungsplanserializedendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://com-johan-vertretungsplan.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "vertretungsplanserializedendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Vertretungsplanserializedendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Vertretungsplanserializedendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getVertretungsplanSerialized".
   *
   * This request holds the parameters needed by the the vertretungsplanserializedendpoint server.
   * After setting any optional parameters, call the {@link GetVertretungsplanSerialized#execute()}
   * method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetVertretungsplanSerialized getVertretungsplanSerialized(java.lang.String id) throws java.io.IOException {
    GetVertretungsplanSerialized result = new GetVertretungsplanSerialized(id);
    initialize(result);
    return result;
  }

  public class GetVertretungsplanSerialized extends VertretungsplanserializedendpointRequest<com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.VertretungsplanSerialized> {

    private static final String REST_PATH = "vertretungsplanserialized/{id}";

    /**
     * Create a request for the method "getVertretungsplanSerialized".
     *
     * This request holds the parameters needed by the the vertretungsplanserializedendpoint server.
     * After setting any optional parameters, call the {@link GetVertretungsplanSerialized#execute()}
     * method to invoke the remote operation. <p> {@link GetVertretungsplanSerialized#initialize(com.g
     * oogle.api.client.googleapis.services.AbstractGoogleClientRequest)} must be called to initialize
     * this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetVertretungsplanSerialized(java.lang.String id) {
      super(Vertretungsplanserializedendpoint.this, "GET", REST_PATH, null, com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.VertretungsplanSerialized.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetVertretungsplanSerialized setAlt(java.lang.String alt) {
      return (GetVertretungsplanSerialized) super.setAlt(alt);
    }

    @Override
    public GetVertretungsplanSerialized setFields(java.lang.String fields) {
      return (GetVertretungsplanSerialized) super.setFields(fields);
    }

    @Override
    public GetVertretungsplanSerialized setKey(java.lang.String key) {
      return (GetVertretungsplanSerialized) super.setKey(key);
    }

    @Override
    public GetVertretungsplanSerialized setOauthToken(java.lang.String oauthToken) {
      return (GetVertretungsplanSerialized) super.setOauthToken(oauthToken);
    }

    @Override
    public GetVertretungsplanSerialized setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetVertretungsplanSerialized) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetVertretungsplanSerialized setQuotaUser(java.lang.String quotaUser) {
      return (GetVertretungsplanSerialized) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetVertretungsplanSerialized setUserIp(java.lang.String userIp) {
      return (GetVertretungsplanSerialized) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public GetVertretungsplanSerialized setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public GetVertretungsplanSerialized set(String parameterName, Object value) {
      return (GetVertretungsplanSerialized) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertVertretungsplanSerialized".
   *
   * This request holds the parameters needed by the the vertretungsplanserializedendpoint server.
   * After setting any optional parameters, call the {@link InsertVertretungsplanSerialized#execute()}
   * method to invoke the remote operation.
   *
   * @param content the {@link com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.VertretungsplanSerialized}
   * @return the request
   */
  public InsertVertretungsplanSerialized insertVertretungsplanSerialized(com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.VertretungsplanSerialized content) throws java.io.IOException {
    InsertVertretungsplanSerialized result = new InsertVertretungsplanSerialized(content);
    initialize(result);
    return result;
  }

  public class InsertVertretungsplanSerialized extends VertretungsplanserializedendpointRequest<com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.VertretungsplanSerialized> {

    private static final String REST_PATH = "vertretungsplanserialized";

    /**
     * Create a request for the method "insertVertretungsplanSerialized".
     *
     * This request holds the parameters needed by the the vertretungsplanserializedendpoint server.
     * After setting any optional parameters, call the {@link
     * InsertVertretungsplanSerialized#execute()} method to invoke the remote operation. <p> {@link In
     * sertVertretungsplanSerialized#initialize(com.google.api.client.googleapis.services.AbstractGoog
     * leClientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @param content the {@link com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.VertretungsplanSerialized}
     * @since 1.13
     */
    protected InsertVertretungsplanSerialized(com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.VertretungsplanSerialized content) {
      super(Vertretungsplanserializedendpoint.this, "POST", REST_PATH, content, com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.VertretungsplanSerialized.class);
    }

    @Override
    public InsertVertretungsplanSerialized setAlt(java.lang.String alt) {
      return (InsertVertretungsplanSerialized) super.setAlt(alt);
    }

    @Override
    public InsertVertretungsplanSerialized setFields(java.lang.String fields) {
      return (InsertVertretungsplanSerialized) super.setFields(fields);
    }

    @Override
    public InsertVertretungsplanSerialized setKey(java.lang.String key) {
      return (InsertVertretungsplanSerialized) super.setKey(key);
    }

    @Override
    public InsertVertretungsplanSerialized setOauthToken(java.lang.String oauthToken) {
      return (InsertVertretungsplanSerialized) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertVertretungsplanSerialized setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertVertretungsplanSerialized) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertVertretungsplanSerialized setQuotaUser(java.lang.String quotaUser) {
      return (InsertVertretungsplanSerialized) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertVertretungsplanSerialized setUserIp(java.lang.String userIp) {
      return (InsertVertretungsplanSerialized) super.setUserIp(userIp);
    }

    @Override
    public InsertVertretungsplanSerialized set(String parameterName, Object value) {
      return (InsertVertretungsplanSerialized) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listVertretungsplanSerialized".
   *
   * This request holds the parameters needed by the the vertretungsplanserializedendpoint server.
   * After setting any optional parameters, call the {@link ListVertretungsplanSerialized#execute()}
   * method to invoke the remote operation.
   *
   * @return the request
   */
  public ListVertretungsplanSerialized listVertretungsplanSerialized() throws java.io.IOException {
    ListVertretungsplanSerialized result = new ListVertretungsplanSerialized();
    initialize(result);
    return result;
  }

  public class ListVertretungsplanSerialized extends VertretungsplanserializedendpointRequest<com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.CollectionResponseVertretungsplanSerialized> {

    private static final String REST_PATH = "vertretungsplanserialized";

    /**
     * Create a request for the method "listVertretungsplanSerialized".
     *
     * This request holds the parameters needed by the the vertretungsplanserializedendpoint server.
     * After setting any optional parameters, call the {@link ListVertretungsplanSerialized#execute()}
     * method to invoke the remote operation. <p> {@link ListVertretungsplanSerialized#initialize(com.
     * google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be called to
     * initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListVertretungsplanSerialized() {
      super(Vertretungsplanserializedendpoint.this, "GET", REST_PATH, null, com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.CollectionResponseVertretungsplanSerialized.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListVertretungsplanSerialized setAlt(java.lang.String alt) {
      return (ListVertretungsplanSerialized) super.setAlt(alt);
    }

    @Override
    public ListVertretungsplanSerialized setFields(java.lang.String fields) {
      return (ListVertretungsplanSerialized) super.setFields(fields);
    }

    @Override
    public ListVertretungsplanSerialized setKey(java.lang.String key) {
      return (ListVertretungsplanSerialized) super.setKey(key);
    }

    @Override
    public ListVertretungsplanSerialized setOauthToken(java.lang.String oauthToken) {
      return (ListVertretungsplanSerialized) super.setOauthToken(oauthToken);
    }

    @Override
    public ListVertretungsplanSerialized setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListVertretungsplanSerialized) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListVertretungsplanSerialized setQuotaUser(java.lang.String quotaUser) {
      return (ListVertretungsplanSerialized) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListVertretungsplanSerialized setUserIp(java.lang.String userIp) {
      return (ListVertretungsplanSerialized) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListVertretungsplanSerialized setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListVertretungsplanSerialized setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListVertretungsplanSerialized set(String parameterName, Object value) {
      return (ListVertretungsplanSerialized) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeVertretungsplanSerialized".
   *
   * This request holds the parameters needed by the the vertretungsplanserializedendpoint server.
   * After setting any optional parameters, call the {@link RemoveVertretungsplanSerialized#execute()}
   * method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveVertretungsplanSerialized removeVertretungsplanSerialized(java.lang.String id) throws java.io.IOException {
    RemoveVertretungsplanSerialized result = new RemoveVertretungsplanSerialized(id);
    initialize(result);
    return result;
  }

  public class RemoveVertretungsplanSerialized extends VertretungsplanserializedendpointRequest<Void> {

    private static final String REST_PATH = "vertretungsplanserialized/{id}";

    /**
     * Create a request for the method "removeVertretungsplanSerialized".
     *
     * This request holds the parameters needed by the the vertretungsplanserializedendpoint server.
     * After setting any optional parameters, call the {@link
     * RemoveVertretungsplanSerialized#execute()} method to invoke the remote operation. <p> {@link Re
     * moveVertretungsplanSerialized#initialize(com.google.api.client.googleapis.services.AbstractGoog
     * leClientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveVertretungsplanSerialized(java.lang.String id) {
      super(Vertretungsplanserializedendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveVertretungsplanSerialized setAlt(java.lang.String alt) {
      return (RemoveVertretungsplanSerialized) super.setAlt(alt);
    }

    @Override
    public RemoveVertretungsplanSerialized setFields(java.lang.String fields) {
      return (RemoveVertretungsplanSerialized) super.setFields(fields);
    }

    @Override
    public RemoveVertretungsplanSerialized setKey(java.lang.String key) {
      return (RemoveVertretungsplanSerialized) super.setKey(key);
    }

    @Override
    public RemoveVertretungsplanSerialized setOauthToken(java.lang.String oauthToken) {
      return (RemoveVertretungsplanSerialized) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveVertretungsplanSerialized setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveVertretungsplanSerialized) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveVertretungsplanSerialized setQuotaUser(java.lang.String quotaUser) {
      return (RemoveVertretungsplanSerialized) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveVertretungsplanSerialized setUserIp(java.lang.String userIp) {
      return (RemoveVertretungsplanSerialized) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public RemoveVertretungsplanSerialized setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveVertretungsplanSerialized set(String parameterName, Object value) {
      return (RemoveVertretungsplanSerialized) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateVertretungsplanSerialized".
   *
   * This request holds the parameters needed by the the vertretungsplanserializedendpoint server.
   * After setting any optional parameters, call the {@link UpdateVertretungsplanSerialized#execute()}
   * method to invoke the remote operation.
   *
   * @param content the {@link com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.VertretungsplanSerialized}
   * @return the request
   */
  public UpdateVertretungsplanSerialized updateVertretungsplanSerialized(com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.VertretungsplanSerialized content) throws java.io.IOException {
    UpdateVertretungsplanSerialized result = new UpdateVertretungsplanSerialized(content);
    initialize(result);
    return result;
  }

  public class UpdateVertretungsplanSerialized extends VertretungsplanserializedendpointRequest<com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.VertretungsplanSerialized> {

    private static final String REST_PATH = "vertretungsplanserialized";

    /**
     * Create a request for the method "updateVertretungsplanSerialized".
     *
     * This request holds the parameters needed by the the vertretungsplanserializedendpoint server.
     * After setting any optional parameters, call the {@link
     * UpdateVertretungsplanSerialized#execute()} method to invoke the remote operation. <p> {@link Up
     * dateVertretungsplanSerialized#initialize(com.google.api.client.googleapis.services.AbstractGoog
     * leClientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @param content the {@link com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.VertretungsplanSerialized}
     * @since 1.13
     */
    protected UpdateVertretungsplanSerialized(com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.VertretungsplanSerialized content) {
      super(Vertretungsplanserializedendpoint.this, "PUT", REST_PATH, content, com.johan.vertretungsplan_2.vertretungsplanserializedendpoint.model.VertretungsplanSerialized.class);
    }

    @Override
    public UpdateVertretungsplanSerialized setAlt(java.lang.String alt) {
      return (UpdateVertretungsplanSerialized) super.setAlt(alt);
    }

    @Override
    public UpdateVertretungsplanSerialized setFields(java.lang.String fields) {
      return (UpdateVertretungsplanSerialized) super.setFields(fields);
    }

    @Override
    public UpdateVertretungsplanSerialized setKey(java.lang.String key) {
      return (UpdateVertretungsplanSerialized) super.setKey(key);
    }

    @Override
    public UpdateVertretungsplanSerialized setOauthToken(java.lang.String oauthToken) {
      return (UpdateVertretungsplanSerialized) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateVertretungsplanSerialized setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateVertretungsplanSerialized) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateVertretungsplanSerialized setQuotaUser(java.lang.String quotaUser) {
      return (UpdateVertretungsplanSerialized) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateVertretungsplanSerialized setUserIp(java.lang.String userIp) {
      return (UpdateVertretungsplanSerialized) super.setUserIp(userIp);
    }

    @Override
    public UpdateVertretungsplanSerialized set(String parameterName, Object value) {
      return (UpdateVertretungsplanSerialized) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Vertretungsplanserializedendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Vertretungsplanserializedendpoint}. */
    @Override
    public Vertretungsplanserializedendpoint build() {
      return new Vertretungsplanserializedendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link VertretungsplanserializedendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setVertretungsplanserializedendpointRequestInitializer(
        VertretungsplanserializedendpointRequestInitializer vertretungsplanserializedendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(vertretungsplanserializedendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}