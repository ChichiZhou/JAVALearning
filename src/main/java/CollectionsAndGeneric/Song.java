package CollectionsAndGeneric;

public class Song implements Comparable<Song> {
    private String title;     // title 被用作指针，即使没有指向某个对象，也是可以单独存在的
    private String artist;

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public String getTitle(){
        return this.title;
    }

    public String getArtist(){
        return this.artist;
    }

    public int compareTo(Song a){
        return title.compareTo(a.getTitle());
    }   // 声明一个比较方法

    public boolean equals(Object aSong){
        Song a = (Song) aSong;
        return getArtist().equals(a.getArtist());
    }  // 写个一比较的方法，注意这里传入的变量只能是 Object 类型的！！！！

    /**
     * 这里必须也重写一遍 hashCode。与 equals 配套使用才能得到最后的效果
     * 当把对象加入到 hashset 中时，会先通过计算 hashcode 来比较是否有相同的
     * 如果 hashcode 没有相同的，则直接加入。
     * 如果有相同的，则比较 equals
     */
    public int hashCode(){
        return artist.hashCode();
    }




}
