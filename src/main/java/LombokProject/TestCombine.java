package LombokProject;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TestCombine {
    @NonNull String name;

    public String getName(){
        return this.name;
    }

    @lombok.Builder(builderClassName = "TestCombineBuilder", toBuilder = true)
    public static TestCombine create(@NonNull String name){
        return new TestCombine(name);
    }
}
