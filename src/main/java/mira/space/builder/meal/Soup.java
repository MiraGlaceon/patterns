package mira.space.builder.meal;

import java.util.ArrayList;
import java.util.List;

public class Soup {

    private List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Soup with {\n");
        for (String s : ingredients) {
            stringBuilder.append("\t");
            stringBuilder.append(s);
            stringBuilder.append("\n");
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
