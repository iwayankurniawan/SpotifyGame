package com.wawan.SpotifyGame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.app.Activity;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton goTomusiclist = (ImageButton) findViewById(R.id.despacito);
        goTomusiclist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(Home.this,MusicList.class );
                intent1.putExtra("my_score", R.drawable.timecapsule);
                startActivity(intent1);
            }
        });

        ImageButton goTomusiclist1 = (ImageButton) findViewById(R.id.discover);
        goTomusiclist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(Home.this,MusicList.class );
                intent1.putExtra("my_score", R.drawable.discoverweekly);
                startActivity(intent1);
            }
        });

        ImageButton goToPlay = (ImageButton) findViewById(R.id.rock);
        goToPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(Home.this,MusicList.class );
                intent1.putExtra("my_score", R.drawable.despacito);
                startActivity(intent1);
            }
        });

        ImageButton goTomusiclist2 = (ImageButton) findViewById(R.id.daughtry);
        goTomusiclist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(Home.this,MusicList.class );
                intent1.putExtra("my_score", R.drawable.daughtry);
                startActivity(intent1);
            }
        });

        ImageButton goTomusiclist3 = (ImageButton) findViewById(R.id.browse);
        goTomusiclist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(Home.this,MusicList.class );
                intent1.putExtra("my_score", R.drawable.daughtry);
                startActivity(intent1);
            }
        });

        ImageButton goTomusiclist4 = (ImageButton) findViewById(R.id.search);
        goTomusiclist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(Home.this,MusicList.class );
                intent1.putExtra("my_score", R.drawable.discoverweekly);
                startActivity(intent1);
            }
        });

        ImageButton goTogame = (ImageButton) findViewById(R.id.game);
        goTogame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(Home.this,Game.class );
                startActivity(intent1);
            }
        });


        ImageButton goToRadio = (ImageButton) findViewById(R.id.radio);
        goToRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(Home.this,PlayMusic.class );
                startActivity(intent1);
            }
        });

        ImageButton goTomusiclist5 = (ImageButton) findViewById(R.id.library);
        goTomusiclist5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(Home.this,MusicList.class );
                intent1.putExtra("my_score", R.drawable.timecapsule);
                startActivity(intent1);
            }
        });

    }
}
