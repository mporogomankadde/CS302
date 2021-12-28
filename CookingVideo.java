package Mid_Term_Project;

public class CookingVideo extends Video implements CookingVideos {
    private Recipe recipe;

    public CookingVideo() {
        super();
        recipe = recipe;
    }

    public CookingVideo(String title, double durationInMinutes, int views, int likes, double watchTime, Recipe recipe) {
        super(title, durationInMinutes, views, likes, watchTime);
        this.recipe = recipe;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public Recipe getCookingRecipe() {
        return getRecipe();
    }

    @Override
    public  String [] getIngredientsList() {
         return recipe.getIngredients().split(" ");

    }

    @Override
    public  void  printRecipe() {
        String [] x = getIngredientsList();
        String str = " ";
        for( String s : x){
            str += s + " ";
        }
        System.out.println( "Dish: "+ recipe.getRecipeName() + " \n"+
                            "Ingredients: "+ getIngredientsList() + "\n"+
                            "Directions: "+ recipe.getInstruction() + "\n"+
                            "Prep Time: "+ recipe.getPrepTime() + " minutes." + "\n"+
                            "Cooking time: "+ recipe.getCookingTime()+ " minutes." + "\n"+
                            "Serving size: "+ recipe.getServings() + ".") ;

    }

    @Override
    public String toString() {
        return "CookingVideo: {" + super.toString() +
                "Recipe: " + recipe +
                '}';
    }
}
