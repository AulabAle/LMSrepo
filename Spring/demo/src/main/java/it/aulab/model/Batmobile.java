package it.aulab.model;

public class Batmobile {
    private String name;
    private String color;

    public Batmobile(String name, String color) {
        System.out.println("Create Batmobile");
        this.name = name;
        this.color = color;
    }

    public Batmobile() {
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

