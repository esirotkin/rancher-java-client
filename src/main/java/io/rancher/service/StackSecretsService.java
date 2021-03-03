package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Secret;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface StackSecretsService {

    @GET("stacks/{projectId}/secret")
    Call<TypeCollection<Secret>> list(@Path("projectId") String projectId);

    @GET("stacks/{projectId}/secret")
    Call<TypeCollection<Secret>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("stacks/{projectId}/secret/{id}")
    Call<Secret> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("stacks/{projectId}/secret")
    Call<Secret> create(@Path("projectId") String projectId, @Body Secret secret);

    @PUT("stacks/{projectId}/secret/{id}")
    Call<Secret> update(@Path("projectId") String projectId, @Path("id") String id, @Body Secret secret);

    @DELETE("stacks/{projectId}/secret/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("stacks/{projectId}/secret/{id}?action=remove")
    Call<Secret> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
