package AdvancedSyntax;

public class Son3<E, T> extends Father<T>{
    E otherData;

    public Son3(E otherData, T data){
        super(data);
        this.otherData = otherData;
    }

    public String toString(){
        return "Son3 is " + otherData;
    }


}
