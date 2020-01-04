package com.example.tictactoeendoftermproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class UserNames_Fragment extends Fragment {

    Button goButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_user_names, container, false);
        return rootView;

    }

    public void init() {

    }

    public void GoButtonClick(View view) {

    }
}