package br.com.unipe.cc.controle;

import br.com.unipe.cc.modelo.Item;

public interface Comparator<T> {
    String compare(T o1, T o2);

	Integer compare1(Item o1, Item o2);
}
