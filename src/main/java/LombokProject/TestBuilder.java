package LombokProject;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@lombok.Builder(
        builderClassName = "TestBuilderClassName",
        builderMethodName = "TestBuilderMethodName",
        toBuilder = true
)
public class TestBuilder {
    @NonNull String testBuilderName;

    public String getTestBuilderName(){
        return this.testBuilderName;
    }
}
