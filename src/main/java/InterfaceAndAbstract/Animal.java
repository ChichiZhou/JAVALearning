package InterfaceAndAbstract;

/**
 * 抽象类中可以有非抽象的方法
 */

abstract public class Animal {
    String name;
    void name(String input){
        this.name = input;
    }

    abstract void makenoise();  // 抽象方法不能有函数体

}
