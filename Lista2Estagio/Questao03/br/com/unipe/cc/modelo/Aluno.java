package br.com.unipe.cc.modelo;



public class Aluno extends Curso implements Comparable<Aluno>{
	private int matricula;
	private String nome;
	private int falta;
	private double media;
	private double n1;
	private double n2;
	private double n3;

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getFalta() {
		return falta;
	}
	public void setFalta(int falta) {
		this.falta = falta;
	}
	public void setMedia(){
		this.media = (n1+n2+n3)/3;
	}
	public double getMedia() {
		return media;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}

	public int compareTo(Aluno a) {
        return nome.compareTo(a.nome);
    }

	public String toString() {
		System.out.print("\nAluno " + nome + "\nMatricula " + matricula + "\nFalta " + falta );
		System.out.printf("\nMedia %.2f", media);
		System.out.printf("\nNota1 %.2f", n1);
		System.out.printf("\nNota2 %.2f", n2);
		System.out.printf("\nNota3 %.2f", n3);
		return "";
	}
}