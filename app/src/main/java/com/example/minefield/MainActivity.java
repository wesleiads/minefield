package com.example.minefield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton newGame;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newGame = findViewById(R.id.button_new_game);

    }
    newGame.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            /*intent permite navagador entre as telas*/
            Intent intent = new Intent(
                    getApplicationContext(),
                    /*contexto da aplicação*/
                    Game_class.class

            );
            startActivity(intent);
}