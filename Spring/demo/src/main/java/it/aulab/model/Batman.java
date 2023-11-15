package it.aulab.model;

public class Batman {
    //!attributi
    private Suite suite;
    private Batmobile batmobile;
    
    public Batman(Suite suite, Batmobile batmobile) {
        System.out.println("Create Batman");
        this.suite = suite;
        this.batmobile = batmobile;
    }

    public Batman() {
    }

    //? getter Suite
    public Suite getSuite() {
        return suite;
    }
    //? setter Suite
    public void setSuite(Suite suite) {
        this.suite = suite;
    }
    
    //? getter Batmobile
    public Batmobile getBatmobile() {
        return batmobile;
    }
    //?setter Batmobile
    public void setBatmobile(Batmobile batmobile) {
        this.batmobile = batmobile;
    }
}

