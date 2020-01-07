package com.example.tictactoeendoftermproject;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class UserNames_Fragment extends Fragment {

    EditText playerOne;
    EditText playerTwo;
    EditText whosTurnIsIt;
    static Button goButton;

    GetGameStarted activityCallBack;

    public interface GetGameStarted {
        void onButtonClick(String p1, String p2, String wt);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            activityCallBack = (GetGameStarted) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "must implement GetGameStarted()");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_user_names, container, false);
        playerOne = rootView.findViewById(R.id.editTxtPlayerOne);
        playerTwo = rootView.findViewById(R.id.editTxtPlayerTwo);
        whosTurnIsIt = rootView.findViewById(R.id.whosTurn);
        goButton = rootView.findViewById(R.id.gogobutton);
        goButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                GoButtonClick(view);
            }
        });
        return rootView;
    }


    public void GoButtonClick(View view) {
        activityCallBack.onButtonClick(playerOne.getText().toString(), playerTwo.getText().toString(), playerOne.getText().toString());

    }
}