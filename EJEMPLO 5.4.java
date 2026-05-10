package CONTROLDELECTURA4;
import java.util.Scanner;
public class BIN {
static Scanner leer=new Scanner(System.in);
	public static void main(String[] args) {
int arreglo []=new int [4];
// bandera con cero, considerando que el arreglo no se ha llenado 
int opcion=0, bandera=0;
System.out.print("MENU\n1.- Llenar el arreglo con números" +"\n2.- Hacer búsqueda binaria \n3.- Terminar");
while (opcion!=3) {
System.out.print("\n¿Qué desea hacer?: ");
opcion=leer.nextInt();
switch (opcion) {
case 1: meter_numeros(arreglo);
//indicador de que llené el arreglo 
bandera =1;
break;
case 2: /* bandera apagada significa que no he capturado numeros */
if (bandera==0)
System.out.print ("Imposible buscar, el " + "arreglo no ha sido llenado");
else
busqueda_bin (arreglo);
} //fin del switch
} // fin del while
} //de main
///// Método para meter números en el arreglo //////// 
static void meter_numeros (int arreglo []) {
int i;
System.out.print ("Recuerda, los números que des deben ser de menor a mayor\n");
System.out.print ("Número? ");
arreglo [0]=leer.nextInt();
for (i=1;i<arreglo.length;i++) {
	System.out.print ("Numero? ");
	arreglo [i]=leer.nextInt();
/* para asegurar que los numeros dados se ingresen en orden ascendente */
if (arreglo [i-1]>arreglo [i]) {
System.out.print ("Número ignorado, solo llevas " + i + " números capturados\n");
i--; // Para evitar el avance a la siguiente celda
}
}
System.out.print ("Listo, has capturado todo el arreglo, los elementos en él actualmente son: \n");
for (i=0; i<arreglo.length; i++)
System.out.print (arreglo [i]+" ");}
////// Método para hacer búsqueda binaria ////////
static void busqueda_bin (int arreglo []) {
int numero, inferior, superior, actual;
System.out.print ("Qué numero deseas buscar en el arreglo?: "); 
numero=leer.nextInt();
//Se inicializan límites inferior y superior del arreglo 
inferior=0;
superior=arreglo.length-1;
// actual es el índice de la mitad del arreglo
actual=(inferior+superior)/2;
while (inferior<=superior && numero!=arreglo [actual]) { 
	if (arreglo [actual] <numero)
		inferior=actual+1;
else
superior=actual-1;
actual=(inferior+superior)/2;
}
//Se checa por qué se rompió el ciclo 
if (numero==arreglo [actual])
System.out.print ("El número que buscas está en la celda " + actual);
else
System.out.print ("El número que buscas no está en el " + "arreglo\n");
// de la clase
	}

}
