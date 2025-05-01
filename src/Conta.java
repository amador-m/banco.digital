package bancoDigital;

public abstract class Conta {
	private static int AGENCIA_PADRAO = 0001; //constante 
	private static int SEQUENCIAL = 1; 
	
	protected int agencia;
	protected int numero;
	protected float saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO++;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public void sacar(float valor) {
		if(valor<saldo) {
			saldo -= valor;
			System.out.println("Saque realizado");
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void depositar(float valor) {
		saldo+=valor;
		System.out.println("Depósito realizado");
	}
	
	public void transferir(float valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		System.out.println("Transferência realizada");
	}
	
	public void imprimirExtrato() {
		
	}
	
	protected void imprimirDadosConta() {
		System.out.println("\tCliente: "+this.cliente.getNome());
		System.out.println("\tAgência: "+this.agencia);
		System.out.println("\tNúmero: "+this.numero);
		System.out.println("\tSaldo: "+this.saldo);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

}
