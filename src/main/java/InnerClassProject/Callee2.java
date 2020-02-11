package InnerClassProject;

public class Callee2 extends MyIncrement{
    private int i = 0;
    public void increment(){
        super.increment();           // 调用父类的方法，使用 super
        i++;
        System.out.println(i);
    }

    private class Closure implements Increamentable{

        @Override
        public void increment() {
            Callee2.this.increment();         // 调用外部类必须使用 this
        }
    }

    Increamentable getCallbackReference(){
        return new Closure();
    }
}
