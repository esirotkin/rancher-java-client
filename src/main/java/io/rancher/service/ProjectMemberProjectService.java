package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Project;
import io.rancher.type.Account;
import io.rancher.type.SetProjectMembersInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProjectMemberProjectService {

    @GET("projectMembers/{projectId}/project")
    Call<TypeCollection<Project>> list(@Path("projectId") String projectId);

    @GET("projectMembers/{projectId}/project")
    Call<TypeCollection<Project>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("projectMembers/{projectId}/project/{id}")
    Call<Project> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("projectMembers/{projectId}/project")
    Call<Project> create(@Path("projectId") String projectId, @Body Project project);

    @PUT("projectMembers/{projectId}/project/{id}")
    Call<Project> update(@Path("projectId") String projectId, @Path("id") String id, @Body Project project);

    @DELETE("projectMembers/{projectId}/project/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("projectMembers/{projectId}/project/{id}?action=activate")
    Call<Account> activate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("projectMembers/{projectId}/project/{id}?action=deactivate")
    Call<Account> deactivate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("projectMembers/{projectId}/project/{id}?action=purge")
    Call<Account> purge(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("projectMembers/{projectId}/project/{id}?action=remove")
    Call<Account> remove(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("projectMembers/{projectId}/project/{id}?action=setmembers")
    Call<SetProjectMembersInput> setmembers(@Path("projectId") String projectId, @Path("id") String id, @Body SetProjectMembersInput setProjectMembersInput);
    
    @POST("projectMembers/{projectId}/project/{id}?action=upgrade")
    Call<Account> upgrade(@Path("projectId") String projectId, @Path("id") String id);
    
}
