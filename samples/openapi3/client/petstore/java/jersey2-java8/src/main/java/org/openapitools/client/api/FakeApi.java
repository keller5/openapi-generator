package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import org.openapitools.client.model.Client;
import java.io.File;
import org.openapitools.client.model.FileSchemaTestClass;
import org.openapitools.client.model.HealthCheckResult;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.OuterEnum;
import org.openapitools.client.model.TestInlineFreeformAdditionalPropertiesRequest;
import org.openapitools.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FakeApi {
  private ApiClient apiClient;

  public FakeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FakeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Health check endpoint
   * 
   * @return HealthCheckResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The instance started successfully </td><td>  -  </td></tr>
     </table>
   */
  public HealthCheckResult fakeHealthGet() throws ApiException {
    return fakeHealthGetWithHttpInfo().getData();
  }

  /**
   * Health check endpoint
   * 
   * @return ApiResponse&lt;HealthCheckResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The instance started successfully </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<HealthCheckResult> fakeHealthGetWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<HealthCheckResult> localVarReturnType = new GenericType<HealthCheckResult>() {};
    return apiClient.invokeAPI("FakeApi.fakeHealthGet", "/fake/health", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * Test serialization of outer boolean types
   * @param body Input boolean as post body (optional)
   * @return Boolean
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output boolean </td><td>  -  </td></tr>
     </table>
   */
  public Boolean fakeOuterBooleanSerialize(Boolean body) throws ApiException {
    return fakeOuterBooleanSerializeWithHttpInfo(body).getData();
  }

  /**
   * 
   * Test serialization of outer boolean types
   * @param body Input boolean as post body (optional)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output boolean </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Boolean> fakeOuterBooleanSerializeWithHttpInfo(Boolean body) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI("FakeApi.fakeOuterBooleanSerialize", "/fake/outer/boolean", "POST", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * Test serialization of object with outer number type
   * @param outerComposite Input composite as post body (optional)
   * @return OuterComposite
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output composite </td><td>  -  </td></tr>
     </table>
   */
  public OuterComposite fakeOuterCompositeSerialize(OuterComposite outerComposite) throws ApiException {
    return fakeOuterCompositeSerializeWithHttpInfo(outerComposite).getData();
  }

  /**
   * 
   * Test serialization of object with outer number type
   * @param outerComposite Input composite as post body (optional)
   * @return ApiResponse&lt;OuterComposite&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output composite </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OuterComposite> fakeOuterCompositeSerializeWithHttpInfo(OuterComposite outerComposite) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<OuterComposite> localVarReturnType = new GenericType<OuterComposite>() {};
    return apiClient.invokeAPI("FakeApi.fakeOuterCompositeSerialize", "/fake/outer/composite", "POST", new ArrayList<>(), outerComposite,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * Test serialization of outer number types
   * @param body Input number as post body (optional)
   * @return BigDecimal
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output number </td><td>  -  </td></tr>
     </table>
   */
  public BigDecimal fakeOuterNumberSerialize(BigDecimal body) throws ApiException {
    return fakeOuterNumberSerializeWithHttpInfo(body).getData();
  }

  /**
   * 
   * Test serialization of outer number types
   * @param body Input number as post body (optional)
   * @return ApiResponse&lt;BigDecimal&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output number </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BigDecimal> fakeOuterNumberSerializeWithHttpInfo(BigDecimal body) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<BigDecimal> localVarReturnType = new GenericType<BigDecimal>() {};
    return apiClient.invokeAPI("FakeApi.fakeOuterNumberSerialize", "/fake/outer/number", "POST", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * Test serialization of outer string types
   * @param body Input string as post body (optional)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output string </td><td>  -  </td></tr>
     </table>
   */
  public String fakeOuterStringSerialize(String body) throws ApiException {
    return fakeOuterStringSerializeWithHttpInfo(body).getData();
  }

  /**
   * 
   * Test serialization of outer string types
   * @param body Input string as post body (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output string </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> fakeOuterStringSerializeWithHttpInfo(String body) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("FakeApi.fakeOuterStringSerialize", "/fake/outer/string", "POST", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Array of Enums
   * 
   * @return List&lt;OuterEnum&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Got named array of enums </td><td>  -  </td></tr>
     </table>
   */
  public List<OuterEnum> getArrayOfEnums() throws ApiException {
    return getArrayOfEnumsWithHttpInfo().getData();
  }

  /**
   * Array of Enums
   * 
   * @return ApiResponse&lt;List&lt;OuterEnum&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Got named array of enums </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<OuterEnum>> getArrayOfEnumsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<OuterEnum>> localVarReturnType = new GenericType<List<OuterEnum>>() {};
    return apiClient.invokeAPI("FakeApi.getArrayOfEnums", "/fake/array-of-enums", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
   * @param fileSchemaTestClass  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void testBodyWithFileSchema(FileSchemaTestClass fileSchemaTestClass) throws ApiException {
    testBodyWithFileSchemaWithHttpInfo(fileSchemaTestClass);
  }

  /**
   * 
   * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
   * @param fileSchemaTestClass  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testBodyWithFileSchemaWithHttpInfo(FileSchemaTestClass fileSchemaTestClass) throws ApiException {
    // Check required parameters
    if (fileSchemaTestClass == null) {
      throw new ApiException(400, "Missing the required parameter 'fileSchemaTestClass' when calling testBodyWithFileSchema");
    }

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("FakeApi.testBodyWithFileSchema", "/fake/body-with-file-schema", "PUT", new ArrayList<>(), fileSchemaTestClass,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param query  (required)
   * @param user  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void testBodyWithQueryParams(String query, User user) throws ApiException {
    testBodyWithQueryParamsWithHttpInfo(query, user);
  }

  /**
   * 
   * 
   * @param query  (required)
   * @param user  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testBodyWithQueryParamsWithHttpInfo(String query, User user) throws ApiException {
    // Check required parameters
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling testBodyWithQueryParams");
    }
    if (user == null) {
      throw new ApiException(400, "Missing the required parameter 'user' when calling testBodyWithQueryParams");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "query", query)
    );

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("FakeApi.testBodyWithQueryParams", "/fake/body-with-query-params", "PUT", localVarQueryParams, user,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * To test \&quot;client\&quot; model
   * To test \&quot;client\&quot; model
   * @param client client model (required)
   * @return Client
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public Client testClientModel(Client client) throws ApiException {
    return testClientModelWithHttpInfo(client).getData();
  }

  /**
   * To test \&quot;client\&quot; model
   * To test \&quot;client\&quot; model
   * @param client client model (required)
   * @return ApiResponse&lt;Client&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Client> testClientModelWithHttpInfo(Client client) throws ApiException {
    // Check required parameters
    if (client == null) {
      throw new ApiException(400, "Missing the required parameter 'client' when calling testClientModel");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Client> localVarReturnType = new GenericType<Client>() {};
    return apiClient.invokeAPI("FakeApi.testClientModel", "/fake", "PATCH", new ArrayList<>(), client,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
   * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
   * @param number None (required)
   * @param _double None (required)
   * @param patternWithoutDelimiter None (required)
   * @param _byte None (required)
   * @param integer None (optional)
   * @param int32 None (optional)
   * @param int64 None (optional)
   * @param _float None (optional)
   * @param string None (optional)
   * @param binary None (optional)
   * @param date None (optional)
   * @param dateTime None (optional, default to 2010-02-01T10:20:10.111110+01:00)
   * @param password None (optional)
   * @param paramCallback None (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Invalid username supplied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
   */
  public void testEndpointParameters(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, File binary, LocalDate date, OffsetDateTime dateTime, String password, String paramCallback) throws ApiException {
    testEndpointParametersWithHttpInfo(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback);
  }

  /**
   * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
   * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
   * @param number None (required)
   * @param _double None (required)
   * @param patternWithoutDelimiter None (required)
   * @param _byte None (required)
   * @param integer None (optional)
   * @param int32 None (optional)
   * @param int64 None (optional)
   * @param _float None (optional)
   * @param string None (optional)
   * @param binary None (optional)
   * @param date None (optional)
   * @param dateTime None (optional, default to 2010-02-01T10:20:10.111110+01:00)
   * @param password None (optional)
   * @param paramCallback None (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Invalid username supplied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testEndpointParametersWithHttpInfo(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, File binary, LocalDate date, OffsetDateTime dateTime, String password, String paramCallback) throws ApiException {
    // Check required parameters
    if (number == null) {
      throw new ApiException(400, "Missing the required parameter 'number' when calling testEndpointParameters");
    }
    if (_double == null) {
      throw new ApiException(400, "Missing the required parameter '_double' when calling testEndpointParameters");
    }
    if (patternWithoutDelimiter == null) {
      throw new ApiException(400, "Missing the required parameter 'patternWithoutDelimiter' when calling testEndpointParameters");
    }
    if (_byte == null) {
      throw new ApiException(400, "Missing the required parameter '_byte' when calling testEndpointParameters");
    }

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (integer != null) {
      localVarFormParams.put("integer", integer);
    }
    if (int32 != null) {
      localVarFormParams.put("int32", int32);
    }
    if (int64 != null) {
      localVarFormParams.put("int64", int64);
    }
    localVarFormParams.put("number", number);
    if (_float != null) {
      localVarFormParams.put("float", _float);
    }
    localVarFormParams.put("double", _double);
    if (string != null) {
      localVarFormParams.put("string", string);
    }
    localVarFormParams.put("pattern_without_delimiter", patternWithoutDelimiter);
    localVarFormParams.put("byte", _byte);
    if (binary != null) {
      localVarFormParams.put("binary", binary);
    }
    if (date != null) {
      localVarFormParams.put("date", date);
    }
    if (dateTime != null) {
      localVarFormParams.put("dateTime", dateTime);
    }
    if (password != null) {
      localVarFormParams.put("password", password);
    }
    if (paramCallback != null) {
      localVarFormParams.put("callback", paramCallback);
    }

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/x-www-form-urlencoded");
    String[] localVarAuthNames = new String[] {"http_basic_test"};
    return apiClient.invokeAPI("FakeApi.testEndpointParameters", "/fake", "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * To test enum parameters
   * To test enum parameters
   * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
   * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
   * @param enumQueryStringArray Query parameter enum test (string array) (optional)
   * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
   * @param enumQueryInteger Query parameter enum test (double) (optional)
   * @param enumQueryDouble Query parameter enum test (double) (optional)
   * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
   * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public void testEnumParameters(List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble, List<String> enumFormStringArray, String enumFormString) throws ApiException {
    testEnumParametersWithHttpInfo(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumFormStringArray, enumFormString);
  }

  /**
   * To test enum parameters
   * To test enum parameters
   * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
   * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
   * @param enumQueryStringArray Query parameter enum test (string array) (optional)
   * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
   * @param enumQueryInteger Query parameter enum test (double) (optional)
   * @param enumQueryDouble Query parameter enum test (double) (optional)
   * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
   * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testEnumParametersWithHttpInfo(List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble, List<String> enumFormStringArray, String enumFormString) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("multi", "enum_query_string_array", enumQueryStringArray)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enum_query_string", enumQueryString));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enum_query_integer", enumQueryInteger));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enum_query_double", enumQueryDouble));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (enumHeaderStringArray != null) {
      localVarHeaderParams.put("enum_header_string_array", apiClient.parameterToString(enumHeaderStringArray));
    }
    if (enumHeaderString != null) {
      localVarHeaderParams.put("enum_header_string", apiClient.parameterToString(enumHeaderString));
    }

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (enumFormStringArray != null) {
      localVarFormParams.put("enum_form_string_array", enumFormStringArray);
    }
    if (enumFormString != null) {
      localVarFormParams.put("enum_form_string", enumFormString);
    }

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/x-www-form-urlencoded");
    return apiClient.invokeAPI("FakeApi.testEnumParameters", "/fake", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               null, null, false);
  }

private ApiResponse<Void> testGroupParametersWithHttpInfo(Integer requiredStringGroup, Boolean requiredBooleanGroup, Long requiredInt64Group, Integer stringGroup, Boolean booleanGroup, Long int64Group) throws ApiException {
    // Check required parameters
    if (requiredStringGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'requiredStringGroup' when calling testGroupParameters");
    }
    if (requiredBooleanGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'requiredBooleanGroup' when calling testGroupParameters");
    }
    if (requiredInt64Group == null) {
      throw new ApiException(400, "Missing the required parameter 'requiredInt64Group' when calling testGroupParameters");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "required_string_group", requiredStringGroup)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "required_int64_group", requiredInt64Group));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "string_group", stringGroup));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "int64_group", int64Group));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("required_boolean_group", apiClient.parameterToString(requiredBooleanGroup));
    if (booleanGroup != null) {
      localVarHeaderParams.put("boolean_group", apiClient.parameterToString(booleanGroup));
    }

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearer_test"};
    return apiClient.invokeAPI("FakeApi.testGroupParameters", "/fake", "DELETE", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APItestGroupParametersRequest {
    private Integer requiredStringGroup;
    private Boolean requiredBooleanGroup;
    private Long requiredInt64Group;
    private Integer stringGroup;
    private Boolean booleanGroup;
    private Long int64Group;

    private APItestGroupParametersRequest() {
    }

    /**
     * Set requiredStringGroup
     * @param requiredStringGroup Required String in group parameters (required)
     * @return APItestGroupParametersRequest
     */
    public APItestGroupParametersRequest requiredStringGroup(Integer requiredStringGroup) {
      this.requiredStringGroup = requiredStringGroup;
      return this;
    }

    /**
     * Set requiredBooleanGroup
     * @param requiredBooleanGroup Required Boolean in group parameters (required)
     * @return APItestGroupParametersRequest
     */
    public APItestGroupParametersRequest requiredBooleanGroup(Boolean requiredBooleanGroup) {
      this.requiredBooleanGroup = requiredBooleanGroup;
      return this;
    }

    /**
     * Set requiredInt64Group
     * @param requiredInt64Group Required Integer in group parameters (required)
     * @return APItestGroupParametersRequest
     */
    public APItestGroupParametersRequest requiredInt64Group(Long requiredInt64Group) {
      this.requiredInt64Group = requiredInt64Group;
      return this;
    }

    /**
     * Set stringGroup
     * @param stringGroup String in group parameters (optional)
     * @return APItestGroupParametersRequest
     */
    public APItestGroupParametersRequest stringGroup(Integer stringGroup) {
      this.stringGroup = stringGroup;
      return this;
    }

    /**
     * Set booleanGroup
     * @param booleanGroup Boolean in group parameters (optional)
     * @return APItestGroupParametersRequest
     */
    public APItestGroupParametersRequest booleanGroup(Boolean booleanGroup) {
      this.booleanGroup = booleanGroup;
      return this;
    }

    /**
     * Set int64Group
     * @param int64Group Integer in group parameters (optional)
     * @return APItestGroupParametersRequest
     */
    public APItestGroupParametersRequest int64Group(Long int64Group) {
      this.int64Group = int64Group;
      return this;
    }

    /**
     * Execute testGroupParameters request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 400 </td><td> Something wrong </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute testGroupParameters request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 400 </td><td> Something wrong </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return testGroupParametersWithHttpInfo(requiredStringGroup, requiredBooleanGroup, requiredInt64Group, stringGroup, booleanGroup, int64Group);
    }
  }

  /**
   * Fake endpoint to test group parameters (optional)
   * Fake endpoint to test group parameters (optional)
   * @return testGroupParametersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APItestGroupParametersRequest testGroupParameters() throws ApiException {
    return new APItestGroupParametersRequest();
  }
  /**
   * test inline additionalProperties
   * 
   * @param requestBody request body (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public void testInlineAdditionalProperties(Map<String, String> requestBody) throws ApiException {
    testInlineAdditionalPropertiesWithHttpInfo(requestBody);
  }

  /**
   * test inline additionalProperties
   * 
   * @param requestBody request body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testInlineAdditionalPropertiesWithHttpInfo(Map<String, String> requestBody) throws ApiException {
    // Check required parameters
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling testInlineAdditionalProperties");
    }

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("FakeApi.testInlineAdditionalProperties", "/fake/inline-additionalProperties", "POST", new ArrayList<>(), requestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * test inline free-form additionalProperties
   * 
   * @param testInlineFreeformAdditionalPropertiesRequest request body (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public void testInlineFreeformAdditionalProperties(TestInlineFreeformAdditionalPropertiesRequest testInlineFreeformAdditionalPropertiesRequest) throws ApiException {
    testInlineFreeformAdditionalPropertiesWithHttpInfo(testInlineFreeformAdditionalPropertiesRequest);
  }

  /**
   * test inline free-form additionalProperties
   * 
   * @param testInlineFreeformAdditionalPropertiesRequest request body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testInlineFreeformAdditionalPropertiesWithHttpInfo(TestInlineFreeformAdditionalPropertiesRequest testInlineFreeformAdditionalPropertiesRequest) throws ApiException {
    // Check required parameters
    if (testInlineFreeformAdditionalPropertiesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'testInlineFreeformAdditionalPropertiesRequest' when calling testInlineFreeformAdditionalProperties");
    }

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("FakeApi.testInlineFreeformAdditionalProperties", "/fake/inline-freeform-additionalProperties", "POST", new ArrayList<>(), testInlineFreeformAdditionalPropertiesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * test json serialization of form data
   * 
   * @param param field1 (required)
   * @param param2 field2 (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public void testJsonFormData(String param, String param2) throws ApiException {
    testJsonFormDataWithHttpInfo(param, param2);
  }

  /**
   * test json serialization of form data
   * 
   * @param param field1 (required)
   * @param param2 field2 (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testJsonFormDataWithHttpInfo(String param, String param2) throws ApiException {
    // Check required parameters
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling testJsonFormData");
    }
    if (param2 == null) {
      throw new ApiException(400, "Missing the required parameter 'param2' when calling testJsonFormData");
    }

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams.put("param", param);
    localVarFormParams.put("param2", param2);

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/x-www-form-urlencoded");
    return apiClient.invokeAPI("FakeApi.testJsonFormData", "/fake/jsonFormData", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * To test the collection format in query parameters
   * @param pipe  (required)
   * @param ioutil  (required)
   * @param http  (required)
   * @param url  (required)
   * @param context  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void testQueryParameterCollectionFormat(List<String> pipe, List<String> ioutil, List<String> http, List<String> url, List<String> context) throws ApiException {
    testQueryParameterCollectionFormatWithHttpInfo(pipe, ioutil, http, url, context);
  }

  /**
   * 
   * To test the collection format in query parameters
   * @param pipe  (required)
   * @param ioutil  (required)
   * @param http  (required)
   * @param url  (required)
   * @param context  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testQueryParameterCollectionFormatWithHttpInfo(List<String> pipe, List<String> ioutil, List<String> http, List<String> url, List<String> context) throws ApiException {
    // Check required parameters
    if (pipe == null) {
      throw new ApiException(400, "Missing the required parameter 'pipe' when calling testQueryParameterCollectionFormat");
    }
    if (ioutil == null) {
      throw new ApiException(400, "Missing the required parameter 'ioutil' when calling testQueryParameterCollectionFormat");
    }
    if (http == null) {
      throw new ApiException(400, "Missing the required parameter 'http' when calling testQueryParameterCollectionFormat");
    }
    if (url == null) {
      throw new ApiException(400, "Missing the required parameter 'url' when calling testQueryParameterCollectionFormat");
    }
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling testQueryParameterCollectionFormat");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("multi", "pipe", pipe)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ioutil", ioutil));
    localVarQueryParams.addAll(apiClient.parameterToPairs("ssv", "http", http));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "url", url));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "context", context));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("FakeApi.testQueryParameterCollectionFormat", "/fake/test-query-parameters", "PUT", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
