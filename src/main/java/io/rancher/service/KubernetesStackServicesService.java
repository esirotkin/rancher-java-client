package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Service;
import io.rancher.type.AddRemoveServiceLinkInput;
import io.rancher.type.SetServiceLinksInput;
import io.rancher.type.ServiceRestart;
import io.rancher.type.ServiceUpgrade;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface KubernetesStackServicesService {

    @GET("kubernetesStacks/{projectId}/service")
    Call<TypeCollection<Service>> list(@Path("projectId") String projectId);

    @GET("kubernetesStacks/{projectId}/service")
    Call<TypeCollection<Service>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("kubernetesStacks/{projectId}/service/{id}")
    Call<Service> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("kubernetesStacks/{projectId}/service")
    Call<Service> create(@Path("projectId") String projectId, @Body Service service);

    @PUT("kubernetesStacks/{projectId}/service/{id}")
    Call<Service> update(@Path("projectId") String projectId, @Path("id") String id, @Body Service service);

    @DELETE("kubernetesStacks/{projectId}/service/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("kubernetesStacks/{projectId}/service/{id}?action=activate")
    Call<Service> activate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("kubernetesStacks/{projectId}/service/{id}?action=addservicelink")
    Call<Service> addservicelink(@Path("projectId") String projectId, @Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);
    
    @POST("kubernetesStacks/{projectId}/service/{id}?action=cancelupgrade")
    Call<Service> cancelupgrade(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("kubernetesStacks/{projectId}/service/{id}?action=continueupgrade")
    Call<Service> continueupgrade(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("kubernetesStacks/{projectId}/service/{id}?action=deactivate")
    Call<Service> deactivate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("kubernetesStacks/{projectId}/service/{id}?action=finishupgrade")
    Call<Service> finishupgrade(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("kubernetesStacks/{projectId}/service/{id}?action=remove")
    Call<Service> remove(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("kubernetesStacks/{projectId}/service/{id}?action=removeservicelink")
    Call<Service> removeservicelink(@Path("projectId") String projectId, @Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);
    
    @POST("kubernetesStacks/{projectId}/service/{id}?action=restart")
    Call<Service> restart(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceRestart serviceRestart);
    
    @POST("kubernetesStacks/{projectId}/service/{id}?action=rollback")
    Call<Service> rollback(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("kubernetesStacks/{projectId}/service/{id}?action=setservicelinks")
    Call<Service> setservicelinks(@Path("projectId") String projectId, @Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput);
    
    @POST("kubernetesStacks/{projectId}/service/{id}?action=upgrade")
    Call<Service> upgrade(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceUpgrade serviceUpgrade);
    
}
