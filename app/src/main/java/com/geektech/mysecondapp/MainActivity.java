package com.geektech.mysecondapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Button btnHiphop, btnCircle, btnHouse;
    private CardView cardHiphop, cardHouse;
    private LinearLayout containerSongs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHiphop = findViewById(R.id.btnHiphop);
        btnCircle = findViewById(R.id.btnCircle);
        btnHouse = findViewById(R.id.btnHouse);
        cardHiphop = findViewById(R.id.cardHiphop);
        cardHouse = findViewById(R.id.cardHouse);
        containerSongs = findViewById(R.id.containerSongs);

        btnHiphop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cardHiphop.getAlpha() == 1f) {
                    cardHiphop.animate().alpha(0f);
                } else {
                    cardHiphop.animate().alpha(1f);
                }
            }
        });

        btnHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cardHouse.getAlpha() == 1f) {
                    cardHouse.animate().alpha(0f);
                } else {
                    cardHouse.animate().alpha(1f);
                }
            }
        });
        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (containerSongs.getVisibility() == View.VISIBLE ){
                containerSongs.setVisibility(View.GONE);
                }else {
                    containerSongs.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}