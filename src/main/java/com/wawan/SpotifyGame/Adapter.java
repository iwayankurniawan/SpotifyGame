package com.wawan.SpotifyGame;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kurni on 18/10/2017.
 */

public class Adapter extends ArrayAdapter<SongIdentity>  {

    ArrayList<SongIdentity> MusicList = new ArrayList<>();

    public Adapter(Context context, int textViewResourceId, ArrayList<SongIdentity> objects) {
        super(context, textViewResourceId, objects);
        MusicList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.list_view_songidentity, null);

        TextView SongTitle = (TextView) v.findViewById(R.id.TitleSong);
        TextView SongArtist = (TextView) v.findViewById(R.id.ArtistName);
        TextView SongAlbum = (TextView) v.findViewById(R.id.AlbumName);

        SongTitle.setText(MusicList.get(position).getSongName());
        SongArtist.setText(MusicList.get(position).getArtistName());
        SongAlbum.setText(MusicList.get(position).getAlbumName());

        return v;
    }

}
