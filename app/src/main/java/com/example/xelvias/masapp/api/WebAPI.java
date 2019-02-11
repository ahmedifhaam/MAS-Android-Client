package com.example.xelvias.masapp.api;

import com.example.xelvias.masapp.model.Entry;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface WebAPI {

    @POST("entry")
    Call<Boolean> updateEntry(@Body Entry entry);
}
