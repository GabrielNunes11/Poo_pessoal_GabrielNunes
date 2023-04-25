package br.com.poo.contas;

public class ContaCorrente extends Conta implements DemaisOperacoes{
	
	private double tarifa;
	
	public ContaCorrente() {}

	@Override
	public void depositar(double valor) {
		System.out.println("Depositei na Corrente: R$");
	}
	
	@Override
	public void sacar(double valor) {
		System.out.println("Saquei na Corrente: R$");
	}
	
	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public void transferir(double calor, Conta conta) {
		System.out.println("Transferi da Corrente para a conta destino: ");
		
	}
	
}
