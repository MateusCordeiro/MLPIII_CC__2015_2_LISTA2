package br.com.unipe.cc.gui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.unipe.cc.modelo.Inventario;
import br.com.unipe.cc.modelo.Item;
import br.com.unipe.cc.uti.TitularComparator;

import java.util.Scanner;

public class Principal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		List<Item> produtos = new ArrayList<Item>();

		


String a;
do{
	
		
			Item iten = new Item();
			System.out.println("Informe O CodiGo Do Produto");
			iten.setCodigoDoItem(scan.nextInt());
			System.out.println("Informe A Descrição Do Produto");
			iten.setDescricaoDoItem(scan.next());

			// ADICIONA O OBEJTO ITEN A LISTA PRODUTOS
			produtos.add(iten);

		

		// VERIFICA SE O ARRAYLIST ESTA VAZIA ATRAVES DO IS EMPTY()
		if (produtos.isEmpty())
			System.out.println("A ArrayList não contém elementos.\n");
		else
			System.err.println("A ArrayList não está vazia./n");

		// VERIFICA SE O ITEM TA NA LISTA
		if (iten.getCodigoDoItem()==(123)) {
			System.err.println("O valor pesquisado foi encontrado.");
		} else {
			System.err.println("O valor pesquisado não foi encontrado.");
		}
		System.out.println("QUE COLOCAR PRODUTO s/n )");
		
		a = scan.next();
		
}while(a .equals ("s"));
		// ORDENA OS CODIGOS
		Collections.sort(produtos);
		// IMPRIME O CODIGO E A DESCRICAO PELO TOSTRING
		System.out.println(produtos);

	}

}
