/*
Your task is to develop a basic Java console application that will emulate the main features of a music
streaming service such as Spotify or Apple Music. 
You should code a basic application that is able to store a list of song objects. Each song object should be
able to store the artist’s name, the song title, and the current number of times the song has been played.
Your application should have the following features:
1. Add a new song to the list of songs
2. Remove a song from the list of songs
3. Print a list of all the songs stored
4. Print a list of songs over a given number of plays 
*/

import java.util.ArrayList;

class Song {
  private String artist;
  private String title;
  private int plays;

  public Song(String artist, String title, int plays) {
    this.artist = artist;
    this.title = title;
    this.plays = plays;
  }

  public void print() {
    System.out.println("Artist: " + artist + ", Title: " + title + ", Plays: " + plays);
  }
}

class SongList {
  private ArrayList<Song> songs;

  public SongList() {
    songs = new ArrayList<Song>();

    songs.add(new Song("Seafret", "Atlantis", 1041721661));
    songs.add(new Song("Seafret", "Oceans", 202311668));
    songs.add(new Song("Seafret", "Wildfire", 59731592));
    songs.add(new Song("Orla Gartland", "Why Am I Like This?", 76399312));
    songs.add(new Song("Orla Gartland", "Little Chaos", 3220324));
    songs.add(new Song("Orla Gartland", "More Like You", 19187743));
    songs.add(new Song("Gigi Perez", "Sailor Song", 758039084));
    songs.add(new Song("Chappel Roan", "Pink Pony Club", 1312588412));
    songs.add(new Song("Chappel Roan", "HOT TO GO!", 595970756));
    songs.add(new Song("E^ST", "Friends", 16514295));
  }
}

public class MusicApp {
  public static void main(String[] args) {

  }
}
