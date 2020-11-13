package com.example.testapp2.ui.mypage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.testapp2.R;

public class MypageFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MypageViewModel mypageViewModel = new ViewModelProvider(this).get(MypageViewModel.class);
        View root = inflater.inflate(R.layout.fragment_mypage, container, false);
        final TextView textView = root.findViewById(R.id.text_mypage);
        final TextView txtTest = root.findViewById(R.id.text_test);
        mypageViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        txtTest.setText(R.string.text_testing);
        return root;
    }
}