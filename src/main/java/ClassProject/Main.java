package ClassProject;

public class Main {
    /**
     * 使用 .class 的作用是为了知道某个泛化引用的确切类型
     *
     * Class 又称为 类型信息
     * Class 对象包含了与这个类相关的所有信息。要知道 Class 包含哪些信息，只需要在看这个 Class 类 即可。
     * 这里理解 "类的相关信息" 是指 类名，比如 ClassProject.FancyToy 以及这个类都实行了哪些接口，实现了哪些方法
     * 比如 for(Class face: c.getInterfaces()){
     *             printInfo(face);
     *         }
     *         输出 ClassProject.HasBatteries
     *
     * 和反射有点关系
     *
     * 这里的反射是指 当你获取了一个指向某个并不在你的程序空间中的对象的引用时，用反射来访问这个类。并且获取类的信息
     * https://jesse505.github.io/2018/03/04/2018-03-04-Java-reflect-01/
     *
     */
    static void printInfo(Class cc){
        System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try{
            c = Class.forName("ClassProject.FancyToy");        // 根据类名得到这个类到 Class 对象
        } catch(ClassNotFoundException e){                     // 也可以根据这个类所产生到对象得到这个 Class 对象 （使用 getClass()）
            System.out.println("Cant find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for(Class face: c.getInterfaces()){
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try{
            obj = up.newInstance();
        } catch (InstantiationException e){
            System.out.println("Cant instantiate");
            System.exit(1);
        }
        catch(IllegalAccessException e){
            System.out.println("Cant access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }

}
