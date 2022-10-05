package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button rollButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollButton = findViewById(R.id.button);
        rollButton.setOnClickListener(view -> rollDice());

        rollDice();
    }

    private void rollDice() {
        int numSides = (int)(Math.random() * 6 + 1);
        ImageView diceImage = findViewById(R.id.imageView3);

        switch (numSides){
            case 1:
                diceImage.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                diceImage.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                diceImage.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                diceImage.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                diceImage.setImageResource(R.drawable.dice_5);
                break;
            default:
                diceImage.setImageResource(R.drawable.dice_6);
                break;
        }
    }
}