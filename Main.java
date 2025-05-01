package bancoDigital;

public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco();
        banco.setNome("Banco Digital");
        System.out.println("Banco: "+banco.getNome()+"\n");
        
		Cliente Tuê = new Cliente();
		Tuê.setNome("Tuê");
		Cliente Maria = new Cliente();
		Maria.setNome("Maria");
		
		Conta cc = new ContaCorrente(Tuê);
		Conta cp = new ContaPoupanca(Maria);
		
		banco.adicionarConta(cc);
        banco.adicionarConta(cp);
		
		cc.depositar(100);
		cc.transferir(50, cp);	
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		banco.listarClientes();
				
	}
	
}
