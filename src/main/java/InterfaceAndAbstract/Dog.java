package InterfaceAndAbstract;

/**
 * 如果继承了某个抽象类，则必须实现这个抽象方法中的所有抽象方法
 */
public class Dog extends Animal implements Play{
    String playname;
    void makenoise(){
        System.out.println("WANGWANG");  // 实现这个抽象方法
    }
    public void setPlayname(String playname){
        this.playname = playname;
        System.out.println(playname);
    }

    public void displayPlayName(){
        System.out.println(playname);
    }
}
