package com.example.xelvias.masapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.xelvias.masapp.api.ApiService.MyPREFERENCES;

public class Settings extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_layout);

        final EditText baseUrl = findViewById(R.id.txtbaseurl);
        Button btnSubmit = findViewById(R.id.btnsubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor edit = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE).edit();
                edit.putString("BaseUrl",baseUrl.getText().toString());
//                edit.apply();
                edit.commit();
                Toast.makeText(getApplicationContext(),"Update Sucess",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
