package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Network;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NetworkDriverNetworksService {

    @GET("networkDrivers/{projectId}/network")
    Call<TypeCollection<Network>> list(@Path("projectId") String projectId);

    @GET("networkDrivers/{projectId}/network")
    Call<TypeCollection<Network>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("networkDrivers/{projectId}/network/{id}")
    Call<Network> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("networkDrivers/{projectId}/network")
    Call<Network> create(@Path("projectId") String projectId, @Body Network network);

    @PUT("networkDrivers/{projectId}/network/{id}")
    Call<Network> update(@Path("projectId") String projectId, @Path("id") String id, @Body Network network);

    @DELETE("networkDrivers/{projectId}/network/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("networkDrivers/{projectId}/network/{id}?action=activate")
    Call<Network> activate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("networkDrivers/{projectId}/network/{id}?action=deactivate")
    Call<Network> deactivate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("networkDrivers/{projectId}/network/{id}?action=purge")
    Call<Network> purge(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("networkDrivers/{projectId}/network/{id}?action=remove")
    Call<Network> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
