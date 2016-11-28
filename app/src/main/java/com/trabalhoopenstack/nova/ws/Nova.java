package com.trabalhoopenstack.nova.ws;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Nova {
  private static final String API_URL="http://mycompute.pvt/compute/v2.1";
  private Retrofit service;

  public Nova() {
    service = new Retrofit.Builder()
        .baseUrl(API_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
  }

  public Retrofit getService() {
    return service;
  }
}
