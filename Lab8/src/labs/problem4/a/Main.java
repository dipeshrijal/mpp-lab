package labs.problem4.a;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import labs.problem4.Product;

public class Main {

	public static void main(String[] args) {
		
		Product p1 = new Product("MacBook", 1799, 2017);
		Product p2 = new Product("iPhone", 899, 2017);
		Product p3 = new Product("iMac", 5999, 2017);

		List<Product> products = Arrays.asList(p1, p2, p3);

		Collections.sort(products, new ProductPriceComparator());

		System.out.println(products);

	}

}
