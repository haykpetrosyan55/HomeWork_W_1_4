package com.example.hp.homework_w_1_4;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Relative extends AppCompatActivity {
    Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        final RelativeLayout relativeLayout = findViewById(R.id.relativeLayoutID);
        final Button redButton = findViewById(R.id.redButton);
        final Button orangeButton = findViewById(R.id.orangeButton);
        final Button yellowButton = findViewById(R.id.yellowButton);
        final Button blueButton = findViewById(R.id.blueButton);
        final Button greenButton = findViewById(R.id.greenButton);
        final Button indigoButton = findViewById(R.id.indigoButton);
        final Button violetButton = findViewById(R.id.violetButton);
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawable = view.getBackground();
                relativeLayout.setBackground(drawable);
            }
        });
           redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawable = view.getBackground();
                relativeLayout.setBackground(drawable);
            }
        });
           orangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawable = view.getBackground();
                relativeLayout.setBackground(drawable);
            }
        });
           yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawable = view.getBackground();
                relativeLayout.setBackground(drawable);
            }
        });
           greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawable = view.getBackground();
                relativeLayout.setBackground(drawable);
            }
        });
           indigoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawable = view.getBackground();
                relativeLayout.setBackground(drawable);
            }
        });
           violetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawable = view.getBackground();
                relativeLayout.setBackground(drawable);
            }
        });
    }
}
