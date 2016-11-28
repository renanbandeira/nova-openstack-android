package com.trabalhoopenstack.nova.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class Server {
  String id;
  String name;
  Link[] links;
  Map<String, String> metadata;
  String hostId;
  Status status;
  @SerializedName("user_id") String userId;
  @SerializedName("security_groups") SecurityGroup[] securityGroups;

  public Server() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Link[] getLinks() {
    return links;
  }

  public void setLinks(Link[] links) {
    this.links = links;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public String getHostId() {
    return hostId;
  }

  public void setHostId(String hostId) {
    this.hostId = hostId;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public SecurityGroup[] getSecurityGroups() {
    return securityGroups;
  }

  public void setSecurityGroups(SecurityGroup[] securityGroups) {
    this.securityGroups = securityGroups;
  }

  public class ServerAddresses {
    @SerializedName("private") Address[] privateAddress;

    public ServerAddresses() {
    }

    public Address[] getPrivateAddress() {
      return privateAddress;
    }

    public void setPrivateAddress(Address[] privateAddress) {
      this.privateAddress = privateAddress;
    }
  }

  public enum Status {
    ACTIVE, BUILDING, DELETED, ERROR, HARD_REBOOT,
    MIGRATING, PAUSED, REBOOT, PASSWORD, REBUILD, RESCUED, UNKNOWN
  }
}
