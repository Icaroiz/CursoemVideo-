package Testes;

import java.util.Arrays;

public class vetores {

	public static void main(String[] args) {
		
	int v[]= new int [20];
	Arrays.fill(v,0);
	for (int valor: v) {
		System.out.println(valor +"");
			}
		}
	}

/*Teste declaração de vetor #1		
int n[] = new int[4];
n[0] = 3;
n[1] = 5;
n[2] = 8;
n[3] = 2;

Teste declaração de vetor #2
int n[]= {3,2,8,7,5,4};
System.out.println("Total de casos de N: "+ n.length);
System.out.println();
for (int c=0; c<=n.length-1; c++) {
System.out.println("na posicao "+ c +" temos o valor " + n[c]); 

Teste declaração de vetor #3
String mes[]= {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
int tot[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	
for(int c=0; c<mes.length; c++) {
System.out.println("O mes "+ mes[c] + " tem " + tot[c]+ " dias.");

Teste declaração de vetor #4
double v[]= {3.5,2.85,3.1,3.0};
for(double valor: v) {
System.out.println(valor + "");}
	
int n[]= {3,2,8,7,5,4};
Arrays.sort(n);
for (int valor: n) {
System.out.println(valor + "" ); 


int vet[]= {3,7,8,1,9,4,2};
for (int v:vet) {
System.out.print(" "+ v + " ");}
System.out.println();
int p = Arrays.binarySearch(vet, 1);
System.out.println("Encontrei o valor na posicao "+ p ); */











































