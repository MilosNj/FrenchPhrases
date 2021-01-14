package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void playPhrase(View view) {
        Button buttonPressed = (Button) view;

        switch (buttonPressed.getTag().toString()) {
            case "doyouspeakenglish":
                mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
                mediaPlayer.start();
                break;
            case "goodevening":
                mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
                mediaPlayer.start();
                break;
            case "hello":
                mediaPlayer = MediaPlayer.create(this, R.raw.hello);
                mediaPlayer.start();
                break;
            case "howareyou":
                mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
                mediaPlayer.start();
                break;
            case  "ilivein":
                mediaPlayer = MediaPlayer.create(this, R.raw.ilivein);
                mediaPlayer.start();
                break;
            case "mynameis":
                mediaPlayer = MediaPlayer.create(this, R.raw.mynameis);
                mediaPlayer.start();
                break;
            case "please":
                mediaPlayer = MediaPlayer.create(this, R.raw.please);
                mediaPlayer.start();
                break;
            case "welcome":
                mediaPlayer = MediaPlayer.create(this, R.raw.welcome);
                mediaPlayer.start();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
