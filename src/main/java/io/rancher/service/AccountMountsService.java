package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Mount;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AccountMountsService {

    @GET("accounts/{projectId}/mount")
    Call<TypeCollection<Mount>> list(@Path("projectId") String projectId);

    @GET("accounts/{projectId}/mount")
    Call<TypeCollection<Mount>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("accounts/{projectId}/mount/{id}")
    Call<Mount> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("accounts/{projectId}/mount")
    Call<Mount> create(@Path("projectId") String projectId, @Body Mount mount);

    @PUT("accounts/{projectId}/mount/{id}")
    Call<Mount> update(@Path("projectId") String projectId, @Path("id") String id, @Body Mount mount);

    @DELETE("accounts/{projectId}/mount/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/mount/{id}?action=deactivate")
    Call<Mount> deactivate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/mount/{id}?action=remove")
    Call<Mount> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
