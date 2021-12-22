package com.example.homework33;

public class Information {
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    String language;
    int image;
    public Information(String language, int image) {
        this.language = language;
        this.image = image;
    }
}
