package com.example.hp.homework_w_1_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button colors = findViewById(R.id.colors);
        final Button constraint = findViewById(R.id.constraint);
        final Button relative = findViewById(R.id.relative);
        final Button frame = findViewById(R.id.frame);
        final Button coordinator = findViewById(R.id.coordinator);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Colors.class);
                startActivity(intent);
            }
        });
        constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Constraint.class);
                startActivity(intent);
            }
        });
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Relative.class);
                startActivity(intent);
            }
        });
        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Frame.class);
                startActivity(intent);
            }
        });
        coordinator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Coordinator.class);
                startActivity(intent);
            }
        });


    }
}
