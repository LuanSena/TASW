package domain;

public class Arvore {
	private No raiz;
	private int numElementos;
	
	public void incluirNovo(String conteudo){

		No novo = new No(conteudo);
		this.numElementos++;
		if(this.raiz == null){
			this.raiz = novo;
			return;
		}
		
		No atual = this.raiz;
		while(true){
			if(atual.getConteudo().compareTo(conteudo) > 0){
				if(atual.getEsquerda() == null){
					atual.setEsquerda(novo);
					return;
				}
				atual = atual.getEsquerda();
			}
			else{
				if(atual.getDireita() == null){
					atual.setDireita(novo);
					return;
				}
				atual = atual.getDireita();
			}
		}
	}
	
	public void imprimirOrdenacao(){
		this.raiz.imprimir(1);
	}
}
