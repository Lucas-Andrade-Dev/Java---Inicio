package Java_Collections;

import java.util.ArrayList;
import java.util.List;

public class ex4 {
	
	public static void main(String[] args) {
		List<Integer> valores = new ArrayList<>();
		List<Integer> dobro = new ArrayList<>();
		List<Integer> par = new ArrayList<>();
		List<Integer> impar = new ArrayList<>();
		
		valores.add(1);
		valores.add(2);
		valores.add(3);
		valores.add(4);
		valores.add(5);
		valores.add(6);
		
	    valores.forEach(v -> {
	    	dobro.add(v*2);
	    	
	    	if(v%2==0) {
	    		par.add(v);
	    	}else {
	    		impar.add(v);
	    	}
	    });
		
		System.out.println(valores);
		System.out.println(dobro);
		System.out.println(par);
		System.out.println(impar);
		
		
	}

}
