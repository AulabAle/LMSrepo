public class Restaurant {
    String name;
    Dish[] dishes;
    Drink[] drinks;

    public Restaurant(String name, Dish[] dishes, Drink[] drinks) {
        this.name = name;
        this.dishes = dishes;
        this.drinks = drinks;
    }

    public void stampaMenu(){
        System.out.println("Ecco il menu di oggi:");

        System.out.println("I nostri piatti:");

        for (Dish dish : dishes) {
            System.out.println(dish.getName() + " : " + dish.getPrice() + " Euri");
            System.out.println("Ingredienti: ");

            for (String ingredient : dish.getIngredients()) {
                System.out.println(" " + ingredient + " ");
            }

            //Altro modo
            // String[] ingredients = dish.getIngredients();
            // for (int i = 0; i < ingredients.length; i++) {
            //     System.out.println(" " + ingredients[i] + " ");
            // }
        }

        System.out.println("I nostri drink:");

        for (Drink drink : drinks) {
            System.out.println(" " + drink.getName() + " : " + drink.getPrice() + " Euri");
        }

    }
}
