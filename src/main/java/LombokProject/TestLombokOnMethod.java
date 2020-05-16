package LombokProject;

import lombok.NonNull;

public class TestLombokOnMethod {
    @NonNull
    String name;

    public String getName(){
        return this.name;
    }

    @lombok.Builder(builderClassName = "TestLombokOnMethodBuilder", toBuilder = true)
    public static TestLombokOnMethod create(@NonNull String name){
        TestLombokOnMethod testLombokOnMethod = new TestLombokOnMethod();
        testLombokOnMethod.name = name;

        return testLombokOnMethod;
    }
}
