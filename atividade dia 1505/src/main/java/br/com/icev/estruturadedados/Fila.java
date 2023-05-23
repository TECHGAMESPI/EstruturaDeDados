package br.com.icev.estruturadedados;

public class Fila<T>{
	Lista<T> lista = new Lista<T>();

	public void push(T valor) {
		lista.adicionar(valor);
	}
	
	public void pop() {
		lista.getHead().setProximo(lista.getHead().getProximo());
		lista.getHead().setAnterior(null);
		lista.setTamanho(lista.getTamanho()-1);
	}
	


}
