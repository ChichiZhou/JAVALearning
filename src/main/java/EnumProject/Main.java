package EnumProject;

public class Main {
    public static void main(String[] args) {
        Day monday = Day.Monday;

        System.out.println("The return for toString is " + monday.toString());
        System.out.println("The return for name is " + monday.name());

        System.out.println("The class info for Day is "+ Day.class);
    }
}
