package com.example.mymusic.model;

public class Folder {
    private String nameFolder;
    private String quantity;
    private String location;

    public Folder(String nameFolder, String quantity, String location) {
        this.nameFolder = nameFolder;
        this.quantity = quantity;
        this.location = location;
    }

    public String getNameFolder() {
        return nameFolder;
    }

    public void setNameFolder(String nameFolder) {
        this.nameFolder = nameFolder;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}