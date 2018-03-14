package com.echofly.simplemusicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Grab a reference to the buttons in the activity_main.xml layout
        Button playButton = findViewById(R.id.play);
        Button pauseButton = findViewById(R.id.pause);

        // Initialize the MediaPlayer object.
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.song);

        // Set an OnClickListener for the play button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //use the MediaPlayer to play the local song.
                mediaPlayer.start();

            }
        });

        // Set an OnClickListener for the play button
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pause Song
                mediaPlayer.pause();
            }
        });

    }

}
