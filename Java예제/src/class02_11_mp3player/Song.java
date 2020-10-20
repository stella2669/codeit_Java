package class02_11_mp3player;

public class Song {
    String title;
    Artist artist;
    Album album;
    
    public Song(String title, Artist artist, Album album){
        this.title = title;
        this.artist = artist;
        this.album = album;
    }
    
    public String toString(){
        return this.title+" - "+this.artist.name+"\n"+album.albumName+"("+album.year+")";
    }
}
