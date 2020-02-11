package AdvancedSyntax;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class Fruit {
    @NonNull String name;

    public String toString(){
        return this.name;
    }
}
