package it.aulab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.aulab.repository.BatmanRepository;

@Component("batmanService")
public class BatmanServiceImpl implements BatmanService{

    @Autowired
    private BatmanRepository repository;

    public BatmanServiceImpl() {
        System.out.println("Create service");
    }

    public BatmanRepository getRepository() {
        return repository;
    }

    public void setRepository(BatmanRepository repository) {
        this.repository = repository;
    }

    @Override
    public void attack() {
        if(this.repository.getBatman() != null)
        System.out.println("Batman attack colore" + this.repository.getBatman().getSuite().getColor());
    }
    @Override
    public void climbing() {
        if(this.repository.getBatman() != null)
        System.out.println("Batman rapino!!!!");
    }
    @Override
    public void glide() {
        if(this.repository.getBatman() != null)
        System.out.println("Batman cadere con stile!");
    }
    @Override
    public void goForwardWithBatmobile() {
        if(this.repository.getBatman() != null)
        System.out.println("Batman panda avanti");
    }
    @Override
    public void goBackWithBatmobile() {
        if(this.repository.getBatman() != null)
        System.out.println("Batman opanda non entra la retro!");
    }

}
