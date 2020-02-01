package InheritanceAndPolymorphism;

public class HeadFirstProject {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // 多态
        animal1.eat();

        Vet vet = new Vet();
        vet.TakeShot(animal1);
    }
}
