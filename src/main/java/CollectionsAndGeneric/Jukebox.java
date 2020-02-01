package CollectionsAndGeneric;

import java.util.*;

public class Jukebox {
    /**
     * 初始化 ArrayList
     */

//    ArrayList<String> songList = new ArrayList<String>();
//    songList.add("A"); 这样写是不行的

//    ArrayList<String> songList = new ArrayList<String>(Arrays.asList("A", "B")); // 这样写是可以的

    ArrayList<Song> songList = new ArrayList<Song>();

    /**
     *
     * 测试方法
     */
    public static void main(String[] args) {

    }

    public void go(){
//        Collections.sort(songList);      // 在 Song 里面已经声明了一个比较方法，因此在这里可以直接用

        ArtistCompare artistComparator = new ArtistCompare(); // 使用 Comparator 对象进行比较
        Collections.sort(songList, artistComparator);


    }

    public void addList(Song song){
        songList.add(song);
    }

    class ArtistCompare implements Comparator<Song>{

        public int compare(Song o1, Song o2) {
            return o1.getArtist().compareTo(o2.getArtist());
        }
    }       // 创建一个内部类，用来创建 Comparator 对象


}
