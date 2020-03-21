package com.example.perevodchik.domain;

import com.example.perevodchik.Language;
import com.example.perevodchik.presentation.renderer.Translate;

public class MockTranslateUseCaseImpl implements TranslateUseCase {
    @Override
    public Translate translate(String word, Language lang) {
        return null;
    }
}
