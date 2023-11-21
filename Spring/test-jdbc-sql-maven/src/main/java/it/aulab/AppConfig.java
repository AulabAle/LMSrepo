package it.aulab;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("it.aulab")
public class AppConfig {
    
    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //settaggio
        //!classe java della connessione = Il connettore di mysql
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/jdbcTest");
        //inserire il nome utente di accesso a MySQL server
        dataSource.setUsername("root");
        //inserire la password di accesso a MySQL server
        dataSource.setPassword("root");
        return dataSource;
    }


    @Bean
    public JdbcTemplate getjJdbcTemplate(){
        //la configurazione e' il datasource
        return new JdbcTemplate(getDataSource());
    }


}
