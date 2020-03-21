package com.example.perevodchik.presentation.renderer;

import com.arellomobile.mvp.MvpPresenter;
import com.example.perevodchik.Language;
import com.example.perevodchik.domain.TranslateUseCase;

public class MainActivityPresenter extends MvpPresenter<MainView> {

    private final TranslateUseCase translateUseCase;

    public MainActivityPresenter(TranslateUseCase translateUseCase) {
        this.translateUseCase = translateUseCase;
    }
    public void  onTranslate(String word){
    Translate translate = translateUseCase.translate(word, Language.RUS);
    getViewState().showTranslate(translate);
    }
}
