package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.StoragePool;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AccountStoragePoolsService {

    @GET("accounts/{projectId}/storagePool")
    Call<TypeCollection<StoragePool>> list(@Path("projectId") String projectId);

    @GET("accounts/{projectId}/storagePool")
    Call<TypeCollection<StoragePool>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("accounts/{projectId}/storagePool/{id}")
    Call<StoragePool> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("accounts/{projectId}/storagePool")
    Call<StoragePool> create(@Path("projectId") String projectId, @Body StoragePool storagePool);

    @PUT("accounts/{projectId}/storagePool/{id}")
    Call<StoragePool> update(@Path("projectId") String projectId, @Path("id") String id, @Body StoragePool storagePool);

    @DELETE("accounts/{projectId}/storagePool/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/storagePool/{id}?action=activate")
    Call<StoragePool> activate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/storagePool/{id}?action=deactivate")
    Call<StoragePool> deactivate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/storagePool/{id}?action=purge")
    Call<StoragePool> purge(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/storagePool/{id}?action=remove")
    Call<StoragePool> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
