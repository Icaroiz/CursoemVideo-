package Testes;

import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, s=0;
		String resp;
		
		do {
			System.out.println("Digite um numero: ");
			n = sc.nextInt();
			s += n;
			System.out.println("Quer continuar: [s ou n]");
			resp = sc.next();
		}while(resp.equals("s"));
		
		System.out.println("A soma de todos os numeros e " + s);
		
		sc.close();
	}

}
