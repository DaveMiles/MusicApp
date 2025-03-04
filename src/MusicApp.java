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
import java.util.Scanner;

class Song {
  private String artist;
  private String title;
  public int plays;
  private int id;

  public Song(String artist, String title, int plays, int id) {
    this.artist = artist;
    this.title = title;
    this.plays = plays;
    this.id = id;
  }

  public void print() {
    System.out.printf("ID: %-2d | Artist: %-15s | Title: %-20s | Plays: %,15d%n", id, artist, title, plays);
  }
}

class SongList {
  private ArrayList<Song> songs;

  public SongList() {
    songs = new ArrayList<Song>();

    songs.add(new Song("Seafret", "Atlantis", 1041721661, 1));
    songs.add(new Song("Seafret", "Oceans", 202311668, 2));
    songs.add(new Song("Seafret", "Wildfire", 59731592, 3));
    songs.add(new Song("Orla Gartland", "Why Am I Like This?", 76399312, 4));
    songs.add(new Song("Orla Gartland", "Little Chaos", 3220324, 5));
    songs.add(new Song("Orla Gartland", "More Like You", 19187743, 6));
    songs.add(new Song("Gigi Perez", "Sailor Song", 758039084, 7));
    songs.add(new Song("Chappel Roan", "Pink Pony Club", 1312588412, 8));
    songs.add(new Song("Chappel Roan", "HOT TO GO!", 595970756, 9));
    songs.add(new Song("E^ST", "Friends", 16514295, 10));
  }

  public void printAllSongs() {
    for (Song song : songs) {
      song.print();
    }
  }

  public void printSongsOverPlays(int minPlays) {
    for (Song song : songs) {
      if (song.plays > minPlays) {
        song.print();
      }
    }
  }

  public int getListLength() {
    return songs.size();
  }

  public void addSong(String artist, String title, int plays, int id) {
    songs.add(new Song(artist, title, plays, id));
  }
}

public class MusicApp {
  public static void main(String[] args) {
    try (Scanner reader = new Scanner(System.in)) {
      boolean programRunning = true;
      SongList songList = new SongList();

      while (programRunning) {
        addNewlineToConsole();
        System.out.println("----------");
        System.out.println("Enter a number to select an option:");
        System.out.println("1. Print all songs");
        System.out.println("2. Print songs over a given number of plays");
        System.out.println("3. Add a new song to the list of songs");
        System.out.println("4. Remove a song from the list of songs");
        System.out.println("5. Exit the program");
        System.out.println("----------");

        int input = reader.nextInt();
        reader.nextLine();

        addNewlineToConsole();

        switch (input) {
          case 1:
            // Print all songs
            songList.printAllSongs();
            break;
          case 2:
            // Print songs over a given number of plays
            printSongsOverPlays(reader, songList);
            break;
          case 3:
            // Add a new song to the list of songs
            addSongToSongList(reader, songList);
            break;
          case 4:
            // Remove a song from the list of songs
            break;
          case 5:
            programRunning = false;
            break;
          default:
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
        }
      }

    }
  }

  private static void addSongToSongList(Scanner reader, SongList songList) {
    addNewlineToConsole();
    System.out.println("Enter the artist's name:");
    String artist = reader.nextLine();
    addNewlineToConsole();
    System.out.println("Enter the song title:");
    String title = reader.nextLine();
    addNewlineToConsole();
    System.out.println("Enter the number of plays:");
    int plays = reader.nextInt();
    reader.nextLine();
    addNewlineToConsole();
    System.out.println("Song added to the list:");
    addNewlineToConsole();
    int id = songList.getListLength() + 1;
    songList.addSong(artist, title, plays, id);

  }

  private static void printSongsOverPlays(Scanner reader, SongList songList) {
    addNewlineToConsole();
    System.out.println("Enter the minimum number of plays:");
    int minPlays = reader.nextInt();
    reader.nextLine();
    addNewlineToConsole();
    System.out.println("Songs with more than " + String.format("%,d", minPlays) + " plays:");
    addNewlineToConsole();
    songList.printSongsOverPlays(minPlays);
  }

  // adds a new line to console to make it look cleaner
  private static void addNewlineToConsole() {
    System.out.println("");
  }
}
