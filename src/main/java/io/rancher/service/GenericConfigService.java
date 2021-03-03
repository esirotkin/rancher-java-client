package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GenericConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GenericConfigService {

    @GET("genericConfig")
    Call<TypeCollection<GenericConfig>> list();

    @GET("genericConfig")
    Call<TypeCollection<GenericConfig>> list(@QueryMap Filters filters);

    @GET("genericConfig/{id}")
    Call<GenericConfig> get(@Path("id") String id);

    @POST("genericConfig")
    Call<GenericConfig> create(@Body GenericConfig genericConfig);

    @PUT("genericConfig/{id}")
    Call<GenericConfig> update(@Path("id") String id, @Body GenericConfig genericConfig);

    @DELETE("genericConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
