package Testes;

import Testes.Funcao02;
import Testes.Fatorial;

public class Funcao01 {
	
	public static void main(String[]args) {
		Fatorial f = new Fatorial()	;
		f.setValor(5);
		System.out.println(f.getFormula());
		System.out.println(f.getFatorial());
	}

}
