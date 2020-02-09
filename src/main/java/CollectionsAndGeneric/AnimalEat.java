package CollectionsAndGeneric;

import java.util.ArrayList;

public class AnimalEat {
    ArrayList<Animal> animalList = new ArrayList<Animal>();
    ArrayList<Dog> dogList = new ArrayList<>();


    public static void main(String[] args) {
        AnimalEat eatlist = new AnimalEat();
        eatlist.go();
    }
    public void go(){
        animalList.add(new Dog());
        animalList.add(new Cat());

        takeAnimals(animalList);
//        takeAnimals(dogList);        // 这么写是错的，对于容器中的泛型，不存在多态这个概念
        sameWithTakeAnimlas(animalList);
        System.out.println("Another Way");
        anotherWay(animalList);
        System.out.println("Add new element");
        addAnimalList(dogList, new Dog());
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

    public void anotherWay(ArrayList<Animal> list){
        for (Animal animal : list){
            animal.eat();
        }
    }

    public <T extends Animal> void addAnimalList(ArrayList<T> list, T newone){  // 在返回类型前加一个 T，表示的作用是告诉编译器编译的时候就识别它的类型，
                                                                                // 如果传入的T是A类型，那么你就不可以将B类型传入方法中去；
        list.add(newone);
    }

    public <T> void anotherAddAnimalList(ArrayList<T> list, T newone){
        list.add(newone);
    }
}
