package Testes;

import javax.swing.JOptionPane;

public class NewTest {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,"Ola, Mundo","Bem Vindo",JOptionPane.INFORMATION_MESSAGE);
		int n,s=0;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(null,
			"<html>Informe um numero: <br><em>(valor 0 interrompe)</em></html>"));
			
			s +=n;
		}while(n !=0);
		JOptionPane.showMessageDialog(null,"<html>Resultado final <br>-----------------------"+
			"<br>Somatorio vale "  + s + "</html>");
	}
}
