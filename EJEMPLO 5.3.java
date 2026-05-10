package CONTROLDELECTURA4;
import java.util.Scanner;
public class RECORRER {
	static Scanner leer=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char carac[] = { 'P', 'R', '0', 'G', 'R', 'A', 'M', 'A', 'C', 'I', '0', 'N'}, aux; 
int i, opcion, longitud; 
longitud=carac.length;
System.out.print ("\nMENU \n1) Recorrer a la derecha\n2) Recorrer a la izquierda \n3) Terminar\n\n");
do {
System.out.print ("La palabra es: "); 
for (i=0; i<longitud; i++)
System.out.print (carac[i] + " ") ;
System.out.println();
System.out.print ("Qué deseas hacer: "); 
opcion=leer.nextInt();
switch (opcion) {
case 1: //se respalda el último caracter 
	aux=carac [longitud-1];
for (i=longitud-1;i>0; i--)
carac[i]=carac[i-1];
/* en la celda cero se coloca el carácter respaldado */
carac [0]=aux;
break;
case 2: //se respalda el primer caracter
aux=carac[0];
for (i=0;i<longitud-1;i++)

carac[i]=carac[i+1];
/*en la última celda se coloca el carácter Respaldado */
carac [longitud-1] =aux;
} //fin del switch
} while (opcion!=3);	}

}