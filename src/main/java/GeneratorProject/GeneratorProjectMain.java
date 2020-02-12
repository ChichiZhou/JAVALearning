package GeneratorProject;

public class GeneratorProjectMain {
    public static void main(String[] args) {
        /**
         * 生成器和工厂类有一些相似，但是工厂类需要你传参数进去，而生成器不需要
         */
        CoffeeGenerator gen = new CoffeeGenerator();
        for(int i = 0; i < 5; i++){
            System.out.println(gen.next());
        }

        for(Coffee c: new CoffeeGenerator(5)){
            System.out.println(c);
        }
    }
}
