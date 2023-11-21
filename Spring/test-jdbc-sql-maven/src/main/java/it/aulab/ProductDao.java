package it.aulab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import it.aulab.model.Product;

@Component
public class ProductDao implements Dao<Product>{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        return jdbcTemplate.queryForObject("SELECT count(*) FROM products", Integer.class);
    }

    @Override
    public boolean delete(Long id) {
        int result = jdbcTemplate.update("delete from products where id = ?", id);
        return result >0;
    }

    @Override
    public List<Product> getData() {
        //il metodo query mi restituisce una lista
        return jdbcTemplate.query("SELECT * FROM products", new BeanPropertyRowMapper<Product>(Product.class));
    }

    @Override
    public Product getOne(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM products WHERE id= ?", new BeanPropertyRowMapper<Product>(Product.class), id);
    }

    @Override
    public boolean insert(Product model) {
        //col metodo update di jdbctamplate posso fare tutte le modifiche ai miei dati tra cui le insert
        int result = jdbcTemplate.update("insert into products (name, description, price) value (?,?,?)", model.getName(), model.getDescription(), model.getPrice()
        );
       
        return result > 0;
    }

    @Override
    public boolean update(Long id, Product model) {
        int result = jdbcTemplate.update("UPDATE products SET name = ?, description = ?, price = ? WHERE id = ? ", model.getName(),model.getDescription(),model.getPrice(),id);
        return result >0;
    }

    public List<Product>getGreaterThanPrice(Float minPrezzo ){
        return jdbcTemplate.query(
            "select * from products where price > ?",
            new BeanPropertyRowMapper<Product>(Product.class), minPrezzo
        );
    }

}
