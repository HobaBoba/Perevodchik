package com.example.perevodchik.domain;

import com.example.perevodchik.Language;
import com.example.perevodchik.presentation.renderer.Translate;

public interface TranslateUseCase {
    public Translate translate(String word, Language lang);
}
