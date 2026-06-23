package bancoDev;

public class DadosClientes{
	
	private String nome;
	private double saldo;
	private String numConta;
	
	DadosClientes(String nome, double saldo, String numConta){
		this.nome = nome;
		this.saldo = saldo;
		this.numConta = numConta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNumConta() {
		return numConta;
	}
	
	
	

}
