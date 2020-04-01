package Annotation;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName="of")
/**
 * 如果使用 RequiredArgsConstructor 则得到的是一个只针对
 * NonNull 和 常量的构造器，直接用 new ImplementBuilder2(1, "One")
 *
 * 如果使用 RequiredArgsConstructor(staticName="of") 则会创建一个名为 of 的静态方法
 * 使用 ImplementBuilder2.of(3, "Three"); 来调用
 *
 */

public class ImplementBuilder2 {
    @NonNull
    public int foo;
    @NonNull
    public String bar;



//    @lombok.Builder(builderClassName = "Builder")
//    public static ImplementBuilder2 create(@NonNull final int foo, @NonNull final String bar){
//        return new ImplementBuilder2(foo, bar);
//    }
}
