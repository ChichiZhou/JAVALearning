package AdvancedSyntax;

public class Generic<T> {
    /**
     * 泛型方法使得方法能够独立于类而产生变化
     *
     * 无论何时只要你能做到就尽量用泛型方法
     * @param t
     */
    void show_1(T t) {
        System.out.println("show_1  " + t.toString());
    }

    <E> void show_2(E e) {
        System.out.println("show_2  " + e.toString());
    }

    <T> void show_3(T t) {
        System.out.println("show_3  " + t.toString());
    }

}
