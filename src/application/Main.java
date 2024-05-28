package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 1500.0)); // instanciando os produtos
        list.add(new Product("Notebook", 80.00));
        list.add(new Product("Celular", 500.00));
        list.add(new Product("Carregador", 50.00));
        list.add(new Product("Pelicula", 30.00));

        List<String> names= list.stream().map(new UpperCaseName()).collect(Collectors.toList()); // instanciando a classe UpperCaseName e passando como argumento para o método map da interface Function

        names.forEach(System.out::println);// imprimindo a lista de nomes em maiúsculo

        list.removeIf(Product::staticProductPredicate);// removendo os produtos que não atendem ao predicado


        list.forEach(System.out::println);


        for (Product product: list) {
            System.out.println(product);

        }
    }
}