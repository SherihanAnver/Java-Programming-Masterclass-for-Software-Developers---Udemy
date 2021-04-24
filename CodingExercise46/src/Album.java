import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }


    public boolean addSong(String title, double duration){
        if(findSong(title)!= null){
            return false;
        }
        else{
            Song song = new Song(title, duration);
            songs.add(song);
            return true;
        }

    }

    private Song findSong(String title){
        if(!songs.isEmpty()){
            for(int i = 0; i <songs.size(); i++){
                if(songs.get(i).getTitle().equals(title)){
                    return songs.get(i);
                }
            }
        }
        return null;
    }

    public boolean addToPlayList(int numOfSong, LinkedList<Song> playlist){

        if(numOfSong <= 0 || numOfSong> songs.size()){
            return false;
        }

        Song songToAdd = songs.get(numOfSong-1);
        String songToAddTitle = songToAdd.getTitle();

        ListIterator<Song> listIterator = playlist.listIterator();

        while(listIterator.hasNext()){
            int comparison = listIterator.next().getTitle().compareTo(songToAdd.getTitle());
            if(comparison == 0){
                return false;
            }
        }
        listIterator.add(songToAdd);
        return true;


    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song song = findSong(title);
        if(song == null){
            return false;
        }

        ListIterator<Song> listIterator = playlist.listIterator();
        while(listIterator.hasNext()){
            int comparison = listIterator.next().getTitle().compareTo(song.getTitle());
            if(comparison == 0){
                return false;
            }
        }
        listIterator.add(song);Int
        return true;
    }
}