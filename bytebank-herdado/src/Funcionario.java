
public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	//protected double salario; // protected serve para deixar visivel para as classes "filhas", fica publico paras os filhos
										// e privado para o restante
	
	public Funcionario() {
		
	}
		
	public double getBonificao() {
		return this.salario * 0.05;
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
