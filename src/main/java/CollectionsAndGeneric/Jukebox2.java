package CollectionsAndGeneric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Jukebox2 {
    ArrayList<Song> songList = new ArrayList<Song>();
    HashSet<Song> songSet = new HashSet<Song>();

    public void go(){
        Collections.sort(songList);
        songSet.addAll(songList);
    }

    public void addList(Song input){
        songList.add(input);
    }

}
