package br.com.icev.estruturadedados;

public class Lista<T> {
	private No<T> head;
	private No<T> tail;
	private int tamanho;
	
	public void adicionar(T valor) {
		No<T> no = new No<T>(valor);
	
		
		if(this.head==null && this.tail==null) {
			this.head = no;
			this.tail = no;
		}
		else {
			this.tail.setProximo(no);
			no.setAnterior(this.tail);
			this.tail = no;
		}
	}

	public int getTamanho() {
		return tamanho;
	}
	

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public No<T> getHead() {
		return head;
	}

	public void setHead(No<T> head) {
		this.head = head;
	}

	public No<T> getTail() {
		return tail;
	}

	public void setTail(No<T> tail) {
		this.tail = tail;
	}
	
}
