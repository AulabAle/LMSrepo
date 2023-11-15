package it.aulab.model;

public class Suite {
    private String color;
    // attributo con la classe mask
    private Mask mask;

    private Hook hook;

    public Suite(String color, Mask mask, Hook hook) {
        System.out.println("Create Suite color:" + color);
        this.color = color;
        this.mask = mask;
        this.hook = hook;
    }

    public Suite() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Mask getMask() {
        return mask;
    }

    public void setMask(Mask mask) {
        this.mask = mask;
    }

    public Hook getHook() {
        return hook;
    }

    public void setHook(Hook hook) {
        this.hook = hook;
    }
}
