package InnerClassProject;

public class Callee1 implements Increamentable{
    private int i = 0;
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}
