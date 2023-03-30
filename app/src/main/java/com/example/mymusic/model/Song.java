package com.example.mymusic.model;

public class Song {
    private String nameSong;
    private String nameSinger;
    private String web;

    public Song(String nameSong, String nameSinger, String web) {
        this.nameSong = nameSong;
        this.nameSinger = nameSinger;
        this.web = web;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
