package bancoDev;

public class AplicacaoBancaria extends DadosClientes {
	
	
	AplicacaoBancaria(String nome, double saldo, String numConta) {
		super(nome, saldo, numConta);
		
	}

	public void sacar(double valor) {
	    if (super.getSaldo() < valor || valor < 0) {
	        System.out.println("SALDO INSUFICIENTE");
	    } else {
	    	System.out.println("SAUQUE DE "+valor+" EFETUADO COM SUCESSO");
	        super.setSaldo(super.getSaldo() - valor); 
	    }
	    System.out.println("SALDO ATUAL: " + super.getSaldo());
	}

		
	}

