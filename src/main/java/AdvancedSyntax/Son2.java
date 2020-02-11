package AdvancedSyntax;

public class Son2<T> extends Father<Integer>{
    /**
     * 这里可以另外加子类的泛型
     */
    T otherData;

    public Son2(Integer data, T otherData) {
        super(data);                            // 这里是 super(data)!!!! 不是 super.(data)！！！！！
        this.otherData = otherData;
    }
}

