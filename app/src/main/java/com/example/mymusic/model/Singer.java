package com.example.mymusic.model;

public class Singer {
    private String letter;
    private String nameSinger;
    private String quantity;

    public Singer(String letter, String nameSinger, String quantity) {
        this.letter = letter;
        this.nameSinger = nameSinger;
        this.quantity = quantity;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
