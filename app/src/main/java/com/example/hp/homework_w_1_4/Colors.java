package com.example.hp.homework_w_1_4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class Colors extends AppCompatActivity {
    private static final int MIN_VALUE_COLOR = 0;
    private static final int MAX_VALUE_COLOR = 255;
    private int seekRInt;
    private int seekGInt;
    private int seekBInt;
    private TextView textRed;
    private TextView textGreen;
    private TextView textBlue;
    private LinearLayout pool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        SeekBar seekBarRed = findViewById(R.id.seekRedId);
        SeekBar seekBarGreen = findViewById(R.id.seekGreenId);
        SeekBar seekBarBlue = findViewById(R.id.seekBlueId);
        pool = findViewById(R.id.poolId);
        textRed = findViewById(R.id.redText);
        textGreen = findViewById(R.id.greenText);
        textBlue = findViewById(R.id.blueText);
        seekBarRed.setProgress(MIN_VALUE_COLOR);
        seekBarRed.setMax(MAX_VALUE_COLOR);
        seekBarGreen.setProgress(MIN_VALUE_COLOR);
        seekBarGreen.setMax(MAX_VALUE_COLOR);
        seekBarBlue.setProgress(MIN_VALUE_COLOR);
        seekBarBlue.setMax(MAX_VALUE_COLOR);
        seekBarRed.setOnSeekBarChangeListener(onSeekBarChangeListener);
        seekBarGreen.setOnSeekBarChangeListener(onSeekBarChangeListener);
        seekBarBlue.setOnSeekBarChangeListener(onSeekBarChangeListener);

    }
    SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            switch (seekBar.getId()){
                case R.id.seekRedId:
                    seekRInt = i;
                    textRed.setText(String.valueOf(i));
                    break;
                case R.id.seekGreenId:
                    seekGInt = i;
                    textGreen.setText(String.valueOf(i));
                    break;
                case R.id.seekBlueId:
                    seekBInt = i;
                    textBlue.setText(String.valueOf(i));
                    break;
            }
            colorChangeMethod();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
    private void colorChangeMethod(){
        int color = Color.rgb(seekRInt, seekGInt, seekBInt);
        pool.setBackgroundColor(color);
    }
}
