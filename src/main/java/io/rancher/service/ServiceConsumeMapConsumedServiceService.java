package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Service;
import io.rancher.type.SetServiceLinksInput;
import io.rancher.type.ServiceRestart;
import io.rancher.type.ServiceUpgrade;
import io.rancher.type.AddRemoveServiceLinkInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ServiceConsumeMapConsumedServiceService {

    @GET("serviceConsumeMaps/{projectId}/service")
    Call<TypeCollection<Service>> list(@Path("projectId") String projectId);

    @GET("serviceConsumeMaps/{projectId}/service")
    Call<TypeCollection<Service>> list(@Path("projectId") String projectId, @QueryMap Filters filters);

    @GET("serviceConsumeMaps/{projectId}/service/{id}")
    Call<Service> get(@Path("projectId") String projectId, @Path("id") String id);

    @POST("serviceConsumeMaps/{projectId}/service")
    Call<Service> create(@Path("projectId") String projectId, @Body Service service);

    @PUT("serviceConsumeMaps/{projectId}/service/{id}")
    Call<Service> update(@Path("projectId") String projectId, @Path("id") String id, @Body Service service);

    @DELETE("serviceConsumeMaps/{projectId}/service/{id}")
    Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("serviceConsumeMaps/{projectId}/service/{id}?action=activate")
    Call<Service> activate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("serviceConsumeMaps/{projectId}/service/{id}?action=addservicelink")
    Call<Service> addservicelink(@Path("projectId") String projectId, @Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);
    
    @POST("serviceConsumeMaps/{projectId}/service/{id}?action=cancelupgrade")
    Call<Service> cancelupgrade(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("serviceConsumeMaps/{projectId}/service/{id}?action=continueupgrade")
    Call<Service> continueupgrade(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("serviceConsumeMaps/{projectId}/service/{id}?action=deactivate")
    Call<Service> deactivate(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("serviceConsumeMaps/{projectId}/service/{id}?action=finishupgrade")
    Call<Service> finishupgrade(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("serviceConsumeMaps/{projectId}/service/{id}?action=remove")
    Call<Service> remove(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("serviceConsumeMaps/{projectId}/service/{id}?action=removeservicelink")
    Call<Service> removeservicelink(@Path("projectId") String projectId, @Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);
    
    @POST("serviceConsumeMaps/{projectId}/service/{id}?action=restart")
    Call<Service> restart(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceRestart serviceRestart);
    
    @POST("serviceConsumeMaps/{projectId}/service/{id}?action=rollback")
    Call<Service> rollback(@Path("projectId") String projectId, @Path("id") String id);
    
    @POST("serviceConsumeMaps/{projectId}/service/{id}?action=setservicelinks")
    Call<Service> setservicelinks(@Path("projectId") String projectId, @Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput);
    
    @POST("serviceConsumeMaps/{projectId}/service/{id}?action=upgrade")
    Call<Service> upgrade(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceUpgrade serviceUpgrade);
    
}
