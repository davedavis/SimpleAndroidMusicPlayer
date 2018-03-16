package com.echofly.simplemusicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Grab a reference to the buttons in the activity_main.xml layout
        Button playButton = findViewById(R.id.play);
        Button pauseButton = findViewById(R.id.pause);

        // Initialize the MediaPlayer object.
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sound3);

        // Set an OnClickListener for the play button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Use the MediaPlayer to play the local song.
                mediaPlayer.start();

                // Set an onCompletionListner on the mediaPlayer object (after it starts) by calling the setOnCompletionListener
                // method on the object and passing it an OnCompletionListener object as defined in docs by initializing an
                // anonymous class in-line. Then define the onCompletion callback method and show a toast.
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Toast.makeText(MainActivity.this, "Song finished!", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

        // Set an OnClickListener for the play button
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Send a message telling the user that the song is paused.
                Toast.makeText(MainActivity.this, "Song Paused!", Toast.LENGTH_LONG).show();

                // Pause the Song
                mediaPlayer.pause();
            }
        });


    }

}
