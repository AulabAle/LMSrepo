import java.util.Objects;

public class Drink {
    private String name;
    private int price;
    
    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object drink) {

        Drink other = (Drink) drink;

        if(other.getName().equals(this.getName())){
            if(other.getPrice() == this.getPrice()) return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

}
