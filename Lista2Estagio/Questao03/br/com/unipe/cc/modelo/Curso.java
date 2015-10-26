package br.com.unipe.cc.modelo;

import java.util.ArrayList;
import java.util.List;



public class Curso {
	private String nomeC;
	private int numId;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private Prof prof;

	public String getNomeC() {
		return nomeC;
	}

	public void setNomeC(String nomeC) {
		this.nomeC = nomeC;
	}

	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno alunos) {
		this.alunos.add(alunos);
	}

	public Prof getProf() {
		return prof;
	}

	public void setProf(Prof prof) {
		this.prof = prof;
	}
}
