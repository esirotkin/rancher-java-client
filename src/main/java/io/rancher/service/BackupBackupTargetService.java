package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.BackupTarget;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface BackupBackupTargetService {

    @GET("backups/{projectId}/backupTarget")
    Call<TypeCollection<BackupTarget>> list(@Path("projectId") String projectId);

    @GET("backups/{projectId}/backupTarget")
    Call<TypeCollection<BackupTarget>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("backups/{projectId}/backupTarget/{id}")
    Call<BackupTarget> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("backups/{projectId}/backupTarget")
    Call<BackupTarget> create(@Path("projectId") String projectId, @Body BackupTarget backupTarget);

    @PUT("backups/{projectId}/backupTarget/{id}")
    Call<BackupTarget> update(@Path("projectId") String projectId, @Path("id") String id, @Body BackupTarget backupTarget);

    @DELETE("backups/{projectId}/backupTarget/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("backups/{projectId}/backupTarget/{id}?action=remove")
    Call<BackupTarget> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
