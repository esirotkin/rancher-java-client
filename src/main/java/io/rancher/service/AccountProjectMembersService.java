package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectMember;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AccountProjectMembersService {

    @GET("accounts/{projectId}/projectMember")
    Call<TypeCollection<ProjectMember>> list(@Path("projectId") String projectId);

    @GET("accounts/{projectId}/projectMember")
    Call<TypeCollection<ProjectMember>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("accounts/{projectId}/projectMember/{id}")
    Call<ProjectMember> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("accounts/{projectId}/projectMember")
    Call<ProjectMember> create(@Path("projectId") String projectId, @Body ProjectMember projectMember);

    @PUT("accounts/{projectId}/projectMember/{id}")
    Call<ProjectMember> update(@Path("projectId") String projectId, @Path("id") String id, @Body ProjectMember projectMember);

    @DELETE("accounts/{projectId}/projectMember/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/projectMember/{id}?action=activate")
    Call<ProjectMember> activate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/projectMember/{id}?action=deactivate")
    Call<ProjectMember> deactivate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/projectMember/{id}?action=purge")
    Call<ProjectMember> purge(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("accounts/{projectId}/projectMember/{id}?action=remove")
    Call<ProjectMember> remove(@Path("projectId") String projectId, @Path("id") String id);
    
}
