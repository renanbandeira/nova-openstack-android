package com.trabalhoopenstack.nova.ws;

import com.trabalhoopenstack.nova.model.Keypair;
import com.trabalhoopenstack.nova.model.SecurityGroup;
import com.trabalhoopenstack.nova.model.Server;
import com.trabalhoopenstack.nova.ws.request.CreateBackupRequest;
import com.trabalhoopenstack.nova.ws.request.CreateServerRequest;
import com.trabalhoopenstack.nova.ws.response.AdminPasswordResponse;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NovaService {

  @GET("/servers")
  Call<List<Server>> getServers();

  @GET("/servers/detail")
  Call<List<Server>> getServersDetailedList();

  @POST("/servers")
  Call<Server> createServer(@Body CreateServerRequest request);

  @GET("/servers/{id}")
  Call<Server> getServer(@Query("id") int serverId);

  @PUT("/servers/{id}")
  Call<Server> updateServer(@Query("id") int serverId);

  @POST("/servers/{id}/action")
  Call<Void> createBackup(@Query("id") int serverId, @Body CreateBackupRequest request);

  @DELETE("/servers/{id}")
  Call<Void> deleteServer(@Query("id") int serverId);

  @DELETE("/servers/{id}/os-server-password")
  Call<Void> clearAdminPassword(@Query("id") int serverId);

  @GET("/servers/{id}/os-server-password")
  Call<AdminPasswordResponse> getAdminPassword(@Query("id") int serverId);

  @GET("/servers/{id}/os-security-groups")
  Call<List<SecurityGroup>> getSecurityGroupsInServer(@Query("id") int serverId);

  @GET("/servers/{id}/ips")
  Call<Server.ServerAddresses> getIPsInServer(@Query("id") int serverId);

  @GET("/os-keypairs")
  Call<List<Keypair>> getKeypairs();


}
