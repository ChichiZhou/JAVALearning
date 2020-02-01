package CollectionsAndGeneric;

import java.util.ArrayList;

public class AnimalEat {
    ArrayList<Animal> animalList = new ArrayList<Animal>();

    public static void main(String[] args) {
        AnimalEat eatlist = new AnimalEat();
        eatlist.go();
    }
    public void go(){
        animalList.add(new Dog());
        animalList.add(new Cat());

        takeAnimals(animalList);
        sameWithTakeAnimlas(animalList);
    }

    /**
     * 这里使用泛型方法对容器进行限制
     */
    public <T extends Animal> void takeAnimals(ArrayList<Animal> list){
        for (Animal animal : list){
            animal.eat();
        }
    }

    /**
     * 这种写法是一样的
     */

    public void sameWithTakeAnimlas(ArrayList<? extends Animal> list){
        for (Animal animal : list){
            animal.eat();
        }
    }
}
