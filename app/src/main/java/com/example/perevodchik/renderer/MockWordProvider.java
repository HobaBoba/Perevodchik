package com.example.perevodchik.renderer;

import java.util.ArrayList;
import java.util.List;

public class MockWordProvider  {

    private List<Translate> data;
    private static MockWordProvider instance;

    private MockWordProvider() {
        data = new ArrayList<>();
        data.add(new Translate(0, "cat", "кошка"));
        data.add(new Translate(1, "dog", "собака"));
        data.add(new Translate(2, "monkey", "обезьяна"));
        data.add(new Translate(3, "roof", "крыша"));
        data.add(new Translate(4, "windows", "форточки"));
    }

    public static MockWordProvider instance() {
        if (instance == null) {
            instance = new MockWordProvider();
        }
        return instance;
    }

    public List<Translate> getData() {
        return data;
    }

}