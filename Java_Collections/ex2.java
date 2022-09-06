package Java_Collections;

import java.util.ArrayList;
import java.util.List;

public class ex2 {
	public static void main(String[] args) {
		
		List<String> color = new ArrayList<>();

		color.add("Red");
		color.add("Orange");
		color.add("White");
		color.add("Black");
		color.add("Green");

		color.forEach(c -> {
			System.out.println(c);
		});
		
	}

}
