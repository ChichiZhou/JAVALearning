package InterfaceAndAbstract;

public class HeadFirstProject {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name("时琳");
        Cat cat1 = new Cat();
//        dog1.Interfacename = "f";  Interface 中定义的实例变量是不能改变的
        /**
         * Interface
         */
        dog1.setPlayname("周赫");
        cat1.setPlayname("时琳");
        System.out.println(dog1.name);

        /**
         * 接口也可以当做是"合同"
         */
        Play[] playlist = new Play[2];

        playlist[0] = dog1;
        playlist[1] = cat1;

        for (Play playbody: playlist){
            playbody.displayPlayName();
        } // Interface 中的实例变量是不能改变的



    }
}
