package com.example.appmyidea.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.appmyidea.R;
import com.example.appmyidea.model.Client;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "APP MINHA IDEIA";

    Client objClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Tela Principal carregando...");

        objClient = new Client
                (
                        "Gustavo",
                        "test@test.com.br",
                        "123456789",
                        33,
                        true
                );
    }
}