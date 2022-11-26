package com.example.restapi_2018031;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://api.aladhan.com/v1/";
    @GET("asmaAlHusna")
    Call<PojoResponse> getAsma();
}
