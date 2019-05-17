package com.spotify;

public class Spotify {

    public static void main(String[] args) {
        Song song = new Song("Try", "Nelly Furtado", "Pop");
        song.setExplicit(false);
        song.setReleaseYear(2003);


        Song song2 = new Song("Song 2", "Blur", "Rock/Alternative");
        song.setExplicit(true);
        song.setReleaseYear(1997);

        play(song);
    }


    public static void play(Song song){
        System.out.println("song.getTitle() = " + song.getTitle());
        System.out.println("song.getArtist() = " + song.getArtist());
        System.out.println("song.getGenre() = " + song.getGenre());
    }

}
