package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Volume;
import io.rancher.type.RestoreFromBackupInput;
import io.rancher.type.RevertToSnapshotInput;
import io.rancher.type.VolumeSnapshotInput;
import io.rancher.type.Snapshot;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface HostVolumesService {

    @GET("hosts/{projectId}/volume")
    Call<TypeCollection<Volume>> list(@Path("projectId") String projectId);

    @GET("hosts/{projectId}/volume")
    Call<TypeCollection<Volume>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("hosts/{projectId}/volume/{id}")
    Call<Volume> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("hosts/{projectId}/volume")
    Call<Volume> create(@Path("projectId") String projectId, @Body Volume volume);

    @PUT("hosts/{projectId}/volume/{id}")
    Call<Volume> update(@Path("projectId") String projectId, @Path("id") String id, @Body Volume volume);

    @DELETE("hosts/{projectId}/volume/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("hosts/{projectId}/volume/{id}?action=allocate")
    Call<Volume> allocate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("hosts/{projectId}/volume/{id}?action=deallocate")
    Call<Volume> deallocate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("hosts/{projectId}/volume/{id}?action=purge")
    Call<Volume> purge(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("hosts/{projectId}/volume/{id}?action=remove")
    Call<Volume> remove(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("hosts/{projectId}/volume/{id}?action=restorefrombackup")
    Call<Volume> restorefrombackup(@Path("projectId") String projectId, @Path("id") String id, @Body RestoreFromBackupInput restoreFromBackupInput);
    
    @POST("hosts/{projectId}/volume/{id}?action=reverttosnapshot")
    Call<Volume> reverttosnapshot(@Path("projectId") String projectId, @Path("id") String id, @Body RevertToSnapshotInput revertToSnapshotInput);
    
    @POST("hosts/{projectId}/volume/{id}?action=snapshot")
    Call<Snapshot> snapshot(@Path("projectId") String projectId, @Path("id") String id, @Body VolumeSnapshotInput volumeSnapshotInput);
    
}
