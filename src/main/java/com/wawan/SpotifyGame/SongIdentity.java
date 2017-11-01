package com.wawan.SpotifyGame;

/**
 * Created by kurni on 18/10/2017.
 */

public class SongIdentity {
    String SongName;
    String ArtistName;
    String AlbumName;

    public SongIdentity(String songtitle,String Artist, String album)
    {
        this.SongName=songtitle;
        this.ArtistName=Artist;
        this.AlbumName=album;

    }
    public String getSongName()
    {
        return SongName;
    }
    public String getArtistName()
    {
        return ArtistName;
    }
    public String getAlbumName() { return AlbumName; }
}
