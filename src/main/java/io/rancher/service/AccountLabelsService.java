package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Label;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AccountLabelsService {

    @GET("accounts/{projectId}/label")
    Call<TypeCollection<Label>> list(@Path("projectId") String projectId);

    @GET("accounts/{projectId}/label")
    Call<TypeCollection<Label>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("accounts/{projectId}/label/{id}")
    Call<Label> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("accounts/{projectId}/label")
    Call<Label> create(@Path("projectId") String projectId, @Body Label label);

    @PUT("accounts/{projectId}/label/{id}")
    Call<Label> update(@Path("projectId") String projectId, @Path("id") String id, @Body Label label);

    @DELETE("accounts/{projectId}/label/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/label/{id}?action=remove")
    Call<Label> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
