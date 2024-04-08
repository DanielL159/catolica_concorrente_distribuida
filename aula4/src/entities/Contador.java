package entities;

public class Contador  {
	private Integer i ;
	
	
	public Contador(Integer i) {
		this.i = i;
	}

	public void plus() {
		 i++;	
	}

	public Integer getI() {
		return i;
	}
	
	
}
