package br.com.unipe.cc.uti;

import br.com.unipe.cc.controle.Comparator;
import br.com.unipe.cc.modelo.*;
public class TitularComparator<T> implements Comparator<Item> {
    public String compare(Item conta, Item outraConta) {
        return conta.getDescricaoDoItem();
    }

	private void compareTo(String descricaoDoItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer compare1(Item o1, Item o2) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}