package com.trabalhoopenstack.nova.ws.response;

import com.trabalhoopenstack.nova.model.Keypair;

public class KeypairsListResponse {
  KeypairWrapper[] keypairs;

  public KeypairsListResponse() {
  }

  public KeypairWrapper[] getKeypairs() {
    return keypairs;
  }

  public void setKeypairs(KeypairWrapper[] keypairs) {
    this.keypairs = keypairs;
  }

  public class KeypairWrapper {
    public Keypair keypair;

    public KeypairWrapper() {
    }
  }

}
