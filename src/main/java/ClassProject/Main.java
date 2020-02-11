package ClassProject;

public class Main {
    /**
     * 使用 .class 的作用是为了知道某个泛化引用的确切类型
     *
     * Class 又称为 类型信息
     * Class 对象包含了与这个类相关的所有信息
     *
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
            c = Class.forName("ClassProject.FancyToy");
        } catch(ClassNotFoundException e){
            System.out.println("Cant find FancyToY");
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
