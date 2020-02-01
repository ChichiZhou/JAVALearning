package InterfaceAndAbstract;

public class Cat implements Play{
    String name;
    public void setPlayname(String input) {
        this.name = input;
    }

    public void displayPlayName(){
        System.out.println(name);
    }
}
