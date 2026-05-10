package CONTROLDELECTURA4;

import java.util.Scanner;
public class CALORIAS {
	static Scanner leer=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//se crea un arreglo de 7 elementos enteros
int calorias[] = new int[7];
int indice, suma=0;
System.out.println("Captura las calorías consumidas cada día");
for (indice=0; indice<calorias.length; indice++) { 
	System.out.print ("Día "+(indice+1)+" : ");
//Se lee cada elemento del arreglo 
calorias[indice] =leer.nextInt(); 
	suma+=calorias[indice];
}
//Imprime las calorías leídas en orden inverso 
System.out.println("Información leída en orden inverso"); 
for (indice=calorias.length-1; indice>=0;indice--) 
	System.out.print (calorias [indice]+" ");
System.out.println(); //Salta a la siguiente línea
System.out.println("El promedio de calorías quemadas es =" + ((float) suma/calorias.length));
}
}