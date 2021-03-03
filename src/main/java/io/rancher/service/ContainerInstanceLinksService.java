package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.InstanceLink;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ContainerInstanceLinksService {

    @GET("containers/{projectId}/instanceLink")
    Call<TypeCollection<InstanceLink>> list(@Path("projectId") String projectId);

    @GET("containers/{projectId}/instanceLink")
    Call<TypeCollection<InstanceLink>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("containers/{projectId}/instanceLink/{id}")
    Call<InstanceLink> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("containers/{projectId}/instanceLink")
    Call<InstanceLink> create(@Path("projectId") String projectId, @Body InstanceLink instanceLink);

    @PUT("containers/{projectId}/instanceLink/{id}")
    Call<InstanceLink> update(@Path("projectId") String projectId, @Path("id") String id, @Body InstanceLink instanceLink);

    @DELETE("containers/{projectId}/instanceLink/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("containers/{projectId}/instanceLink/{id}?action=activate")
    Call<InstanceLink> activate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("containers/{projectId}/instanceLink/{id}?action=deactivate")
    Call<InstanceLink> deactivate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("containers/{projectId}/instanceLink/{id}?action=purge")
    Call<InstanceLink> purge(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("containers/{projectId}/instanceLink/{id}?action=remove")
    Call<InstanceLink> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
