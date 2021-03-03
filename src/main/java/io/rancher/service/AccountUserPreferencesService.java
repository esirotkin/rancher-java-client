package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.UserPreference;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AccountUserPreferencesService {

    @GET("accounts/{projectId}/userPreference")
    Call<TypeCollection<UserPreference>> list(@Path("projectId") String projectId);

    @GET("accounts/{projectId}/userPreference")
    Call<TypeCollection<UserPreference>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("accounts/{projectId}/userPreference/{id}")
    Call<UserPreference> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("accounts/{projectId}/userPreference")
    Call<UserPreference> create(@Path("projectId") String projectId, @Body UserPreference userPreference);

    @PUT("accounts/{projectId}/userPreference/{id}")
    Call<UserPreference> update(@Path("projectId") String projectId, @Path("id") String id, @Body UserPreference userPreference);

    @DELETE("accounts/{projectId}/userPreference/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/userPreference/{id}?action=activate")
    Call<UserPreference> activate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/userPreference/{id}?action=deactivate")
    Call<UserPreference> deactivate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/userPreference/{id}?action=purge")
    Call<UserPreference> purge(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/userPreference/{id}?action=remove")
    Call<UserPreference> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
