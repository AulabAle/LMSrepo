import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        String[] dish1Ingr = {"Porco","Pasta","Amore"};
        String[] dish2Ingr = {"Patate","Salsa di patate","Maionese"};
        String[] dish3Ingr = {"Gallina","Pesto","Olive", "Latte"};

        Dish dish1 = new Dish("Pasta al porco", 32, dish1Ingr);
        Dish dish2 = new Dish("Patate con patate", 12, dish2Ingr);
        Dish dish3 = new Dish("Gallina al pesto", 21, dish3Ingr);

        Drink drink1 = new Drink("Birra costosa", 10);
        Drink drink2 = new Drink("Aperol Spruz", 15);
        Drink drink3 = new Drink("Gin Panic", 13);

        Dish[] dishes = {dish1, dish2, dish3};
        Drink[] drinks = {drink1, drink2, drink3};


        //?Creare una List con N oggetti di una classe creata da voi. Creare un’altra List vuota, ciclare la prima lista filtrando gli elementi in base ad un criterio scelto da voi e inserire gli elementi nella seconda lista

        // //!Uso l'ArrayList perché piú veloce in ricerca e lettura
        // List<Dish> dishList = new ArrayList<Dish>();

        // for (Dish dish : dishes) {
        //     dishList.add(dish);
        // }

        // System.out.println("Tutte le pietanze: ");
        // for (Dish dish : dishList) {
        //     System.out.println(dish.getName());
        // }

        // Dish.pietanzeSenzaLattosio(dishList);


        //?Creare una Set che contenga degli oggetti di una classe creata da voi che non ammetta ripetizioni ( sovrascrivendo i metodi equals e hashcode )

        // Set<Drink> drinks = Set.of(
        //     new Drink("Birra costosa", 10),
        //     new Drink("Aperol Spruz", 15),
        //     new Drink("Gin Panic", 13),
        //     new Drink("Birra costosa", 10)
        // );

        // for (Drink drink : drinks) {
        //     System.out.println(drink.getName());
        // }


        //? Creare una mappa con degli oggetti, chiedere all’utente di inserire una chiave e provare a cercare l’oggetto corrispondente nella mappa
        //? Non sapevo che fare e per non rompere la roba precedente mi sono inventato un drink con codice :D

        // Map<String, DrinkWithCode> menuDrinks = new HashMap<String, DrinkWithCode>();

        // DrinkWithCode drinkCode1 = new DrinkWithCode("Birra costosa", 10, "H10BTR");
        // DrinkWithCode drinkCode2 = new DrinkWithCode("Aperol Spruz", 15, "NHF64F");
        // DrinkWithCode drinkCode3 = new DrinkWithCode("Gin Panic", 13, "KDH5G3");

        // menuDrinks.put(drinkCode1.getCode(), drinkCode1);
        // menuDrinks.put(drinkCode2.getCode(), drinkCode2);
        // menuDrinks.put(drinkCode3.getCode(), drinkCode3);

        // Scanner ins = new Scanner(System.in);
        // System.out.println("Inserisci il codice da ricercare: ");
        // String code = ins.nextLine();

        // if (menuDrinks.containsKey(code)) {
        //     DrinkWithCode drinkTrovato = menuDrinks.get(code);
        //     System.out.println("Il drink con codice " + code + " è " + drinkTrovato.getName());
        // } else {
        //     System.out.println(code + " non è presente!");
        // }

        // //!lo so potevo anche creare un codice incrementale ad cazzum ma ho voluto restare fedele alla lezione :D


        //?Scrivere un programma Java per aggiornare un elemento della lista specifico in base al suo indice. esempio, create una lista di persone, chiedete all’utente quale persona vuole modificare, chiedete i dati e aggiornate quell’elemento della lista

        // List<Drink> drinkList = new ArrayList<Drink>();

        // for (Drink drink : drinks) {
        //     drinkList.add(drink);
        // }

        // System.out.println("Tutti i drink: ");

        // for (int i = 0; i < drinkList.size(); i++) {
        //     System.out.println("[" + i + "]" + drinkList.get(i).getName() + " prezzo " + drinkList.get(i).getPrice() + " Euri ");
        // }

        // Scanner ins = new Scanner(System.in);
        // System.out.println("Vuoi modificare un dato? (y/n): ");
        // String selection = ins.nextLine();


        // if(selection.equalsIgnoreCase("y")){

        //     System.out.println("Quale dato vuoi modificare? (indica l'indice): ");
        //     int index = ins.nextInt();

        //     Drink drinkModificato = drinkList.get(index);

        //     do{
    
        //         System.out.println("Quale valore vuoi modificare? 1 - nome / 2 - prezzo");
        //         int indexValue = ins.nextInt();

        //         Scanner insValue = new Scanner(System.in);//non chiedermi perché l'ho fatto ma senza non si fermava (penso che lo scanner abbia "visibilitá solo nel blocco di codice")
    
        //         switch (indexValue) {
        //             case 1:
        //                 System.out.println("Inserisci il nuovo nome: ");
        //                 String newName = insValue.nextLine();
        //                 drinkModificato.setName(newName);
        //                 break;
        //             case 2:
        //                 System.out.println("Inserisci il nuovo prezzo: ");
        //                 int newPrice = insValue.nextInt();
        //                 drinkModificato.setPrice(newPrice);
        //                 break;
        //             default:
        //                 System.out.println("Opzione non valida");
        //         }
    
        //         System.out.println("Vuoi continuare a modificare? (y/n)");
        //         Scanner sel = new Scanner(System.in);//non chiedermi perché l'ho fatto ma senza non si fermava
        //         selection = sel.nextLine();
    
        //     }while(selection.equalsIgnoreCase("y"));

        //     drinkList.set(index, drinkModificato);
    
        //     System.out.println("Tutti i drink: ");
    
        //     for (int i = 0; i < drinkList.size(); i++) {
        //         System.out.println("[" + i + "]" + drinkList.get(i).getName() + " prezzo " + drinkList.get(i).getPrice() + " Euri ");
        //     }

        // }else if(selection.equalsIgnoreCase("n")){
        //     System.out.println("Grazie per aver scelto noi!");
        // }else{
        //     System.out.println("Scelta non valida!");
        // }


        //?Scrivere un programma che dichiari una mappa con chiave di tipo string e oggetto a vostra discrezione che prenda in input dei valori, crei un oggetto e aggiunga l’oggetto alla mappa. Dopo provare a rimuovere l’oggetto e cercare nuovamente l’oggetto nella mappa

        // Scanner scanner = new Scanner(System.in);
        // Map<String, DrinkWithCode> menuDrinks = new HashMap<String, DrinkWithCode>();

        // DrinkWithCode drinkCode1 = new DrinkWithCode("Birra costosa", 10, "H10BTR");
        // DrinkWithCode drinkCode2 = new DrinkWithCode("Aperol Spruz", 15, "NHF64F");
        // DrinkWithCode drinkCode3 = new DrinkWithCode("Gin Panic", 13, "KDH5G3");

        // menuDrinks.put(drinkCode1.getCode(), drinkCode1);
        // menuDrinks.put(drinkCode2.getCode(), drinkCode2);
        // menuDrinks.put(drinkCode3.getCode(), drinkCode3);

        // String code = "JT5E38";//genero io il codice per abbreviare tutti i passaggi

        // System.out.println("Inserisci un nome per il drink:");
        // String name = scanner.nextLine();
        // System.out.println("Inserisci un prezzo per il drink:");
        // int price = scanner.nextInt();

        // DrinkWithCode drinkCodeToUse = new DrinkWithCode(name, price, code);

        // System.out.println("Inserimento oggetto!");
        // menuDrinks.put(drinkCodeToUse.getCode(), drinkCodeToUse);

        // System.out.println("Tutti i nuovi drink!");

        // for (Map.Entry<String, DrinkWithCode> drinkWithCode : menuDrinks.entrySet()) {
        //     String keyDrink = drinkWithCode.getKey();

        //     DrinkWithCode drink = menuDrinks.get(keyDrink);

        //     System.out.println(drink.getName() + " - Euri " + drink.getPrice());
        // }

        // System.out.println("Vuoi rimuovere l'oggetto? (y/n)");
        // scanner.nextLine();
        // String risposta = scanner.nextLine();

        // if (risposta.equalsIgnoreCase("y")) {
        //     menuDrinks.remove(code);
        //     System.out.println("Drink rimosso");
        // } else {
        //     System.out.println("Nessuna rimozione effettuata");
        // }

        // System.out.println("Ricerca dell'oggetto!");
        // DrinkWithCode drinkCodeToFind = menuDrinks.get(code);

        // if (drinkCodeToFind != null) {
        //     System.out.println("Drink trovato:");
        //     System.out.println("Nome: " + drinkCodeToFind.getName());
        //     System.out.println("Prezzo: " + drinkCodeToFind.getPrice());
        // } else {
        //     System.out.println("Drink non trovato");
        // }


        //? scrivere un programma che crei una lista di elementi e che ne rimuova i duplicati
        // List<String> lista = new ArrayList<>();
        // lista.add("A");
        // lista.add("B");
        // lista.add("A");
        // lista.add("C");
        // lista.add("B");

        // HashSet<String> set = new HashSet<>(lista);//elimino duplicati tramite set
        // List<String> newList = new ArrayList<>(set);

        // System.out.println("Lista senza duplicati: " + newList);


        //? scrivere una classe che implementi alcuni metodi per le delle liste generiche. Ad esempio una classe che implementa due metodi: uno che ritorna l’elemento maggiore della lista e uno che ritorna l’elemento minore della lista

        // List<String> listaString = new ArrayList<>();
        // listaString.add("A");
        // listaString.add("B");
        // listaString.add("A");
        // listaString.add("C");
        // listaString.add("B");

        // String valoreMinimoString = ListAlgos.min(listaString);
        // String valoreMassimoString = ListAlgos.max(listaString);

        // System.out.println("Valore minore é " + valoreMinimoString);
        // System.out.println("Valore massimo é " + valoreMassimoString);

        // List<Integer> listaInt = new ArrayList<>();
        // listaInt.add(1);
        // listaInt.add(2);
        // listaInt.add(3);
        // listaInt.add(4);
        // listaInt.add(5);

        // int valoreMinimoInt = ListAlgos.min(listaInt);
        // int valoreMassimoInt = ListAlgos.max(listaInt);

        // System.out.println("Valore minore é " + valoreMinimoInt);
        // System.out.println("Valore massimo é " + valoreMassimoInt);


    }
}
