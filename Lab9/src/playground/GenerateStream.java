package playground;

import java.util.stream.Stream;

public class GenerateStream {
	
	public static void main(String[] args) {
		Stream.generate(Math::random).limit(10).forEach(System.out::println);
		
		
		// creating empty stream
		
		Stream<String> stream = Stream.empty();
		
		System.out.println(stream);
		
		
		// Iterate Stream
		
//		Stream<Long> naturalNumbers = Stream.iterate(1L, n -> n + 1).limit(10).forEach(System.out::println);
	}

}
