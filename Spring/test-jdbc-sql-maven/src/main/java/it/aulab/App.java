package it.aulab;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.aulab.model.Product;

public class App {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //chiedo application contex di darmi il DAO,
        //possiamo anche passare il nome ma essendo l'unica classe io passero' il tipo
        ProductDao dao = context.getBean(ProductDao.class);
        //prendi un elemento, andiamo ad usare per ora la sola funzione creata nel ProductDao
        //per scegliere un elemento passiamo in questo caso un numero che corrisponde all id 1 possiamo passarlo in due modi
        //primo modo id e' di tipo long e lo istanziamo con la sintassi 1L
        //questo e' il secondo metodo ma e' una dicitura deprecata
        //dao.getOne(new Long(1));

        //System.out.println("I prodotti sono " + dao.count());

        // Product p = dao.getOne(1L);
        // System.out.println("id del prodotto: " + p.getId());
        // System.out.println("nome del prodotto: " + p.getName());
        // System.out.println("descrizione del prodotto: " + p.getDescription());
        // System.out.println("prezzo del prodotto: " + p.getPrice());

        //funzione per la lista degli elementi
        //stampa della lista dei record
        // System.out.println("lista dei record presenti nel database");

        // List<Product> all = dao.getData();

        // //ciclo foreach per stampa dei degli elementi
        // for (Product product : all) {
        //     System.out.println("id del prodotto: " + product.getId());
        //     System.out.println("nome del prodotto: " + product.getName());
        //     System.out.println("descrizione del prodotto: " + product.getDescription());
        //     System.out.println("prezzo del prodotto: " + product.getPrice());
        //     System.out.println();
        // }

        // //creazione di un nuovo oggetto dalla classe Product
        // Product newProduct = new Product();
        // //set dei parametri
        // newProduct.setName("Nuovo Prodotto");
        // newProduct.setDescription("Prodotto nuovissimo");
        // newProduct.setPrice(30.5F);
        // //richiamo della funzione di inserimento
        // dao.insert(newProduct);
        // //conteggio totale dei prodotti dopo l'inserimento
        // System.out.println("numero totale prodotti in magazzino dopo inserimento: " + dao.count());

        // dao.delete(5L);
        // dao.delete(6L);

        // System.out.println("numero totale prodotti in magazzino dopo inserimento: " + dao.count());

        // Product updateProduct = all.get(0);
        // updateProduct.setDescription("nuova descrizione inserita");
        // dao.update(updateProduct.getId(), updateProduct);


        System.out.println("lista dei record presenti nel database con prezzo > di 50");
        List<Product> productsGreaterThan50 = dao.getGreaterThanPrice(50.0F);
        for (Product product : productsGreaterThan50) {
            System.out.println("id del prodotto: " + product.getId());
            System.out.println("nome del prodotto: " + product.getName());
            System.out.println("descrizione del prodotto: " + product.getDescription());
            System.out.println("prezzo del prodotto: " + product.getPrice());
        }


    }

}

