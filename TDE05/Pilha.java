package util;


abstract public class Pilha<T> {
	private int numElementos = 0;
	
	abstract boolean adicionarNoTopo(T elemento);
	abstract T retirarDoTopo();
	abstract boolean ehPossivelAdicionar();
	
	final public boolean push(T elemento) {
		if( ehPossivelAdicionar()) {
			adicionarNoTopo(elemento);
			this.numElementos++;
			System.out.println("Novo elemento empilhado: " + elemento);
			return true;
		}
		return false;
	}
	
	final public T pop() {
		if( this.numElementos > 0) {
			T retorno = retirarDoTopo();
			this.numElementos-- ;
			System.out.println("Elemento desempilhado: " + retorno);
			return retorno;
		}
		return null;
	}
	public int getNumElementos() {
		return this.numElementos;
	}
}
