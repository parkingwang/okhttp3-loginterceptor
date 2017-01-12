package com.githang.loginterceptor.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.githang.okhttp.LogInterceptor.LogInterceptor;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    Callback empty = new Callback() {
        @Override
        public void onFailure(Call call, IOException e) {

        }

        @Override
        public void onResponse(Call call, Response response) throws IOException {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new LogInterceptor()).build();
        okHttpClient.newCall(new Request.Builder().url("https://api.github.com/zen").build()).enqueue(empty);
        okHttpClient.newCall(new Request.Builder().url(" https://api.github.com/users/defunkt").build()).enqueue(empty);
        okHttpClient.newCall(new Request.Builder().url(" https://api.github.com/users/msdx").build()).enqueue(empty);
    }
}
