package class02_11_mp3player;

import java.util.ArrayList;

public class Album {
    String albumName;
    int year;
    Artist artist;
    private ArrayList<Song> songList = new ArrayList<>();
    
    public Album(String albumName, int year, Artist artist){
        this.albumName = albumName;
        this.year = year;
        this.artist = artist;
    }
    
    public void addTrack(Song song){
        songList.add(song);
    }
    
    public Song getTrack(int i){ //i번째 트랙 => songList[i-1]
        return songList.get(i-1);
    }
}
