package mira.space.builder.director;

import mira.space.builder.builders.Builder;

public class Director {
    public static void cookNoodleSoup(Builder builder) {
        builder.withVegetables()
                .withMeat()
                .withNoodle();
    }
}
