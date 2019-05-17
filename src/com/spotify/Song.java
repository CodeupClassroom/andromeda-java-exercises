package com.spotify;

public class Song {

    private long id;
    private String title;
    private String artist;
    private String genre;
    private int releaseYear;
    private boolean explicit;

    // CRUD

    // Create a new song
    public Song(String title, String artist, String genre){
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    // Reads a song info
//    public Song(long id, String title, String artist, String genre, int releaseYear, boolean explicit) {
//        this.id = id;
//        this.title = title;
//        this.artist = artist;
//        this.genre = genre;
//        this.releaseYear = releaseYear;
//        this.explicit = explicit;
//    }

    // Defines the rules of how the info is being returned
    public int getReleaseYear() {
        return releaseYear;
    }

    // Defines the rules of how it saves the info
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean getExplicit(){
        return this.explicit;
    }

    public void setExplicit(boolean arg){
        this.explicit = arg;
    }


    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isExplicit() {
        return explicit;
    }
}
