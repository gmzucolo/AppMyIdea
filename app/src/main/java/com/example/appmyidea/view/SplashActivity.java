package com.example.appmyidea.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmyidea.R;
import com.example.appmyidea.model.Client;

public class SplashActivity extends AppCompatActivity {

    private static final String TAG = "APP MINHA IDEIA";

    int lagTime = 1000 * 3;

    Client objClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(TAG, "onCreate: Tela Splash carregando...");

        ChangeScreen();

    }

    private void ChangeScreen() {

        Log.d(TAG, "trocarTela: Mudando de tela...");

        new Handler().post(new Runnable() {
            @Override
            public void run() {

                objClient = new Client
                        (
                                "Gustavo",
                                "test@test.com.br",
                                "123456789",
                                33,
                                true
                        );

                Log.d(TAG, "trocarTela: Esperando um tempo...");
                Intent changeScreen = new Intent(SplashActivity.this, MainActivity.class);

                startActivity(changeScreen);
                finish();
            }
        });
    }
}