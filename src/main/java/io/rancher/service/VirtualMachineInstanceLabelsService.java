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

public interface VirtualMachineInstanceLabelsService {

    @GET("virtualMachines/{projectId}/label")
    Call<TypeCollection<Label>> list(@Path("projectId") String projectId);

    @GET("virtualMachines/{projectId}/label")
    Call<TypeCollection<Label>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("virtualMachines/{projectId}/label/{id}")
    Call<Label> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("virtualMachines/{projectId}/label")
    Call<Label> create(@Path("projectId") String projectId, @Body Label label);

    @PUT("virtualMachines/{projectId}/label/{id}")
    Call<Label> update(@Path("projectId") String projectId, @Path("id") String id, @Body Label label);

    @DELETE("virtualMachines/{projectId}/label/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("virtualMachines/{projectId}/label/{id}?action=remove")
    Call<Label> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
