package labs.problem4;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		printSquares(4);

	}

	public static void printSquares(int num) {

		IntStream.rangeClosed(1, num).map(n -> n * n).limit(num).forEach(System.out::println);

	}

}
