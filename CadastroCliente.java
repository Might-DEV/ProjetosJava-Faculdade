package bancoDev;

public class CadastroCliente extends AplicacaoBancaria {

	protected String banco;
	
	CadastroCliente(String nome, double saldo, String numConta, String banco) {
		super(nome, saldo, numConta);
		this.banco = banco;
	}
	
	
	public void exibirDados() {
		System.out.println("CLIENTE: "+super.getNome()+"\nBANCO: "+banco+"\nCONTA: "+super.getNumConta()+
				"\nSALDO: "+super.getSaldo());
	}

}
