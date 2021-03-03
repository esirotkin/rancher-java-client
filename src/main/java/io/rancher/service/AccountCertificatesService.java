package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Certificate;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AccountCertificatesService {

    @GET("accounts/{projectId}/certificate")
    Call<TypeCollection<Certificate>> list(@Path("projectId") String projectId);

    @GET("accounts/{projectId}/certificate")
    Call<TypeCollection<Certificate>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("accounts/{projectId}/certificate/{id}")
    Call<Certificate> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("accounts/{projectId}/certificate")
    Call<Certificate> create(@Path("projectId") String projectId, @Body Certificate certificate);

    @PUT("accounts/{projectId}/certificate/{id}")
    Call<Certificate> update(@Path("projectId") String projectId, @Path("id") String id, @Body Certificate certificate);

    @DELETE("accounts/{projectId}/certificate/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/certificate/{id}?action=remove")
    Call<Certificate> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
