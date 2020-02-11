package InnerClassProject;

public class MyIncrement {
    public void increment(){
        System.out.println("Other operation");
    }
    static void fun (MyIncrement mi){
        mi.increment();
    }
}
