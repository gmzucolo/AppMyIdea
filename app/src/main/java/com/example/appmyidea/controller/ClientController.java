package com.example.appmyidea.controller;

import android.util.Log;

import com.example.appmyidea.core.AppUtil;

public class ClientController {

    String appVersion;

    String TAG = "APP MYIDEA";

    public ClientController() {

        this.appVersion = AppUtil.AppVersion();

        Log.i(TAG, "ClientController: AppVersion: " + appVersion);
    }
}
