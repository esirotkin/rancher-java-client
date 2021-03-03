package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NetworkDriver;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AccountNetworkDriversService {

    @GET("accounts/{projectId}/networkDriver")
    Call<TypeCollection<NetworkDriver>> list(@Path("projectId") String projectId);

    @GET("accounts/{projectId}/networkDriver")
    Call<TypeCollection<NetworkDriver>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("accounts/{projectId}/networkDriver/{id}")
    Call<NetworkDriver> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("accounts/{projectId}/networkDriver")
    Call<NetworkDriver> create(@Path("projectId") String projectId, @Body NetworkDriver networkDriver);

    @PUT("accounts/{projectId}/networkDriver/{id}")
    Call<NetworkDriver> update(@Path("projectId") String projectId, @Path("id") String id, @Body NetworkDriver networkDriver);

    @DELETE("accounts/{projectId}/networkDriver/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/networkDriver/{id}?action=activate")
    Call<NetworkDriver> activate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/networkDriver/{id}?action=deactivate")
    Call<NetworkDriver> deactivate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/networkDriver/{id}?action=remove")
    Call<NetworkDriver> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
