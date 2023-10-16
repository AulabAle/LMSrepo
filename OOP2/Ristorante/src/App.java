public class App {
    public static void main(String[] args) throws Exception {

        String[] dish1Ingr = {"Porco","Pasta","Amore"};
        String[] dish2Ingr = {"Patate","Salsa di patate","Maionese"};
        String[] dish3Ingr = {"Gallina","Pesto","Olive"};

        Dish dish1 = new Dish("Pasta al porco", 32, dish1Ingr);
        Dish dish2 = new Dish("Patate con patate", 12, dish2Ingr);
        Dish dish3 = new Dish("Gallina al pesto", 21, dish3Ingr);

        Drink drink1 = new Drink("Birra costosa", 10);
        Drink drink2 = new Drink("Aperol Spruz", 15);
        Drink drink3 = new Drink("Gin Panic", 13);

        Dish[] dishes = {dish1, dish2, dish3};
        Drink[] drinks = {drink1, drink2, drink3};

        Restaurant rest1 = new Restaurant("La ciccia del capo!", dishes, drinks);

        rest1.stampaMenu();
    }
}
