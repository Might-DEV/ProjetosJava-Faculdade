package bancoDev;

public class MainBanco {

	public static void main(String[] args) {
		CadastroCliente c1 = new CadastroCliente("MAURICIO ALENCAR", 1800,"00985-7862","ITAU");
		
		System.out.println("SALDO: "+c1.getSaldo());
		c1.sacar(100);
		System.out.println();
		c1.exibirDados();
		
	}

}
