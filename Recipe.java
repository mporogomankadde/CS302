package Mid_Term_Project;

import java.util.List;

public final class Recipe implements Cloneable {
    private final String recipeName;
    private final String ingredients;
    private final  String instruction;
    private final  int prepTime;
    private final int cookingTime;
    private final int servings;
    public Recipe(){
        this.recipeName = "Pecan Pie";
        this.ingredients = "Pecan, Flour, Water.";
        this.instruction = "Pour water on top of flour. Mix thoroughly. Add pecans. Bake for 30 minutes. ";
        this.prepTime = 15 ;
        this.cookingTime = 30;
        this.servings = 4;
    }

    public Recipe(String recipeName, String ingredients, String instruction, int prepTime,int cookingTime, int servings) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.instruction = instruction;
        this.prepTime = prepTime;
        this.cookingTime = cookingTime;
        this.servings = servings;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstruction() {
        return instruction;
    }
    public int getPrepTime() {
        return prepTime;
    }
    public int getCookingTime(){
        return cookingTime;
    }
    public int getServings() {
        return servings;
    }
    @Override
    protected Object clone() {
        return this;
    }

    @Override
    public String toString() {
        return "Recipe: {" +
                "  RecipeName: " + recipeName +
                ", Ingredients: " + ingredients +
                ", Instruction: " + instruction +
                ", PrepTime: " + prepTime +
                ", CookingTime: " + cookingTime +
                ", Servings: " + servings +
                '}';
    }
}
