package paquete;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author CATALINA
 */
public class Dibujos {

    public void realidad() {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int carro = 1;
        int pez = 2;
        int corazon = 3;
        int estrella = 4;
        int barco = 5;
        int pintar = 0;
        System.out.println("************************************************** \n"
                + "************** INICIO DE DIBUJOS ***************** \n"
                + "************************************************** \n");

        // leo los datos ingresados
        try {
            System.out.println("Ingrese que desea pintar  :\n 1. Carrito\n 2. Pez\n 3. Corazon"
                    + "\n 4. Estrella\n 5. Barco");
            pintar = Integer.parseInt(leer.readLine().toString());


        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
        }

        boolean salida = false;
        do {
            // validaciones de los datos
            if (pintar == carro) {
                System.out.println("    ๏๏๏๏๏๏    \n   ๏๏๏๏๏๏๏๏   "
                        + "\n๏๏๏๏๏๏๏๏๏๏๏๏๏๏\n๏๏๏๏๏๏๏๏๏๏๏๏๏๏\n๏๏๏๏๏๏๏๏๏๏๏๏๏๏\n   ๏๏   ๏๏    ");
            } else if (pintar == pez) {
                System.out.println("๏   ๏๏๏๏  \n๏๏ ๏๏๏๏๏๏ "
                        + "\n๏๏๏๏๏๏๏๏๏๏\n๏๏๏๏๏๏๏๏๏๏\n๏๏๏๏๏๏๏๏๏ \n๏๏ ๏๏๏๏๏๏ \n๏   ๏๏๏๏  ");
            } else if (pintar == corazon) {
                System.out.println(" ๏๏๏   ๏๏๏ \n๏๏๏๏๏ ๏๏๏๏๏\n๏๏๏๏๏ ๏๏๏๏๏\n๏๏๏๏๏๏๏๏๏๏๏"
                        + "\n๏๏๏๏๏๏๏๏๏๏๏\n ๏๏๏๏๏๏๏๏๏ \n  ๏๏๏๏๏๏๏  \n    ๏๏๏๏   \n     ๏๏    \n     ๏     ");
            } else if (pintar == estrella) {
                System.out.println("     ๏     \n    ๏๏๏    \n   ๏๏๏๏๏   \n๏๏๏๏๏๏๏๏๏๏๏\n ๏๏๏๏๏๏๏๏๏ \n  ๏๏๏๏๏๏๏๏  "
                        + "\n  ๏๏๏๏๏๏๏๏  \n ๏๏๏๏๏๏๏๏๏ \n ๏๏๏   ๏๏๏ \n ๏        ๏ \n๏         ๏");
            } else if (pintar == barco) {
                System.out.println("     ๏๏    \n    ๏๏๏    \n   ๏๏๏๏    \n  ๏๏๏๏๏    \n      ๏    \n      ๏    "
                        + "\n๏๏๏๏๏๏๏๏๏๏๏\n ๏๏๏๏๏๏๏๏๏ \n  ๏๏๏๏๏๏๏  \n    ๏๏๏๏   ");
            } else {
                System.out.println("Dibujo no existe");
            }

            System.out.println("********************************************* \n"
                    + "***************Fin dibujo******************** \n"
                    + "********************************************* \n");
        } while (salida);

    }
}