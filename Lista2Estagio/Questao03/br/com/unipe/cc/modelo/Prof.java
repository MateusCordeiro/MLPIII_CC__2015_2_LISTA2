package br.com.unipe.cc.modelo;


public class Prof extends Curso{
	private String nomeP;
	private String espec;
	private int matriculaP;

	public String getNomeP() {
		return nomeP;
	}
	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}
	public String getEspec() {
		return espec;
	}
	public void setEspec(String espec) {
		this.espec = espec;
	}
	public int getMatriculaP() {
		return matriculaP;
	}
	public void setMatriculaP(int matriculaP) {
		this.matriculaP = matriculaP;
	}

}