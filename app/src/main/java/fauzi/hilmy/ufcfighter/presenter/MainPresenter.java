package fauzi.hilmy.ufcfighter.presenter;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import fauzi.hilmy.ufcfighter.Base.BasePresenter;
import fauzi.hilmy.ufcfighter.api.ApiClient;
import fauzi.hilmy.ufcfighter.model.ResponseFighter;
import fauzi.hilmy.ufcfighter.view.MainView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter implements BasePresenter<MainView> {
    MainView mainView;
    List<ResponseFighter> dataItems = new ArrayList<>();

    public void getData(){
//        call().enqueue(new Callback<ResponseFighter>() {
//            @Override
//            public void onResponse(Call<ResponseFighter> call, Response<ResponseFighter> response) {
//                if (response.isSuccessful()){
//                    List<ResponseFighter> itemList = response.body();
//                    mainView.onSuccess(itemList);
//                }else {
//                    mainView.onError("Gagal Mengambil Data");
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ResponseFighter> call, Throwable t) {
//                mainView.onError(t.getMessage());
//            }
//        });

        call().enqueue(new Callback<JsonArray>() {
            @Override
            public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                try {

                    String teamString = response.body().toString();

                    Type listType = new TypeToken<List<ResponseFighter>>() {
                    }.getType();
                    dataItems = getTeamListFromJson(teamString, listType);
                    Log.wtf("Data Lah", dataItems.toString());
                    mainView.onSuccess(dataItems);
                    // Sorting recipe in alphabetical order which UI test was done upon
                    // Collections.sort(recipes, Recipe.BY_NAME_ALPHABETICAL);


                } catch (Exception e) {
                    Log.d("onResponse", "There is an error");
                    mainView.onError("There is an Error");
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<JsonArray> call, Throwable t) {
                mainView.onError(t.getMessage());
            }
        });
    }
    @Override
    public void onAttach(MainView v) {
        mainView = v;
    }

    @Override
    public void onDetach() {
        mainView = null;
    }
    public static <T> List<T> getTeamListFromJson(String jsonString, Type type) {
        if (!isValid(jsonString)) {
            return null;
        }
        return new Gson().fromJson(jsonString, type);
    }

    public static boolean isValid(String json) {
        try {
            new JsonParser().parse(json);
            return true;
        } catch (JsonSyntaxException jse) {
            return false;
        }
    }
    Call<JsonArray> call(){
        return ApiClient.getClient().getTeams();
    }
}
