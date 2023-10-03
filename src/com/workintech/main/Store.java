package com.workintech.main;

import com.workintech.models.Bread;
import com.workintech.models.Chocolate;
import com.workintech.models.Coke;
import com.workintech.models.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] sales = new ProductForSale[5];
        sales[0] = new Chocolate("Sweet", 20, "Yazılımcı dostu", "brown", true);
        sales[1] = new Bread("Bakery", 50, "Siyaz ununda ekmek", "einkorn", "brown");
        sales[2] = new Coke("Drinks", 10, "Soğuk içiniz", true);
        listProducts(sales);
        listProducts(null);
    }

    public static void listProducts(ProductForSale[] products) {
        if(products != null){
            for(ProductForSale product: products){
                if(product != null){
                    product.showDetails();
                }
            }
        } else {
            System.out.println("Products can't be null.");
        }
    }
}