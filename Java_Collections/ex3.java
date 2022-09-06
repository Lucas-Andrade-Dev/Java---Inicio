package Java_Collections;

import java.util.ArrayList;
import java.util.List;

public class ex3 {

	public static void main(String[] args) {

		List<String> color = new ArrayList<>();

		color.add("Red");
		color.add("Orange");
		color.add("White");
		color.add("Black");
		color.add("Green");
		
		System.out.println("Primeira Cor: "+color.get(0));
		System.out.println("Terceira Cor: "+color.get(2));

	}

}
