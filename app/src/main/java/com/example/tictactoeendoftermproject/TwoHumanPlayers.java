package com.example.tictactoeendoftermproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class TwoHumanPlayers extends AppCompatActivity implements UserNames_Fragment.GetGameStarted {

    TextView playerOne;
    TextView playerTwo;
    TextView scorePone;
    TextView scorePtwo;
    View fragStart;
    View fragGrid;
    TableRow a1;
    TableRow a2;
    TableRow a3;
    TableRow b1;
    TableRow b2;
    TableRow b3;
    TableRow c1;
    TableRow c2;
    TableRow c3;
    Drawable main;
    int playerX;
    ColorDrawable viewColour;
    int colour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_human_players);
        initiat();
    }

    @Override
    public void onButtonClick(String p1, String p2) {
        playerOne.setText(p1);
        playerTwo.setText(p2);
        scorePone.setText("0");
        scorePtwo.setText("0");

        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(UserNames_Fragment.goButton.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);

        fragStart.setVisibility(View.GONE);
        fragGrid.setVisibility(View.VISIBLE);
    }

    public void initiat() {
        fragGrid = findViewById(R.id.tictactoegrid);
        fragGrid.setVisibility(View.GONE);
        fragStart = findViewById(R.id.fragmentUserNames);
        playerOne = findViewById(R.id.txtViewP1);
        playerTwo = findViewById(R.id.txtViewP2);
        scorePone = findViewById(R.id.txtViewScoreOne);
        scorePtwo = findViewById(R.id.txtViewScoreTwo);
        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        main = getDrawable(R.drawable.grid_box_plain);
        playerX = (R.drawable.playeronex);

//   testing.setImageResource(R.drawable.grid_box_plain);
    }

    public void onA1Click(View view) {
        Toast.makeText(getApplicationContext(),"the BackGround is: " + a1.getBackground().toString() + "Main:"+ main.toString(), Toast.LENGTH_LONG).show();
        if (a1.getBackground().equals(main)) {

            a1.setBackground(getDrawable(R.drawable.playeronex));

        }
    }
}
