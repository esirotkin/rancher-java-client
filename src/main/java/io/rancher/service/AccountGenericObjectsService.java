package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GenericObject;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AccountGenericObjectsService {

    @GET("accounts/{projectId}/genericObject")
    Call<TypeCollection<GenericObject>> list(@Path("projectId") String projectId);

    @GET("accounts/{projectId}/genericObject")
    Call<TypeCollection<GenericObject>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("accounts/{projectId}/genericObject/{id}")
    Call<GenericObject> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("accounts/{projectId}/genericObject")
    Call<GenericObject> create(@Path("projectId") String projectId, @Body GenericObject genericObject);

    @PUT("accounts/{projectId}/genericObject/{id}")
    Call<GenericObject> update(@Path("projectId") String projectId, @Path("id") String id, @Body GenericObject genericObject);

    @DELETE("accounts/{projectId}/genericObject/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/genericObject/{id}?action=remove")
    Call<GenericObject> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
