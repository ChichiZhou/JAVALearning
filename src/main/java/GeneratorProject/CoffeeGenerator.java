package GeneratorProject;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements DefinedGenerator<Coffee>, Iterable<Coffee> {

    private Class[] types = {Lattee.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};
    private static Random rand = new Random(47);

    public CoffeeGenerator(){}

    private int size = 0;
    public CoffeeGenerator(int sz) {this.size = sz;}

    @Override public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    @Override public Coffee next() {
        try{
            return (Coffee) types[rand.nextInt(types.length)].newInstance();      // 这个是 Class 的用法
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee>{
        int count = size;
        public boolean hasNext(){return count >0;}
        public Coffee next(){
            count--;
            return CoffeeGenerator.this.next();            // 使用 next() 来调用 CoffeeGenerator 中的 next()
        }
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }

}
