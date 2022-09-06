package Java_Collections;

import java.util.ArrayList;
import java.util.List;

public class ex6 {
	public static void main(String[] args) {
		
		List<String> color = new ArrayList<>();

		color.add("Red");
		color.add("Orange");
		color.add("White");
		color.add("Black");
		color.add("Green");
		
		System.out.println(color);
       
		List<String> color2 = new ArrayList<>();
		
		color2.add("Red");
		color2.add("Orange");
		color2.add("White");
		color2.add("Black");
		
		System.out.println(color2);
		
		List<String> tem = new ArrayList<>();
		
		color.forEach(c -> {
			tem.add(color2.contains(c)? "Yes":"No");
		});
		
		System.out.println(tem);
		
	}

}
