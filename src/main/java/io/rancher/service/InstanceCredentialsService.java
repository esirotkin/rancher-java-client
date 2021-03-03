package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Credential;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface InstanceCredentialsService {

    @GET("instances/{projectId}/credential")
    Call<TypeCollection<Credential>> list(@Path("projectId") String projectId);

    @GET("instances/{projectId}/credential")
    Call<TypeCollection<Credential>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("instances/{projectId}/credential/{id}")
    Call<Credential> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("instances/{projectId}/credential")
    Call<Credential> create(@Path("projectId") String projectId, @Body Credential credential);

    @PUT("instances/{projectId}/credential/{id}")
    Call<Credential> update(@Path("projectId") String projectId, @Path("id") String id, @Body Credential credential);

    @DELETE("instances/{projectId}/credential/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("instances/{projectId}/credential/{id}?action=activate")
    Call<Credential> activate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("instances/{projectId}/credential/{id}?action=deactivate")
    Call<Credential> deactivate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("instances/{projectId}/credential/{id}?action=purge")
    Call<Credential> purge(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("instances/{projectId}/credential/{id}?action=remove")
    Call<Credential> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
