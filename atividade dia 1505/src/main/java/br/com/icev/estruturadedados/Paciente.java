package br.com.icev.estruturadedados;

public class Paciente {
	private String nome;
	private String cpf;
	private Prioridade prioriodade;
	
	
	public Paciente(String nome, String cpf, Prioridade prioriodade) {
		this.nome = nome;
		this.cpf = cpf;
		this.prioriodade = prioriodade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Prioridade getPrioriodade() {
		return prioriodade;
	}
	public void setPrioriodade(Prioridade prioriodade) {
		this.prioriodade = prioriodade;
	}
	
}
