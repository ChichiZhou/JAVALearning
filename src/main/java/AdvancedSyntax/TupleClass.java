package AdvancedSyntax;

public class TupleClass<A, B> {
    public final A first;
    public final B second;
    public TupleClass(A a, B b){
        this.first  = a;
        this.second = b;
    }

    public String toString(){
        return "(" + first + "," + second +")";
    }
}
