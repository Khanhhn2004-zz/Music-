package com.example.mymusic.model;

public class Album {
    private String nameAlbum;
    private String singer;

    public Album(String nameAlbum, String singer) {
        this.nameAlbum = nameAlbum;
        this.singer = singer;
    }

    public String getNameAlbum() {
        return nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
