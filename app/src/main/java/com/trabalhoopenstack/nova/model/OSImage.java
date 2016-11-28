package com.trabalhoopenstack.nova.model;

public class OSImage {
  String id;
  Link[] links;

  public OSImage() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Link[] getLinks() {
    return links;
  }

  public void setLinks(Link[] links) {
    this.links = links;
  }
}
