package com.wawan.SpotifyGame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.app.Activity;

public class results extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        ImageButton goToHome = (ImageButton) findViewById(R.id.home);
        goToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(results.this,Home.class );
                startActivity(intent1);
            }
        });

        ImageButton goTomusiclist3 = (ImageButton) findViewById(R.id.browse);
        goTomusiclist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(results.this,MusicList.class );
                intent1.putExtra("my_score", R.drawable.daughtry);
                startActivity(intent1);
            }
        });

        ImageButton goTomusiclist4 = (ImageButton) findViewById(R.id.search);
        goTomusiclist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(results.this,MusicList.class );
                intent1.putExtra("my_score", R.drawable.discoverweekly);
                startActivity(intent1);
            }
        });

        ImageButton goTogame = (ImageButton) findViewById(R.id.game);
        goTogame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(results.this,Game.class );
                startActivity(intent1);
            }
        });


        ImageButton goToRadio = (ImageButton) findViewById(R.id.radio);
        goToRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(results.this,PlayMusic.class );
                startActivity(intent1);
            }
        });

        ImageButton goTomusiclist5 = (ImageButton) findViewById(R.id.library);
        goTomusiclist5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent1 = new Intent(results.this,MusicList.class );
                intent1.putExtra("my_score", R.drawable.timecapsule);
                startActivity(intent1);
            }
        });
    }
}
