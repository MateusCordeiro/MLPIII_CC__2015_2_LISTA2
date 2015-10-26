package br.com.unipe.cc.modelo;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;import java.util.Set;

public class Inventario {

	List<Item> minhaLista = new ArrayList<Item>();
	
	

	public Inventario(List<Item> produtos) {
		this.minhaLista = produtos;
	}

	public List<Item> getMinhaLista() {
		return minhaLista;
	}

	public void setMinhaLista(List<Item> minhaLista) {
		this.minhaLista = minhaLista;
	}

	

	
	
}
