import java.util.ArrayList;
import java.util.List;

public class Dish {
    private String name;
    private int price;
    private String[] ingredients;

    public Dish(String name, int price, String[] ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public boolean findIngredient(String ingredientToCheck){
        for (String ingredient : ingredients) {
            if(ingredientToCheck.equalsIgnoreCase(ingredient)) return true;
        }

        return false;
    }


    public static void pietanzeSenzaLattosio(List<Dish> list){
        List<Dish> newDishList = new ArrayList<Dish>();

        //Togliamo i cibi per gli intolleranti al lattosio
        for (int i = 0; i < list.size(); i++) {
            if(!list.get(i).findIngredient("latte")){
                newDishList.add(list.get(i));
            }
        }

        System.out.println("Pietanze senza latte: ");
        for (Dish dish : newDishList) {
            System.out.println(dish.getName());
        }

    }
    
}