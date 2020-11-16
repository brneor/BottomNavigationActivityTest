package com.example.testapp2.ui.mypage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MypageViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> txtTeste;

    public MypageViewModel() {
        mText = new MutableLiveData<>();
        txtTeste = new MutableLiveData<>();

        mText.setValue("This is my page fragment!");
        txtTeste.setValue("Testando o uso da ViewModel!");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public MutableLiveData<String> getTxtTeste() {
        return txtTeste;
    }
}