package br.com.unipe.cc.modelo;

public class Item implements Comparable<Item>{

	private int codigoDoItem;
	private String descricaoDoItem;
	
	public int getCodigoDoItem() {
		return codigoDoItem;
	}
	public void setCodigoDoItem(int codigoDoItem) {
		this.codigoDoItem = codigoDoItem;
	}
	public String getDescricaoDoItem() {
		return descricaoDoItem;
	}
	public void setDescricaoDoItem(String descricaoDoItem) {
		this.descricaoDoItem = descricaoDoItem;
			
	}
	
	public String toString(){
		return "\nCodigo do item : "+this.codigoDoItem+ "/descricao do item :" +this.descricaoDoItem;
	}
	
	public int compareTo( Item outraConta) {
        if (this.codigoDoItem < outraConta.codigoDoItem) {
            return -1;
        }
        if (this.codigoDoItem > outraConta.codigoDoItem) {
            return 1;
        }
        return 0;
        
    }
	
}


