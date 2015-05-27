package codesandtags.singleton;

import java.util.Scanner;

/**
 * Created by Edwin on 26/05/2015.
 */
public class Juego {

    public static void main(String[] args) {
        Marciano marcianos = Marciano.getMarcianos();
        Computadora computadora = new Computadora();
        Jugador jugador = new Jugador();
        Scanner entrada = new Scanner(System.in);
        int disparos = 0;

        do {
            System.out.print(" Ingresa la cantidad de disparos : ");
            disparos = entrada.nextInt();
            jugador.destruirMarcianos(disparos);
            marcianos.cuantosQuedan();
            computadora.crearMarcianos();
        }while(disparos != 0 || marcianos.getCantidad() > 0);

    }
}
