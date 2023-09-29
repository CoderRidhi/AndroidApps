package com.example.frenchteachrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener { //class

    Button blackBtn, greenBtn, purpleBtn, redBtn, yellowBtn; //variable

    @Override
    protected void onCreate(Bundle savedInstanceState) { //function 1
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn = findViewById(R.id.blackBtn);
        greenBtn = findViewById(R.id.greenBtn);
        purpleBtn = findViewById(R.id.purpleBtn);
        redBtn = findViewById(R.id.redBtn);
        yellowBtn = findViewById(R.id.yellowBtn);

        redBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);

    }
        @Override
        public void onClick (View v){ //function 2
            // find this button by id and play the correct sound

            int clickBtnId = v.getId();

            if (clickBtnId == R.id.redBtn) {
                PlaySounds(R.raw.red);
            }else if (clickBtnId == R.id.blackBtn) {
                PlaySounds(R.raw.black);
            }else if (clickBtnId == R.id.greenBtn) {
                PlaySounds(R.raw.green);
            }else if (clickBtnId == R.id.purpleBtn) {
                PlaySounds(R.raw.purple);
            }else if (clickBtnId == R.id.yellowBtn) {
                PlaySounds(R.raw.yellow);
            }
        }

        public void PlaySounds(int id){
            MediaPlayer mediaPlayer = MediaPlayer.create(
                    this,
                    id

            );
            mediaPlayer.start();

        }
    }
