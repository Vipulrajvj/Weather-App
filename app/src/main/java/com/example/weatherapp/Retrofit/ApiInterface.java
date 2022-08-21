package com.example.weatherapp.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("weather?q=Bangalore&appid=2613e8ad686c935555ba8eaa2ccffec3&units=metric")
    Call<Example> getWeatherData (@Query("q") String name);



}
