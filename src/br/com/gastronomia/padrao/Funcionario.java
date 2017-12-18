package br.com.gastronomia.padrao;

public class Funcionario extends Pessoa {
	
	private int cargaHoraria;
	private double salario;

	public Funcionario(String nome, String cpf, String rg, char sexo, Endereco endereco, String email, String telefone,
			String observacoes, int cargaHoraria, double salario) {
		super(nome, cpf, rg, sexo, endereco, email, telefone, observacoes);
		
		this.cargaHoraria = cargaHoraria;
		this.salario = salario;
		
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
