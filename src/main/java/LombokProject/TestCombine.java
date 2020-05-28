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
    // 设置不同的 builder 就是为了设置不同的构造方法。同一个class 可以有很多构造方法
    @lombok.Builder(builderClassName = "TestCombineBuilder", builderMethodName = "testCombineBuilder")
    // 把 create 的参数从 name 改成 inputValue
    public static TestCombine create(@NonNull String inputValue){
        return new TestCombine(inputValue + "HEZHO");
    }

    @lombok.Builder(builderClassName = "TestCombineBuilder2", builderMethodName = "testCombineBuilder2")
    public static TestCombine create2(){
        return new TestCombine("Shillin");
    }

    @lombok.Builder(builderClassName = "TestCombineBuilder3", builderMethodName = "testCombineBuilder3", toBuilder = true)
    public static TestCombine create3(){
        return new TestCombine("HEZHO");
    }
}
