package com.example.tictactoeendoftermproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button onePlayer;
    Button twoPlayers;
    Button impossible;
    Button aboutApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        onePlayer = findViewById(R.id.btnOnePlayer);
        twoPlayers = findViewById(R.id.btnTwoPlayer);
        impossible = findViewById(R.id.btnImpossible);
        aboutApp = findViewById(R.id.btnAboutApp);
    }

    public void twoPlayer_Click(View view){
        Intent i = new Intent(this,TwoHumanPlayers.class);
        startActivity(i);
    }

    public void onePlayer_Click(View viw){
       popUp("Under Construction", "This option is under construction, come back soon!");
    }

    public void impossibleGame_Click(View view){
        popUp("Under Construction", "This AI is getting ready to take over the world");
    }
    public void about_Click(View view){
        popUp("So you wanna know, huh?", "This app was created by TangQiuYue as part of a school project." +
                " \n Only the Human v Human was part of the requirements, the rest was done for fun!" +
        "\n  Refactoring underway to improve good practices. ");

    }

    public void popUp(String title, String message){
        AlertDialog.Builder popUp = new AlertDialog.Builder(MainActivity.this);
        popUp.setTitle(title);
        popUp.setMessage(message);
        popUp.show();
        popUp.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
    }
}
