package class02_11_mp3player;

import java.util.ArrayList;

public class Artist {
    String name;
    private ArrayList<Album> albumList = new ArrayList<>();
    
    public Artist(String name){
        this.name = name;
    }
    
    public void addAlbum(Album album){
        albumList.add(album);
    }
    
    public ArrayList<Album> getAlbums(){
        return albumList;
    }
}
