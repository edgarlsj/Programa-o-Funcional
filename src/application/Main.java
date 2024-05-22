package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 1500.0));
        list.add(new Product("Notebook", 80.00));
        list.add(new Product("Celular", 500.00));
        list.add(new Product("Carregador", 50.00));
        list.add(new Product("Pelicula", 30.00));


        list.removeIf(Product::staticProductPredicate);


        for (Product product: list) {
            System.out.println(product);

        }
    }
}