package AdvancedSyntax;

public class Son<T> extends Father<T>{
    /**
     * 这里子类和父类都要是 T 才行
     * @param data
     */
    public Son(T data){
        super(data);
    }
}
