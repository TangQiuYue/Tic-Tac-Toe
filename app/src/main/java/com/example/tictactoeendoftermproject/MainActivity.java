package com.example.tictactoeendoftermproject;

import androidx.appcompat.app.AppCompatActivity;

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
}
