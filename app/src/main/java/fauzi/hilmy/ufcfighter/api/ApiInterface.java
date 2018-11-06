package fauzi.hilmy.ufcfighter.api;

import com.google.gson.JsonArray;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("fighters")
    Call<JsonArray> getTeams();
}