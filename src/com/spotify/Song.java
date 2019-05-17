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
        return title.trim();
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

    public String toString(){
        // simulate the json object console.log();
        return String.format("{ 'title': \'%s\',\n'artist': \'%s\'}", this.getTitle(), this.getArtist());
    }

}
