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

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Translate> data= MockWordProvider.instance().getData();
        TranslateRenderer renderer = new TranslateRenderer();//(this.data);
        renderer.setData(data);
        initRecycler();
    }
    private void initRecycler() {
        TranslateRenderer renderer = new TranslateRenderer();//(new ArrayList<>(), this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recycler.setAdapter(renderer);
        recycler.setLayoutManager(layoutManager);
    }
}
