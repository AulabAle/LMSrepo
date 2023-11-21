import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    static final String connection_string = "jdbc:mysql://localhost:3306/jdbcProg?user=root&password=root";
    public static void main(String[] args) throws Exception {

        Connection connection = DriverManager.getConnection(connection_string);
        try{
            //driver con mysql
            Class.forName("com.mysql.cj.jdbc.Driver");
            Statement statement = connection.createStatement();
            // ResultSet resultSet = statement.executeQuery("SELECT * FROM products");
            // while(resultSet.next()){
            //     System.out.println("id: " + resultSet.getLong("id"));
            //     System.out.println("nome: " + resultSet.getString("name"));
            //     System.out.println("descizione: " + resultSet.getString("description"));
            //     System.out.println("prezzo: " + resultSet.getFloat("price"));
            // }
            ResultSet resultSet = statement.executeQuery("SELECT p.name, v.attribute, v.value FROM productos p join variants v ON p.id = v.product_id");
            // while(resultSet.next()){
            //     System.out.println("nome: " + resultSet.getString("name"));
            //     System.out.println("attributo: " + resultSet.getString("attribute"));
            //     System.out.println("valore: " + resultSet.getString("value"));
            // }
            while(resultSet.next()){
                System.out.println("nome: " + resultSet.getString(1));
                System.out.println("attributo: " + resultSet.getString(2));
                System.out.println("valore: " + resultSet.getString(3));
            }   
        }catch(SQLException e){
            System.out.println("E' stato sollevato un errore SQL");
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("sono nel finally");
            if(connection != null);
            connection.close();
        }



    }

}
