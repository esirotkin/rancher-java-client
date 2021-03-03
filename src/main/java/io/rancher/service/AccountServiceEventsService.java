package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceEvent;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AccountServiceEventsService {

    @GET("accounts/{projectId}/serviceEvent")
    Call<TypeCollection<ServiceEvent>> list(@Path("projectId") String projectId);

    @GET("accounts/{projectId}/serviceEvent")
    Call<TypeCollection<ServiceEvent>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("accounts/{projectId}/serviceEvent/{id}")
    Call<ServiceEvent> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("accounts/{projectId}/serviceEvent")
    Call<ServiceEvent> create(@Path("projectId") String projectId, @Body ServiceEvent serviceEvent);

    @PUT("accounts/{projectId}/serviceEvent/{id}")
    Call<ServiceEvent> update(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceEvent serviceEvent);

    @DELETE("accounts/{projectId}/serviceEvent/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/serviceEvent/{id}?action=remove")
    Call<ServiceEvent> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
