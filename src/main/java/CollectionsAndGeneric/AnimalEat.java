package CollectionsAndGeneric;

import java.util.ArrayList;

public class AnimalEat {
    ArrayList<Animal> animalList = new ArrayList<Animal>();
    ArrayList<Dog> dogList = new ArrayList<>();


    public static void main(String[] args) {
        AnimalEat eatlist = new AnimalEat();
        eatlist.go();
        // 这个输出的是
        // The class info is class CollectionsAndGeneric.AnimalEat
        System.out.println("The class info is" + " " + eatlist.getClass());

//        sameWithTakeAnimlas(dogList);  // 这么写是错的，对于容器中的泛型，不存在多态这个概念
        Animal newOne = new Dog();


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
        addAnimals(animalList, new Dog());
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

    public <T extends Animal> void addAnimals(ArrayList<Animal> list, T newOne){   // 这个方法可以添加 new Dog() 或者 new Cat()
        System.out.println("Add new element into Animal List");                         // 因为这些都是继承了 Animal 这个接口的
        list.add(newOne);                                                               // 但是这个 list 只能是 Animal
                                                                                   // 这里用 <T extends Animal> 的意识是，凡是用 T 的地方，T 都要是 Animal 的子类
    }

    public <T extends Animal> void addAnimalList(ArrayList<T> list, T newone){  // 在返回类型前加一个 T，表示的作用是告诉编译器编译的时候就识别它的类型，
                                                                                // 如果传入的T是A类型，那么你就不可以将B类型传入方法中去；
        System.out.println("This can add dogList because there is no type in the ArrayList<T>");
        list.add(newone);
    }



}
