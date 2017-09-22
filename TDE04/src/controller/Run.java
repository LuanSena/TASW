package controller;

import domain.Arvore;

public class Run {
	public static void main(String[] args){
		Arvore tree = new Arvore();
		
		tree.incluirNovo("L");
		tree.incluirNovo("U");
		tree.incluirNovo("A");
		tree.incluirNovo("N");
		
		tree.imprimirOrdenacao();
	}
}
