package InnerClassProject;

public class ClosureAndCallback {
    public static void main(String[] args) {
        /**
         * 可以认为 JAVA 中处处都是闭包。
         * 这里的闭包是指内部类可以引用外部类的所有方法及对象。
         * 因为内部类本身就是由外部类创建的。
         * 先创建外部类，才能创建内部类
         */
        Callee1 callee1 = new Callee1();
        Callee2 callee2 = new Callee2();

        MyIncrement.fun(callee2);

        Caller c1 = new Caller(callee1);
        Caller c2 = new Caller(callee2.getCallbackReference());   // callee2.getCallbackReference 返回的是一个闭包

        c1.go();
        c1.go();
        c2.go();
        c2.go();


    }

}
