import com.workintech.abstarction.product.Bread;
import com.workintech.abstarction.product.Chocolate;
import com.workintech.abstarction.product.Coke;
import com.workintech.abstarction.product.ProductForSale;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[6];
        products[0] = new Chocolate("Sweet", 15, "Milk Chocolate", "brown", true);
        products[1] = new Chocolate("Sweet", 13, "Bitter Chocolate", "black", true);
        products[2] = new Coke("Drink", 10, "CocaCola Classic", "CocaCola", false);
        products[3] = new Coke("Drink", 12, "Pepsi Max", "Pepsi", true);
        products[4] = new Bread("Bakery", 7, "Baguette", "French", false);
        products[5] = new Bread("Bakery", 10, "Focaccia", "Italy", true);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null) {
            for (ProductForSale product : products) {
                if (product != null) {
                    product.showDetails();

    }
}   }   }   }