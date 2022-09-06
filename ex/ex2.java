package ex;

public class ex2 {
	
	private int vlr1;
	private int vlr2;
	private int total;
	
	public int Resultado() {
		this.total = vlr1+vlr2;
		if (total >= 20) {
		System.out.println("O resultado é maior que 20");
		return total;
		}else {
			System.out.println("o resultado é menor que 20");
			return total;
		}
		 
	}  
	
	public int getVlr1() {
		return vlr1;
	}
	public void setVlr1(int vlr1) {
		this.vlr1 = vlr1;
	}
	public int getVlr2() {
		return vlr2;
	}
	public void setVlr2(int vlr2) {
		this.vlr2 = vlr2;
	}
	
	

}
