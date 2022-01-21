package com.example.appmyidea.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmyidea.R;
import com.example.appmyidea.core.AppUtil;
import com.example.appmyidea.model.Client;

public class MainActivity extends AppCompatActivity {

    TextView txtName;

    Client objClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);

        Log.d(AppUtil.TAG, "onCreate: Tela Principal carregando...");

        Bundle bundle = getIntent().getExtras();

        Log.d(AppUtil.TAG, "onCreate: Name..." + bundle.getString("name"));
        Log.d(AppUtil.TAG, "onCreate: Email..." + bundle.getString("mail"));

        txtName.setText(bundle.getString("name"));

    }
}