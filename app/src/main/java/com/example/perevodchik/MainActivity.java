package com.example.perevodchik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.perevodchik.renderer.TranslateRenderer;

public class MainActivity extends AppCompatActivity {
//не забыть recycler!
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// нужны данные, data = WorldProvider.get()  который вернет замоканные данные//  а он в транслейте
        TranslateRenderer adapter = new TranslateRenderer(this,data);
        adapter
    }
}
