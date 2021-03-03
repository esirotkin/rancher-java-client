package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.VolumeTemplate;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface KubernetesStackVolumeTemplatesService {

    @GET("kubernetesStacks/{projectId}/volumeTemplate")
    Call<TypeCollection<VolumeTemplate>> list(@Path("projectId") String projectId);

    @GET("kubernetesStacks/{projectId}/volumeTemplate")
    Call<TypeCollection<VolumeTemplate>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("kubernetesStacks/{projectId}/volumeTemplate/{id}")
    Call<VolumeTemplate> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("kubernetesStacks/{projectId}/volumeTemplate")
    Call<VolumeTemplate> create(@Path("projectId") String projectId, @Body VolumeTemplate volumeTemplate);

    @PUT("kubernetesStacks/{projectId}/volumeTemplate/{id}")
    Call<VolumeTemplate> update(@Path("projectId") String projectId, @Path("id") String id, @Body VolumeTemplate volumeTemplate);

    @DELETE("kubernetesStacks/{projectId}/volumeTemplate/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("kubernetesStacks/{projectId}/volumeTemplate/{id}?action=activate")
    Call<VolumeTemplate> activate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("kubernetesStacks/{projectId}/volumeTemplate/{id}?action=deactivate")
    Call<VolumeTemplate> deactivate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("kubernetesStacks/{projectId}/volumeTemplate/{id}?action=purge")
    Call<VolumeTemplate> purge(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("kubernetesStacks/{projectId}/volumeTemplate/{id}?action=remove")
    Call<VolumeTemplate> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
