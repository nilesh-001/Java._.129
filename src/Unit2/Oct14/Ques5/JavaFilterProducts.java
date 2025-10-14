package Unit2.Oct14.Ques5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaFilterProducts {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP1", 110000));
        productList.add(new Product(2, "HP2", 120000));
        productList.add(new Product(3, "HP3", 130000));
        productList.add(new Product(4, "HP4", 140000));
        productList.add(new Product(5, "HP5", 150000));
        productList.add(new Product(6, "HP6", 160000));
        productList.add(new Product(7, "HP7", 170000));
        productList.add(new Product(8, "HP8", 180000));
        productList.add(new Product(9, "HP9", 190000));

        List<Double> newList = productList.stream().
                filter(p -> p.price > 140000).
                map(p->p.price).
                collect(Collectors.toList());
        System.out.println(newList);
    }
}
