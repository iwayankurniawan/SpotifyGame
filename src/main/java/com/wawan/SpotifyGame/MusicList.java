package com.wawan.SpotifyGame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import android.app.Activity;

public class MusicList extends Activity {

    ListView simpleList;
    ArrayList<SongIdentity> MusicList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        simpleList = (ListView) findViewById(R.id.simpleListView);

        image();

        init();

        MusicList.add(new SongIdentity("Despacito","Luis Fonzi","Fonzi New Album"));
        MusicList.add(new SongIdentity("New Rules","Dua Lipa","Greatest Hits Album"));
        MusicList.add(new SongIdentity("I Want to Hold Your Hand","Luis Fonzi","All the time album"));
        MusicList.add(new SongIdentity("I Want to Break Free","Queen","Queen Album"));
        MusicList.add(new SongIdentity("Bohemian Rhapsody","Queen","Final Album"));
        MusicList.add(new SongIdentity("Dark Necessities","RHCP","Dark"));
        MusicList.add(new SongIdentity("Califorication","RHCP","Dark"));
        MusicList.add(new SongIdentity("Dani California","RHCP","Dark"));
        MusicList.add(new SongIdentity("Otherside","RHCP","Dark"));
        MusicList.add(new SongIdentity("Smells Like Teen Spirits","Nirvana","Cobain and Friends"));

        Adapter myAdapter=new Adapter(this,R.layout.list_view_songidentity,MusicList);
        simpleList.setAdapter(myAdapter);
    }

    public void init() {
        ImageButton but0 = (ImageButton) findViewById(R.id.shuffle);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MusicList.this,PlayMusic.class);
                startActivity(intent1);
            }
        });
    }

    public void image (){
        ImageView btnmode = (ImageView) findViewById (R.id.musiclistimage);
        Bundle extras = getIntent().getExtras();
        int score_now = extras.getInt("my_score");
        btnmode.setImageResource(score_now);
    }
}
