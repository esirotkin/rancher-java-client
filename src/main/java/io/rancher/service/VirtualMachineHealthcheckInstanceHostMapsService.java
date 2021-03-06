package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.HealthcheckInstanceHostMap;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface VirtualMachineHealthcheckInstanceHostMapsService {

    @GET("virtualMachines/{projectId}/healthcheckInstanceHostMap")
    Call<TypeCollection<HealthcheckInstanceHostMap>> list(@Path("projectId") String projectId);

    @GET("virtualMachines/{projectId}/healthcheckInstanceHostMap")
    Call<TypeCollection<HealthcheckInstanceHostMap>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("virtualMachines/{projectId}/healthcheckInstanceHostMap/{id}")
    Call<HealthcheckInstanceHostMap> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("virtualMachines/{projectId}/healthcheckInstanceHostMap")
    Call<HealthcheckInstanceHostMap> create(@Path("projectId") String projectId, @Body HealthcheckInstanceHostMap healthcheckInstanceHostMap);

    @PUT("virtualMachines/{projectId}/healthcheckInstanceHostMap/{id}")
    Call<HealthcheckInstanceHostMap> update(@Path("projectId") String projectId, @Path("id") String id, @Body HealthcheckInstanceHostMap healthcheckInstanceHostMap);

    @DELETE("virtualMachines/{projectId}/healthcheckInstanceHostMap/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("virtualMachines/{projectId}/healthcheckInstanceHostMap/{id}?action=remove")
    Call<HealthcheckInstanceHostMap> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
