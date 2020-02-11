package AdvancedSyntax;

public class Father <T>{
    T data;
    public Father(T data){
        this.data = data;
    }

    public String toString(){
        return "Father" + this.data;
    }
}
