package LombokProject;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 自动生成一个对类中所有带 @NonNull 和 final 的成员变量所生成的构造函数
 */
@RequiredArgsConstructor
public class TestLombok {
    @NonNull public final String name;
    final Integer age;

    public String getName(){
        return this.name;
    }
}
