package it.aulab.model;

public class Hook {
    private Integer length;

    public Hook(Integer length) {
        System.out.println("Create Hook");
        this.length = length;
    }

    public Hook() {
    }

    //getter
    public Integer getLength() {
        return length;
    }
    
    //setter
    public void setLength(Integer length) {
        this.length = length;
    }

}
