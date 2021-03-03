package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.HostTemplate;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AccountHostTemplatesService {

    @GET("accounts/{projectId}/hostTemplate")
    Call<TypeCollection<HostTemplate>> list(@Path("projectId") String projectId);

    @GET("accounts/{projectId}/hostTemplate")
    Call<TypeCollection<HostTemplate>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("accounts/{projectId}/hostTemplate/{id}")
    Call<HostTemplate> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("accounts/{projectId}/hostTemplate")
    Call<HostTemplate> create(@Path("projectId") String projectId, @Body HostTemplate hostTemplate);

    @PUT("accounts/{projectId}/hostTemplate/{id}")
    Call<HostTemplate> update(@Path("projectId") String projectId, @Path("id") String id, @Body HostTemplate hostTemplate);

    @DELETE("accounts/{projectId}/hostTemplate/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/hostTemplate/{id}?action=remove")
    Call<HostTemplate> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
