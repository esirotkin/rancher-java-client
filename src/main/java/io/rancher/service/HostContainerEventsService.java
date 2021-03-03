package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ContainerEvent;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface HostContainerEventsService {

    @GET("hosts/{projectId}/containerEvent")
    Call<TypeCollection<ContainerEvent>> list(@Path("projectId") String projectId);

    @GET("hosts/{projectId}/containerEvent")
    Call<TypeCollection<ContainerEvent>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("hosts/{projectId}/containerEvent/{id}")
    Call<ContainerEvent> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("hosts/{projectId}/containerEvent")
    Call<ContainerEvent> create(@Path("projectId") String projectId, @Body ContainerEvent containerEvent);

    @PUT("hosts/{projectId}/containerEvent/{id}")
    Call<ContainerEvent> update(@Path("projectId") String projectId, @Path("id") String id, @Body ContainerEvent containerEvent);

    @DELETE("hosts/{projectId}/containerEvent/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("hosts/{projectId}/containerEvent/{id}?action=remove")
    Call<ContainerEvent> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
