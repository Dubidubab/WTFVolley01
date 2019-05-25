package com.example.capstone01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import java.util.Map;

import retrofit2.Retrofit;
import retrofit2.http.POST;

public class RegisterActivity extends AppCompatActivity{

    private Button registerBtn;
    private EditText registerEmail,registerPw,registerName;
    private Retrofit mRetrofit;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerBtn = findViewById(R.id.registerBtn);
        registerEmail = findViewById(R.id.registerEmail);
        registerPw = findViewById(R.id.registerPw);
        registerName = findViewById(R.id.registerName);

    }

}
