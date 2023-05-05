package mira.space.builder.builders;

import mira.space.builder.meal.Pizza;

public class PizzaBuilder implements Builder {

    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public Builder reset() {
        this.pizza = new Pizza();
        return this;
    }

    @Override
    public Builder withMeat() {
        pizza.getIngredients().add("meat");
        return this;
    }

    @Override
    public Builder withVegetables() {
        pizza.getIngredients().add("vegetables");
        return this;
    }

    @Override
    public Builder withMushrooms() {
        pizza.getIngredients().add("mushrooms");
        return this;
    }

    @Override
    public Builder withCheese() {
        pizza.getIngredients().add("cheese");
        return this;
    }

    @Override
    public Builder withNoodle() {
        pizza.getIngredients().add("noodle");
        return this;
    }

    public Pizza getResult() {
        return pizza;
    }
}
