package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Snapshot;
import io.rancher.type.SnapshotBackupInput;
import io.rancher.type.Backup;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AccountSnapshotsService {

    @GET("accounts/{projectId}/snapshot")
    Call<TypeCollection<Snapshot>> list(@Path("projectId") String projectId);

    @GET("accounts/{projectId}/snapshot")
    Call<TypeCollection<Snapshot>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("accounts/{projectId}/snapshot/{id}")
    Call<Snapshot> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("accounts/{projectId}/snapshot")
    Call<Snapshot> create(@Path("projectId") String projectId, @Body Snapshot snapshot);

    @PUT("accounts/{projectId}/snapshot/{id}")
    Call<Snapshot> update(@Path("projectId") String projectId, @Path("id") String id, @Body Snapshot snapshot);

    @DELETE("accounts/{projectId}/snapshot/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/snapshot/{id}?action=backup")
    Call<Backup> backup(@Path("projectId") String projectId, @Path("id") String id, @Body SnapshotBackupInput snapshotBackupInput);
    
    @POST("accounts/{projectId}/snapshot/{id}?action=remove")
    Call<Snapshot> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
