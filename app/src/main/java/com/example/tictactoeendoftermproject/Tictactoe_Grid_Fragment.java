package com.example.tictactoeendoftermproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;

import androidx.fragment.app.Fragment;

public class Tictactoe_Grid_Fragment extends Fragment {

    TableRow a1;
    TableRow a2;
    TableRow a3;
    TableRow b1;
    TableRow b2;
    TableRow b3;
    TableRow c1;
    TableRow c2;
    TableRow c3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tictactoe_grid, container, false);
        a1 = rootView.findViewById(R.id.a1);
        a2 = rootView.findViewById(R.id.a2);
        a3 = rootView.findViewById(R.id.a3);
        b1 = rootView.findViewById(R.id.b1);
        b2 = rootView.findViewById(R.id.b2);
        b3 = rootView.findViewById(R.id.b3);
        c1 = rootView.findViewById(R.id.c1);
        c2 = rootView.findViewById(R.id.c2);
        c3 = rootView.findViewById(R.id.c3);
        return rootView;
    }


}