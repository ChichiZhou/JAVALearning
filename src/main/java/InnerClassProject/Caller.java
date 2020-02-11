package InnerClassProject;

public class Caller {
    private Increamentable callbackReference;

    Caller(Increamentable cbh) {
        this.callbackReference = cbh;
    }

    void go(){
        this.callbackReference.increment();
    }
}
