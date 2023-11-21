package it.aulab.model;

public class Product {
    // attributi
    private Long id;
    private String name;
    private String description;
    private Float price;

    //generazione del costruttore vuoto
    //e' preferibile vuoto in quanto questo e' un formato che vedremo nella JPA
    public Product() {
    }

    //generazione dei Gatter e Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

}
