package it.aulab;

import java.util.List;

public interface Dao<T> {
    //fa il count delle righe nella tabella
    public int count();
   
    //Metodo per recuperare la lista oggetti
    // Deriva dalla query select * from ...
    public  List<T> getData();
   
    //meoto per reperarne solo uno
    public T getOne(Long id);
   
    //booleano per vedere il modello e' stato inserito o meno
    public boolean insert(T model);
   
    //update, ha in ingresso l'id del modello da aggiornare,e i nuovi dati da inserire
    public boolean update(Long id, T model);
   
    //non c'e' bisogno di inserire il model in questo cacello quello con l'id indicato.
    public boolean delete(Long id);
}
