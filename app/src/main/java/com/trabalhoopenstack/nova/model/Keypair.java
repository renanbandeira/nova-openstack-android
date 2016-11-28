package com.trabalhoopenstack.nova.model;

import com.google.gson.annotations.SerializedName;

public class Keypair {
  String fingerprint;
  String name;
  @SerializedName("public_key")
  String publicKey;

  public Keypair() {
  }

  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }
}
