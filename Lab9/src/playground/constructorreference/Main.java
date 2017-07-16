package playground.constructorreference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
	
	public static void main(String[] args) {
		Function<String, Person> fun = Person::new;
		
		Person p = fun.apply("Dipesh");
		
		System.out.println(p);
		
		BiFunction<String, String, Person> per = Person::new;
		
		Person p1 = per.apply("Dipesh", "Rijal");
		
		System.out.println(p1);
		
		TriFunction<String, String, Integer, Person> pp = Person::new;
		
		Person hero = pp.apply("Dipesh", "Rijal", 26);
		
		System.out.println(hero);
		
		
	}

}
