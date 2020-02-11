package InnerClassProject;

public class InnerClassProject {
    /**
     * 内部类可以隐藏细节，为什么要隐藏细节
     * 10.5 10.6 10.7
     *
     * 匿名内部类
     *
     *
     */
    public static void main(String[] args) {
        InnerClassProject innerClassProject = new InnerClassProject();
        innerClassProject.ship("A");

        InnerClassProject.Contents c = innerClassProject.contents();   // 内部类要通过外部类 + . 来访问 (InnerClassProject.Contents)
        InnerClassProject.Destination d = innerClassProject.to("ABS");
        InnerClassProject.Contents c2 = innerClassProject.new Contents();   // 采用 .new 来创建内部类

    }

    class Contents{
        private int i = 11;
        public int value(){return i;};
    }

    class Inner{
        public InnerClassProject inner(){
            return InnerClassProject.this;         // 采用 .this 来访问外部对象本身
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }

    public Destination to(String s){
        return new Destination(s);
    }

    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }
}
