package EnumProject;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Day {
    Monday("Today is Monday"),
    Tuesday("Today is Tuesday");

    @NonNull private final String defaultLocalizedText;

//    public String toString(){             // 如果重载 toString，则 toString 会默认调用 name，返回值是这个 enum 的名字
//        return defaultLocalizedText;
//    }
}
