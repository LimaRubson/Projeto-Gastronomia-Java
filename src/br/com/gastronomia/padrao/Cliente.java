package br.com.gastronomia.padrao;

public class Cliente extends Pessoa {
	
	
	private int idCliente;
	private Prato prato;
	
	public Cliente(String nome, String cpf, String rg, char sexo, Endereco endereco, String email, String telefone,
			String observacoes, int idCliente, Prato prato) {
		super(nome, cpf, rg, sexo, endereco, email, telefone, observacoes);
		
		this.idCliente = idCliente;
		this.prato = prato;
		
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Prato getPrato() {
		return prato;
	}

	public void setPrato(Prato prato) {
		this.prato = prato;
	}
	
}
