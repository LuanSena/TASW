package util;

public class PilhaComArray<T> extends Pilha<T> {
	private static final int TMAX = 10;
	private Object[] array = new Object[TMAX];

	@Override
	boolean adicionarNoTopo(T elemento) {
		this.array[this.getNumElementos()] = elemento;
		return true;
	}

	@Override
	T retirarDoTopo() {
		return (T) this.array [this.getNumElementos() -1];
	}

	@Override
	boolean ehPossivelAdicionar() {
		if(this.getNumElementos() < TMAX)
			return true;
		return false;
	}

}
