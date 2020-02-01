package CollectionsAndGeneric;

public class HeadFirstProject {
    public static void main(String[] args) {
        Song a = new Song("a", "one");
        Song b = new Song("b", "one");

        Jukebox jukebox1 = new Jukebox();
        jukebox1.addList(b);
        jukebox1.addList(a);

        jukebox1.go();

        for (Song showsong : jukebox1.songList){
            System.out.println(showsong.getTitle());
        }

        /**
         * 这里应该是只有一个 song 的
         */

        Jukebox2 jukebox2 = new Jukebox2();
        jukebox2.addList(b);
        jukebox2.addList(a);

        jukebox2.go();

        for (Song showsong : jukebox2.songSet){
            System.out.println(showsong.getTitle());
        }


    }
}
