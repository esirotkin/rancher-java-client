package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceConsumeMap;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AccountServiceConsumeMapsService {

    @GET("accounts/{projectId}/serviceConsumeMap")
    Call<TypeCollection<ServiceConsumeMap>> list(@Path("projectId") String projectId);

    @GET("accounts/{projectId}/serviceConsumeMap")
    Call<TypeCollection<ServiceConsumeMap>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("accounts/{projectId}/serviceConsumeMap/{id}")
    Call<ServiceConsumeMap> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("accounts/{projectId}/serviceConsumeMap")
    Call<ServiceConsumeMap> create(@Path("projectId") String projectId, @Body ServiceConsumeMap serviceConsumeMap);

    @PUT("accounts/{projectId}/serviceConsumeMap/{id}")
    Call<ServiceConsumeMap> update(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceConsumeMap serviceConsumeMap);

    @DELETE("accounts/{projectId}/serviceConsumeMap/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/serviceConsumeMap/{id}?action=remove")
    Call<ServiceConsumeMap> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
