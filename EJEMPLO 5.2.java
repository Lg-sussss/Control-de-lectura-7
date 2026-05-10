package CONTROLDELECTURA4;

public class CUADRADO_CUBO {

	public static void main(String[] args) {
int bases[]= {12,0,2,5,6,7,10};	
int resultados [] = new int[bases.length]; 
int indice=0;
	

while (indice<bases.length) {
if (bases [indice]%2==0) //en caso de ser par
resultados [indice] = (int) Math.pow(bases [indice], 2); 
else //si es impar
resultados [indice] = (int) Math.pow(bases [indice], 3); 
indice++;
} //llave final del while
System.out.println("El arreglo resultados queda con los valores "); // se regresa indice a cero para comenzar en la celda 0 
indice=0;
while (indice<resultados.length) {
System.out.println(resultados [indice]);
indice++;
} //llave final del while	
	}
}