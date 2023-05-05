package mira.space.builder;

import mira.space.builder.builders.PizzaBuilder;
import mira.space.builder.builders.SoupBuilder;
import mira.space.builder.director.Director;
import mira.space.builder.meal.Pizza;
import mira.space.builder.meal.Soup;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = (PizzaBuilder) new PizzaBuilder()
                .withMeat()
                .withMushrooms()
                .withVegetables()
                .withCheese();
        Pizza pizza = pizzaBuilder.getResult();
        System.out.println(pizza);

        SoupBuilder soupBuilder = new SoupBuilder();
        Director.cookNoodleSoup(soupBuilder);
        Soup soup = soupBuilder.getResult();
        System.out.println(soup);
    }
}
