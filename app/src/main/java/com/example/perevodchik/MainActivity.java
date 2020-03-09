package com.example.perevodchik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.perevodchik.renderer.MockWordProvider;
import com.example.perevodchik.renderer.Translate;
import com.example.perevodchik.renderer.TranslateRenderer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements TranslateRenderer.TranslateListener {
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecycler();
    }

    private void initRecycler() {
        List<Translate> data = MockWordProvider.instance().getData();
        TranslateRenderer renderer = new TranslateRenderer();//(this.data);
        renderer.setData(data);
        renderer.setListener(this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recycler = (RecyclerView) findViewById(R.id.recycler);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(renderer);
    }

    @Override
    public void onWordClick(String word) {

    }
}
