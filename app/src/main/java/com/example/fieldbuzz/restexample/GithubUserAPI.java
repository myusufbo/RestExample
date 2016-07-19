package com.example.fieldbuzz.restexample;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by FieldBuzz on 7/18/2016.
 */
public interface GithubUserAPI {

    String Endpoint="https://api.github.com";

    @GET("/users/{user}")
    Call<GithubUser>getUser(@Path("user") String user);
}
