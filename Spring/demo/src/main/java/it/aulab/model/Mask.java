package it.aulab.model;

public class Mask {
    private String color;

    public Mask(String color) {
        System.out.println("Create Mask");
        this.color = color;
    }

    public Mask() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}