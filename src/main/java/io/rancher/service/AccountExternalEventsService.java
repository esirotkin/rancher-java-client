package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExternalEvent;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AccountExternalEventsService {

    @GET("accounts/{projectId}/externalEvent")
    Call<TypeCollection<ExternalEvent>> list(@Path("projectId") String projectId);

    @GET("accounts/{projectId}/externalEvent")
    Call<TypeCollection<ExternalEvent>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("accounts/{projectId}/externalEvent/{id}")
    Call<ExternalEvent> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("accounts/{projectId}/externalEvent")
    Call<ExternalEvent> create(@Path("projectId") String projectId, @Body ExternalEvent externalEvent);

    @PUT("accounts/{projectId}/externalEvent/{id}")
    Call<ExternalEvent> update(@Path("projectId") String projectId, @Path("id") String id, @Body ExternalEvent externalEvent);

    @DELETE("accounts/{projectId}/externalEvent/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/externalEvent/{id}?action=remove")
    Call<ExternalEvent> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
