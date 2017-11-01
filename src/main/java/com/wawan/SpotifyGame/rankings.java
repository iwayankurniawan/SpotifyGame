package com.wawan.SpotifyGame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.app.Activity;

public class rankings extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rankings);

        ImageButton goToresult = (ImageButton) findViewById(R.id.zayn);
        goToresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(rankings.this,results.class );
                startActivity(intent1);
            }
        });


        ImageButton goToHome = (ImageButton) findViewById(R.id.home);
        goToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(rankings.this,Home.class );
                startActivity(intent1);
            }
        });

        ImageButton goTomusiclist3 = (ImageButton) findViewById(R.id.browse);
        goTomusiclist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(rankings.this,MusicList.class );
                intent1.putExtra("my_score", R.drawable.daughtry);
                startActivity(intent1);
            }
        });

        ImageButton goTomusiclist4 = (ImageButton) findViewById(R.id.search);
        goTomusiclist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(rankings.this,MusicList.class );
                intent1.putExtra("my_score", R.drawable.discoverweekly);
                startActivity(intent1);
            }
        });

        ImageButton goTogame = (ImageButton) findViewById(R.id.game);
        goTogame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(rankings.this,Game.class );
                startActivity(intent1);
            }
        });


        ImageButton goToRadio = (ImageButton) findViewById(R.id.radio);
        goToRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(rankings.this,PlayMusic.class );
                startActivity(intent1);
            }
        });

        ImageButton goTomusiclist5 = (ImageButton) findViewById(R.id.library);
        goTomusiclist5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(rankings.this,MusicList.class );
                intent1.putExtra("my_score", R.drawable.timecapsule);
                startActivity(intent1);
            }
        });
    }
}
