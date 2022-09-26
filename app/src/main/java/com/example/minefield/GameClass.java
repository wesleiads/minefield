package com.example.minefield;

import static com.example.minefield.R.*;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class GameClass extends AppCompatActivity {
    private Button ButtonPlayAgain; //ButtonRestart
    private static final int[] idArray = {
            R.id.button_1, R.id.button_2,
            R.id.button_3, R.id.button_4,
            R.id.button_5, R.id.button_6,
            R.id.button_7, R.id.button_8,
            R.id.button_9, R.id.button_10,
            R.id.button_11, R.id.button_12,
            R.id.button_13, R.id.button_14, R.id.button_15, R.id.button_16

    };
    private Button[] buttons = new Button[idArray.length];

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.layout_game);

        ButtonPlayAgain = findViewById(R.id.button_play_again);


        for (int i = 0; i < idArray.length; i++) {

            //int y = i +1;
            buttons[i] = (Button) findViewById(idArray[i]);

            buttons[i].setText("123");


            ButtonPlayAgain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView viewById = (TextView) findViewById(id.button_1);


                    viewById.setText("");
                }
            });
        }

    }
}
