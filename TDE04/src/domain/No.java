package domain;

public class No {
	private No esquerda;
	private No direita;
	private String conteudo;
	
	public No(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public No getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	public No getDireita() {
		return direita;
	}
	public void setDireita(No direita) {
		this.direita = direita;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public void imprimir(int nivel){
		if(this.esquerda != null)
			this.esquerda.imprimir(nivel + 1);
		
		for(int i = 1; i < nivel; i++)
			System.out.print("\t");
		System.out.println(this.conteudo);
		
		if(this.direita!= null)
			this.direita.imprimir(nivel + 1);	
	}
}
