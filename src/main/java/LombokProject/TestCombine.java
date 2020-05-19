package LombokProject;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TestCombine {
    @NonNull String name;

    public String getName(){
        return this.name;
    }

    // 在静态方法上面写 @lombok 的作用是得到不同的 Builder
    // 不同的 Builder 对应了不同的 builderMethodName
    @lombok.Builder(builderClassName = "TestCombineBuilder", builderMethodName = "testCombineBuilder")
    public static TestCombine create(@NonNull String name){
        return new TestCombine(name);
    }

    @lombok.Builder(builderClassName = "TestCombineBuilder2", builderMethodName = "testCombineBuilder2")
    public static TestCombine create2(@NonNull String name){
        return new TestCombine(name);
    }
}
