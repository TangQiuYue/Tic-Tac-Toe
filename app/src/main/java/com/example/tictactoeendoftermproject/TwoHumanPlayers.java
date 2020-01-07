package com.example.tictactoeendoftermproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TableRow;
import android.widget.TextView;

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
    Boolean p1Active;
    Boolean p2Active;
    TextView whosTurnIsIt;
    int boxA1 = 0, boxA2 = 0, boxA3 = 0, boxB1 = 0, boxB2 = 0, boxB3 = 0, boxC1 = 0, boxC2 = 0, boxC3 = 0;
    int scoreP1 = 0;
    int scoreP2 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_human_players);
        initiat();
    }

    @Override
    public void onButtonClick(String p1, String p2, String wt) {
        if (!p1.equals("") && !p2.equals("")) {
            playerOne.setText(p1);
            playerTwo.setText(p2);
            scorePone.setText("0");
            scorePtwo.setText("0");
            whosTurnIsIt.setText(wt + getResources().getString(R.string.turn));
            p1Active = true;
            p2Active = false;

            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(UserNames_Fragment.goButton.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);

            fragStart.setVisibility(View.GONE);
            fragGrid.setVisibility(View.VISIBLE);
        } else {
            popUp("Something went wrong", "Both names must be entered!");
        }

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
        whosTurnIsIt = findViewById(R.id.whosTurn);

    }

    public void onA1Click(View view) {
        Drawable xOrCircle = activate();
        a1.setBackground(xOrCircle);
        a1.setEnabled(false);
        if(checkWhosTurn()){
            checkIfp1("a1");
        }else{
            checkIfp2("a1");
        }
    }

    public void onA2Click(View view) {
        Drawable xOrCircle = activate();
        a2.setBackground(xOrCircle);
        a2.setEnabled(false);
        if(checkWhosTurn()){
            checkIfp1("a2");
        }else{
            checkIfp2("a2");
        }
    }

    public void onA3Click(View view) {
        Drawable xOrCircle = activate();
        a3.setBackground(xOrCircle);
        a3.setEnabled(false);
        if(checkWhosTurn()){
            checkIfp1("a3");
        }else{
            checkIfp2("a3");
        }
    }

    public void onB1Click(View view) {
        Drawable xOrCircle = activate();
        b1.setBackground(xOrCircle);
        b1.setEnabled(false);
        if(checkWhosTurn()){
            checkIfp1("b1");
        }else{
            checkIfp2("b1");
        }
    }

    public void onB2Click(View view) {
        Drawable xOrCircle = activate();
        b2.setBackground(xOrCircle);
        b2.setEnabled(false);
        if(checkWhosTurn()){
            checkIfp1("b2");
        }else{
            checkIfp2("b2");
        }
    }

    public void onB3Click(View view) {
        Drawable xOrCircle = activate();
        b3.setBackground(xOrCircle);
        b3.setEnabled(false);
        if(checkWhosTurn()){
            checkIfp1("b3");
        }else{
            checkIfp2("b3");
        }
    }

    public void onC1Click(View view) {
        Drawable xOrCircle = activate();
        c1.setBackground(xOrCircle);
        c1.setEnabled(false);
        if(checkWhosTurn()){
            checkIfp1("c1");
        }else{
            checkIfp2("c1");
        }
    }

    public void onC2Click(View view) {
        Drawable xOrCircle = activate();
        c2.setBackground(xOrCircle);
        c2.setEnabled(false);
        if(checkWhosTurn()){
            checkIfp1("c2");
        }else{
            checkIfp2("c2");
        }
    }

    public void onC3Click(View view) {
        Drawable xOrCircle = activate();
        c3.setBackground(xOrCircle);
        c3.setEnabled(false);
        if(checkWhosTurn()){
            checkIfp1("c3");
        }else{
            checkIfp2("c3");
        }
    }

    public Drawable activate() {
        Drawable symbole;
        if (p1Active) {
            symbole = getDrawable(R.drawable.x_marks_the_spot);

        } else {
            symbole = getDrawable(R.drawable.o_for_the_win);

        }

        return symbole;
    }

    public Boolean checkWhosTurn() {
        Boolean firstOrSecond;
        if (p1Active) {
            firstOrSecond = true;
            p1Active = false;
            p2Active = true;
            whosTurnIsIt.setText(playerTwo.getText() + getResources().getString(R.string.turn));
        } else {
            firstOrSecond = false;
            p1Active = true;
            p2Active = false;
            whosTurnIsIt.setText(playerOne.getText() + getResources().getString(R.string.turn));
        }
        return firstOrSecond;
    }

    public void checkIfp1(String id) {

        switch (id) {
            case "a1":
                boxA1 = 1;
                break;
            case "a2":
                boxA2 = 1;
                break;
            case "a3":
                boxA3 = 1;
                break;
            case "b1":
                boxB1 = 1;
                break;
            case "b2":
                boxB2 = 1;
                break;
            case "b3":
                boxB3 = 1;
                break;
            case "c1":
                boxC1 = 1;
                break;
            case "c2":
                boxC2 = 1;
                break;
            case "c3":
                boxC3 = 1;
                break;
        }

        if (boxA1 == 1 && boxA2 == 1 && boxA3 == 1 || boxB1 == 1 && boxB2 == 1 && boxB3 == 1 ||
                boxC1 == 1 && boxC2 == 1 && boxC3 == 1 || boxA1 == 1 && boxB2 == 1 && boxC3 == 1 ||
                boxC1 == 1 && boxB2 == 1 && boxA3 == 1 || boxA1 == 1 && boxB1 == 1 && boxC1 == 1
                || boxA2 == 1 && boxB2 == 1 && boxC2 == 1 || boxA3 == 1 && boxB3 == 1 && boxC3 == 1) {
        popUp("We have a winner!", playerOne.getText().toString() + " is the winner!");
        scoreP1 += 1;
            cleanGame();
            scorePone.setText(String.valueOf(scoreP1));
            whosTurnIsIt.setText(playerOne.getText() + getResources().getString(R.string.turn));
            p1Active = true;
            p2Active = false;
        }else{
        nullCheck();
    }
        if(scoreP1 == 3){
            playAgain(playerOne.getText().toString() + " Is the grand Champion of Tic Tac Toe!!!");
        }
    }

    public void checkIfp2(String id) {

        switch (id) {
            case "a1":
                boxA1 = 2;
                break;
            case "a2":
                boxA2 = 2;
                break;
            case "a3":
                boxA3 = 2;
                break;
            case "b1":
                boxB1 = 2;
                break;
            case "b2":
                boxB2 = 2;
                break;
            case "b3":
                boxB3 = 2;
                break;
            case "c1":
                boxC1 = 2;
                break;
            case "c2":
                boxC2 = 2;
                break;
            case "c3":
                boxC3 = 2;
                break;
        }
        if (boxA1 == 2 && boxA2 == 2 && boxA3 == 2 || boxB1 == 2 && boxB2 == 2 && boxB3 == 2 ||
                boxC1 == 2 && boxC2 == 2 && boxC3 == 2 || boxA1 == 2 && boxB2 == 2 && boxC3 == 2 ||
                boxC1 == 2 && boxB2 == 2 && boxA3 == 2 || boxA1 == 2 && boxB1 == 2 && boxC1 == 2 ||
                boxA2 == 2 && boxB2 == 2 && boxC2 == 2 || boxA3 == 2 && boxB3 == 2 && boxC3 == 2) {
            popUp("We have a winner!", playerTwo.getText().toString() + " is the winner!");
                scoreP2 += 1;
               cleanGame();
               scorePtwo.setText(String.valueOf(scoreP2));
            whosTurnIsIt.setText(playerTwo.getText() + getResources().getString(R.string.turn));
            p2Active = true;
            p1Active = false;

        }else{
            nullCheck();
        }
        if(scoreP2 == 3){
            playAgain(playerTwo.getText().toString() + " Is the grand Champion of Tic Tac Toe!!!");
        }
    }

    public void popUp(String title, String message){
        AlertDialog.Builder popUp = new AlertDialog.Builder(TwoHumanPlayers.this);
        popUp.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        popUp.setTitle(title);
        popUp.setMessage(message);
        popUp.show();
    }

    public void cleanGame(){
        a1.setBackgroundResource(0);
        a2.setBackgroundResource(0);
        a3.setBackgroundResource(0);
        b1.setBackgroundResource(0);
        b2.setBackgroundResource(0);
        b3.setBackgroundResource(0);
        c1.setBackgroundResource(0);
        c2.setBackgroundResource(0);
        c3.setBackgroundResource(0);
        boxA1 = 0; boxA2 = 0; boxA3 = 0; boxB1 = 0; boxB2 = 0; boxB3 = 0; boxC1 = 0; boxC2 = 0; boxC3 = 0;
        a1.setEnabled(true);
        a2.setEnabled(true);
        a3.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        c1.setEnabled(true);
        c2.setEnabled(true);
        c3.setEnabled(true);
    }

    public void nullCheck(){
        if( boxA1 != 0 && boxA2 !=0 && boxA3 != 0 && boxB1 != 0 && boxB2 != 0 && boxB3 != 0 &&
                boxC1 != 0 && boxC2 != 0 && boxC3!=0){
            popUp("Oh no!", "The game is null, try again!");
            cleanGame();
        }

    }

    public void playAgain(String title){
        AlertDialog.Builder popUp = new AlertDialog.Builder(TwoHumanPlayers.this);
        popUp.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                scoreP1 = 0;
                scoreP2 = 0;
                scorePone.setText("0");
                scorePtwo.setText("0");
                cleanGame();
            }
        });
        popUp.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        popUp.setTitle(title);
        popUp.setMessage("Would you like to play again?");
        popUp.show();
    }

}
