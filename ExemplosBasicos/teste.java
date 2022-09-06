package ExemplosBasicos;


public class teste {

 private static int x =0;
 
 public static void main(String[] args) {
	Test();
	System.out.println(Math.sqrt(-4));

}

private static int f(int x ) {
	return ++x;
}

private static int g(int y) {
	return ++x;
}

private static void Test() {
	
	System.out.println(f(x)==f(x)?"f":"#");
	System.out.println(g(x)==g(x)?"g":"#");
}

}
