package com.example.xelvias.masapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.xelvias.masapp.api.ApiService;
import com.example.xelvias.masapp.api.WebAPI;
import com.example.xelvias.masapp.model.Entry;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    EditText editText8;
    EditText editText9;
    EditText editText10;
    EditText editText11;
    EditText editText12;
    EditText editText13;
    EditText editText14;
    EditText editText15;
    EditText editText16;
    EditText editText17;
    EditText editText18;
    EditText editText19;
    EditText editText20;

    Entry entry;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.val1txt);
        editText2 = (EditText) findViewById(R.id.val2txt);
        editText3 = (EditText) findViewById(R.id.val3txt);
        editText4 = (EditText) findViewById(R.id.val4txt);
        editText5 = (EditText) findViewById(R.id.val5txt);
        editText6 = (EditText) findViewById(R.id.val6txt);
        editText7 = (EditText) findViewById(R.id.val7txt);
        editText8 = (EditText) findViewById(R.id.val8txt);
        editText9 = (EditText) findViewById(R.id.val9txt);
        editText10 = (EditText) findViewById(R.id.val10txt);
        editText11 = (EditText) findViewById(R.id.val11txt);
        editText12 = (EditText) findViewById(R.id.val12txt);
        editText13 = (EditText) findViewById(R.id.val13txt);
        editText14 = (EditText) findViewById(R.id.val14txt);
        editText15 = (EditText) findViewById(R.id.val15txt);
        editText16 = (EditText) findViewById(R.id.val16txt);
        editText17 = (EditText) findViewById(R.id.val17txt);
        editText18 = (EditText) findViewById(R.id.val18txt);
        editText19 = (EditText) findViewById(R.id.val19txt);
        editText20 = (EditText) findViewById(R.id.val20txt);

        entry = new Entry();


        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal1(val);
            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal2(val);
            }
        });

        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal3(val);
            }
        });

        editText4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal4(val);
            }
        });

        editText5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal5(val);
            }
        });

        editText6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal6(val);
            }
        });

        editText7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal7(val);
            }
        });

        editText8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal8(val);
            }
        });

        editText9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal9(val);
            }
        });

        editText10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal10(val);
            }
        });


        editText11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal11(val);
            }
        });

        editText12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal12(val);
            }
        });

        editText13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal13(val);
            }
        });

        editText14.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal14(val);
            }
        });

        editText15.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal15(val);
            }
        });

        editText16.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal16(val);
            }
        });

        editText17.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal17(val);
            }
        });

        editText18.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal18(val);
            }
        });

        editText19.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal19(val);
            }
        });

        editText20.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Double val = 0.0;
                try {
                    val = Double.parseDouble(s.toString());
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Conversion Error",Toast.LENGTH_SHORT).show();
                }
                entry.setVal20(val);
            }
        });

        final Button clear = findViewById(R.id.clear);
        final Button submit = findViewById(R.id.submit);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit();
            }
        });

        Button btnSettings = findViewById(R.id.settings);
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Settings.class);
                startActivity(intent);
            }
        });
        clear();
    }

    private void submit(){
        try {
            ApiService.getWebAPI(getApplicationContext()).updateEntry(entry).enqueue(new Callback<Boolean>() {
                @Override
                public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                    if(response.body()){
                        Toast.makeText(getApplicationContext(),"Update Success",Toast.LENGTH_LONG).show();
                        clear();
                    }else{
                        Toast.makeText(getApplicationContext(),"Update Failed",Toast.LENGTH_LONG).show();
                    }
                }

                @Override
                public void onFailure(Call<Boolean> call, Throwable t) {
                    Toast.makeText(getApplicationContext(),"Update Failed",Toast.LENGTH_LONG).show();
                    t.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    private void clear(){
        entry = new Entry();
        editText1.setText("0.0");
        editText2.setText("0.0");
        editText3.setText("0.0");
        editText4.setText("0.0");
        editText5.setText("0.0");
        editText6.setText("0.0");
        editText7.setText("0.0");
        editText8.setText("0.0");
        editText9.setText("0.0");
        editText10.setText("0.0");
        editText11.setText("0.0");
        editText12.setText("0.0");
        editText13.setText("0.0");
        editText14.setText("0.0");
        editText15.setText("0.0");
        editText16.setText("0.0");
        editText17.setText("0.0");
        editText18.setText("0.0");
        editText19.setText("0.0");
        editText20.setText("0.0");
    }






}
