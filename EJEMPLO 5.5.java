package CONTROLDELECTURA4;
import java.util.Random;
public class BOMBEROS {

	public static void main(String[] args) {
		Random aleatorio=new Random();
			int cartas [] []=new int [3] [5];
			// Se crea el arreglo voluntarios de tamaño 3 
			int voluntarios []=new int [cartas.length];
			//Se crea el arreglo colonias de tamaño 5 
			int colonias []=new int [cartas [0].length];
			int vol, col; //indices para controlar renglón y columna 
			for (vol=0; vol<cartas.length; vol++) {
			for (col=0; col<cartas [vol].length; col++) {
				cartas[vol][col]=aleatorio.nextInt(501);
				voluntarios[vol]+=cartas[vol][col];
				colonias[col]+=cartas[vol][col];
			}
			}
			for (vol=0; vol<cartas.length; vol++)
			System.out.println("El bombero "+vol+" recibió un total de" +voluntarios [vol]+" cartas ");
			System.out.println();
			for (col=0; col<cartas [0].length; col++)
			System.out.println("La colonia "+col+" escribió un total de" + colonias [col]+" cartas ");
	}
}