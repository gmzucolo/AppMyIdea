package com.example.appmyidea.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmyidea.R;
import com.example.appmyidea.controller.ClientController;
import com.example.appmyidea.core.AppUtil;
import com.example.appmyidea.model.Client;

public class SplashActivity extends AppCompatActivity {

    int lagTime = 1000 * 3;

    Client objClient;

    ClientController clientController;

    TextView txtAppVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(AppUtil.TAG, "onCreate: Tela Splash carregando...");

        clientController = new ClientController();

        ChangeScreen();

        txtAppVersion = findViewById(R.id.txtAppVersion);
        txtAppVersion.setText(AppUtil.AppVersion());

    }

    private void ChangeScreen() {

        Log.d(AppUtil.TAG, "trocarTela: Mudando de tela...");

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

                Log.d(AppUtil.TAG, "trocarTela: Esperando um tempo...");
                Intent changeScreen = new Intent(SplashActivity.this, MainActivity.class);

                // Bundle Object, transfer data between screens
                Bundle bundle = new Bundle();
                bundle.putString("name", objClient.getName());
                bundle.putString("email", objClient.getEmail());

                changeScreen.putExtras(bundle);

                startActivity(changeScreen);
                finish();
            }
        });
    }
}