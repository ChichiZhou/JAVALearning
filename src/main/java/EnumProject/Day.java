package EnumProject;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

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

    @SuppressWarnings("ConstantConditions")
    static Map<String, Day> BY_TYPE =
        Maps.uniqueIndex(Arrays.stream(Day.values()).iterator(), Enum::name);

    static Optional<Day> get(String type){
        return Optional.ofNullable(BY_TYPE.get(type));
    }

}
