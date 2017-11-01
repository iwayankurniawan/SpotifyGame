package com.wawan.SpotifyGame;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import android.os.Handler;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.concurrent.TimeUnit;

import android.app.Activity;



public class PlayMusic extends Activity {

    private Button b1,b2,b3,b4;
    private ImageView iv;
    private MediaPlayer mediaPlayer;

    private double startTime = 0;
    private double finalTime = 0;

    public int condition = 1;

    private Handler myHandler = new Handler();;
    private int forwardTime = 5000;
    private int backwardTime = 5000;
    private SeekBar seekbar;
    private TextView tx1,tx2,tx3;

    public static int oneTimeOnly = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        b1 = (Button) findViewById(R.id.button);
       ImageButton b3 = (ImageButton)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);


        Button play = (Button) findViewById(R.id.play);
        Button random = (Button) findViewById(R.id.random);


        iv = (ImageView)findViewById(R.id.imageView);

        tx1 = (TextView)findViewById(R.id.textView2);
        tx2 = (TextView)findViewById(R.id.textView3);
        tx3 = (TextView)findViewById(R.id.songtitle);
        tx3.setText("Despacito");

        mediaPlayer = MediaPlayer.create(this, R.raw.despacito);
        seekbar = (SeekBar)findViewById(R.id.seekBar);
        seekbar.setClickable(false);
        //b2.setEnabled(false);
        playsong();

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                condition = condition - 1;
                if (condition== 1)
                {
                    playsong();
                }
                else if (condition == 0)
                {
                    Toast.makeText(getApplicationContext(), "Pausing sound",Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    ImageButton buttonplay = (ImageButton) findViewById(R.id.button3);
                    buttonplay.setImageDrawable(getResources().getDrawable(R.drawable.play));
                    condition = 2;
                }
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayMusic.this, UnityPlayerActivity.class);
                startActivity(intent);
                mediaPlayer.stop();
            }
        });

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(PlayMusic.this,MusicList.class );
                intent1.putExtra("my_score", R.drawable.discoverweekly);
                startActivity(intent1);
                mediaPlayer.stop();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = (int)startTime;

                if((temp+forwardTime)<=finalTime){
                    startTime = startTime + forwardTime;
                    mediaPlayer.seekTo((int) startTime);

                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = (int)startTime;

                if((temp-backwardTime)>0){
                    startTime = startTime - backwardTime;
                    mediaPlayer.seekTo((int) startTime);
                }
            }
        });
    }

    private Runnable UpdateSongTime = new Runnable() {
        public void run() {
            startTime = mediaPlayer.getCurrentPosition();
            tx1.setText(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes((long) startTime), TimeUnit.MILLISECONDS.toSeconds((long) startTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) startTime)))
            );
            seekbar.setProgress((int)startTime);
            myHandler.postDelayed(this, 100);
        }
    };

    public void playsong()
    {
        ImageButton buttonplay1 = (ImageButton) findViewById(R.id.button3);
        buttonplay1.setImageDrawable(getResources().getDrawable(R.drawable.pause));

        Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();
        mediaPlayer.start();

        finalTime = mediaPlayer.getDuration();
        startTime = mediaPlayer.getCurrentPosition();


        if (oneTimeOnly == 0) {
            seekbar.setMax((int) finalTime);
            oneTimeOnly = 1;
        }

        tx2.setText(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes((long) finalTime), TimeUnit.MILLISECONDS.toSeconds((long) finalTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) finalTime)))
        );

        tx1.setText(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes((long) startTime), TimeUnit.MILLISECONDS.toSeconds((long) startTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) startTime)))
        );

        seekbar.setProgress((int)startTime);
        myHandler.postDelayed(UpdateSongTime,100);
        //b2.setEnabled(true);
        //b3.setEnabled(false);
    }

    public void onBackPressed()
    {
        mediaPlayer.stop();

        Intent intent1 = new Intent(PlayMusic.this,Home.class );
        startActivity(intent1);
    }

}

