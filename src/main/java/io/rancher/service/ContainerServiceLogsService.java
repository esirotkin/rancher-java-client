package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceLog;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ContainerServiceLogsService {

    @GET("containers/{projectId}/serviceLog")
    Call<TypeCollection<ServiceLog>> list(@Path("projectId") String projectId);

    @GET("containers/{projectId}/serviceLog")
    Call<TypeCollection<ServiceLog>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("containers/{projectId}/serviceLog/{id}")
    Call<ServiceLog> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("containers/{projectId}/serviceLog")
    Call<ServiceLog> create(@Path("projectId") String projectId, @Body ServiceLog serviceLog);

    @PUT("containers/{projectId}/serviceLog/{id}")
    Call<ServiceLog> update(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceLog serviceLog);

    @DELETE("containers/{projectId}/serviceLog/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
}
