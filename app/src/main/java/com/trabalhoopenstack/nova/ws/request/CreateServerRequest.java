package com.trabalhoopenstack.nova.ws.request;

import com.trabalhoopenstack.nova.model.Server;

public class CreateServerRequest {
  Server server;
  String name;
  String flavorRef;
  String imageRef;
  String adminPass;

  public CreateServerRequest() {
  }

  public Server getServer() {
    return server;
  }

  public void setServer(Server server) {
    this.server = server;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFlavorRef() {
    return flavorRef;
  }

  public void setFlavorRef(String flavorRef) {
    this.flavorRef = flavorRef;
  }

  public String getImageRef() {
    return imageRef;
  }

  public void setImageRef(String imageRef) {
    this.imageRef = imageRef;
  }

  public String getAdminPass() {
    return adminPass;
  }

  public void setAdminPass(String adminPass) {
    this.adminPass = adminPass;
  }
}
