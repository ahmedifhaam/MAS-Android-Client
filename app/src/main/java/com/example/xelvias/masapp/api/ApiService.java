package com.example.xelvias.masapp.api;

import android.content.Context;
import android.content.SharedPreferences;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {
    static WebAPI webAPI = null;
    public static final String MyPREFERENCES = "MyPrefs" ;

    public static WebAPI getWebAPI(Context context){

        if(webAPI==null){
            String baseUrl = context.getSharedPreferences(MyPREFERENCES,Context.MODE_PRIVATE).getString("BaseUrl","192.168.8.100:8080");
            Retrofit retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(baseUrl)

                    .build();
            webAPI = retrofit.create(WebAPI.class);
        }
        return webAPI;
    }
}
