package it.aulab;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.aulab.model.Batman;
import it.aulab.model.Batmobile;
import it.aulab.model.Hook;
import it.aulab.model.Mask;
import it.aulab.model.Suite;

@Configuration
@ComponentScan({"it.aulab.repository","it.aulab.service"})
public class AppConfig {
    @Bean(name = "batmanBlack")
    //@Scope("singleton")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public Batman geBatmanBlack(){
        return new Batman(getSuiteBlack(), getBatmobile());
    }

    @Bean(name = "batmanWhite")
    //@Scope("singleton")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public Batman geBatmanWhite(){
        return new Batman(getSuiteWhite(), getBatmobile());
    }
    
    @Bean(name = "batmobile")
    //@Scope("prototype")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Batmobile getBatmobile(){
        return new Batmobile("Batmobile1", "black");
    }

    @Bean(name = "hook")
    public Hook getHook(){
        //istanza di una classe Hook con valore int 10
        return new Hook(10);
    }

    @Bean(name = "mask")
    public Mask getMask(){
        return new Mask("black");
    }

    @Bean(name = "suiteBlack")
    public Suite getSuiteBlack(){
        return new Suite("grey", getMask(), getHook());
    }

    @Bean(name = "suiteWhite")
    public Suite getSuiteWhite(){
        return new Suite("white", getMask(), getHook());
    }
}
