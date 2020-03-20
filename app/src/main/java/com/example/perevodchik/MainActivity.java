package com.example.perevodchik;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.perevodchik.renderer.MockWordProvider;
import com.example.perevodchik.renderer.Translate;
import com.example.perevodchik.renderer.TranslateRenderer;

import java.util.ArrayList;
import java.util.List;

import static com.example.perevodchik.R.menu.menu_main;

public class MainActivity extends AppCompatActivity
        implements TranslateRenderer.TranslateListener {
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecycler();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_new_word: {
                Intent intent = new Intent(this, AddWordActivity.class);
                startActivity(intent);
                return true;
            }
            case R.id.action_change_word: {
                Intent intent = new Intent(this, ChangeWordActivity.class);
                startActivity(intent);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
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
