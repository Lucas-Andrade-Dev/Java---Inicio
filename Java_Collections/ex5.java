package Java_Collections;

public class ex5 {

	public static void main(String[] args) {
       
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Ola, Mundo!");
				
			}
		}).run();
		
	new Thread(() -> System.out.println("Ola, Mundo!")).run();
		
	}

}
