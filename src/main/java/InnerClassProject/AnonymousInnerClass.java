package InnerClassProject;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        /**
         * 匿名内部类
         *
         * 也可以在接口上使用匿名内部类，只需将 AnonymousPerson 从 abstract 换成 Interface
         *
         * 使用匿名内部类的前提是需要继承父类或者实现接口（因为需要一个创建对象的方法）
         */
        AnonymousPerson p = new AnonymousPerson() {
            public void eat() {
                System.out.println("eat something");
            }
        };
        p.eat();
    }
}
