package EnumProject;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum Day {
    Monday("Today is Monday"){
        @Override
        String getPeriod(){
            return "1";
        }
    },
    Tuesday("Today is Tuesday"){
        @Override
        String getPeriod(){
            return "2";
        }

    };

    @Getter
    @NonNull
    private final String type;

    abstract String getPeriod();

//    private static final ImmutableMap<String, Day> BY_TYPE =
//            Maps.uniqueIndex(Arrays.stream(Day.values().), Day::getType);

//    private static final String BY_TYPE = Day.getType();

//    public String toString(){             // 如果重载 toString，则 toString 会默认调用 name，返回值是这个 enum 的名字
//        return defaultLocalizedText;
//    }
}
