package mira.space.builder.builders;

import mira.space.builder.meal.Soup;

public class SoupBuilder implements Builder {

    private Soup soup;

    public SoupBuilder() {
        this.soup = new Soup();
    }

    @Override
    public Builder reset() {
        this.soup = new Soup();
        return this;
    }

    @Override
    public Builder withMeat() {
        soup.getIngredients().add("meat");
        return this;
    }

    @Override
    public Builder withVegetables() {
        soup.getIngredients().add("vegetables");
        return this;
    }

    @Override
    public Builder withMushrooms() {
        soup.getIngredients().add("mushrooms");
        return this;
    }

    @Override
    public Builder withCheese() {
        soup.getIngredients().add("cheese");
        return this;
    }

    @Override
    public Builder withNoodle() {
        soup.getIngredients().add("noodle");
        return this;
    }

    public Soup getResult() {
        return soup;
    }
}
