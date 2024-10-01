package 김민진;

public class Account {
	
	// field
	private String ano;
	private String owner;
	private int balence;
	public int MIN_BALANCE = 0;
	public int MAX_BALANCE = 1000000;
	

	// constructor
	public Account(String ano, String owner, int balence) {
		this.ano = ano;
		this.owner = owner;
		this.balence = balence;
	};

	// method
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalence() {
		return balence;
	}
	public void setBalence(int balence) {
		this.balence = balence;
	}

}
