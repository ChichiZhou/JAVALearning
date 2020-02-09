package ThinkingInJAVA;

public class ThisProject {

    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}

class Person{
    public void eat(Apple apple){
        System.out.println("Good");
    }
}

class Apple{
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}

class Peeler{
    static  Apple peel(Apple apple){
        return apple;
    }
}
