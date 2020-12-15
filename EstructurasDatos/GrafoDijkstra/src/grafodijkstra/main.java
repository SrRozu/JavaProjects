package grafodijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Roberto Ruiz Sánchez
 */
public class main {

    public static void main(String[] args) {

        String[] ciudades = {"Espartina", "Umbrete", "Bollullos de la Mitación", "Gines",
            "Valencina de la Concepción", "Castilleja de la Cuesta", "Bormujos", "Mairena de Aljarafe",
            "Palomares del Río", "Coria del Río", "Almensilla", "Santiponce", "Camas", "Tomares",
            "San Juan de Aznalfarache", "Alcalá del Río", "La Rinconada", "La Algaba", "Sevilla",
            "Fuente del Rey", "La Hermandad", "San José de la Rinconada", "Valdezorras", "Barriada de la Liebre",
            "Montequinto", "Dos Hermanas", "Los Palacios y Villafranca", "La Celada", "Torrepalma", "Alcalá de Guadaíra"};

        Grafo g = new Grafo(ciudades);

        g.agregarRuta("Espartina", "Umbrete", 4);
        g.agregarRuta("Umbrete", "Bollullos de la Mitación", 4);
        g.agregarRuta("Espartina", "Gines", 6);
        g.agregarRuta("Gines", "Valencina de la Concepción", 4);
        g.agregarRuta("Gines", "Castilleja de la Cuesta", 3);
        g.agregarRuta("Gines", "Bormujos", 3);
        g.agregarRuta("Bollullos de la Mitación", "Bormujos", 12);
        g.agregarRuta("Valencina de la Concepción", "Castilleja de la Cuesta", 7);
        g.agregarRuta("Valencina de la Concepción", "Santiponce", 5);
        g.agregarRuta("Castilleja de la Cuesta", "Bormujos", 2);
        g.agregarRuta("Bormujos", "Mairena de Aljarafe", 6);
        g.agregarRuta("Mairena de Aljarafe", "Palomares del Río", 4);
        g.agregarRuta("Palomares del Río", "Almensilla", 5);
        g.agregarRuta("Palomares del Río", "Coria del Río", 4);
        g.agregarRuta("Coria del Río", "Almensilla", 7);
        g.agregarRuta("Castilleja de la Cuesta", "Camas", 5);
        g.agregarRuta("Castilleja de la Cuesta", "Tomares", 3);
        g.agregarRuta("Bormujos", "Tomares", 4);
        g.agregarRuta("Santiponce", "Camas", 5);
        g.agregarRuta("Camas", "Sevilla", 10);
        g.agregarRuta("Tomares", "San Juan de Aznalfarache", 3);
        g.agregarRuta("Mairena de Aljarafe", "San Juan de Aznalfarache", 3);
        g.agregarRuta("Tomares", "Sevilla", 9);
        g.agregarRuta("San Juan de Aznalfarache", "Sevilla", 8);
        g.agregarRuta("La Algaba", "Sevilla", 10);
        g.agregarRuta("La Rinconada", "La Algaba", 10);
        g.agregarRuta("Alcalá del Río", "La Rinconada", 5);
        g.agregarRuta("La Rinconada", "San José de la Rinconada", 5);
        g.agregarRuta("San José de la Rinconada", "La Algaba", 10);
        g.agregarRuta("La Algaba", "Valdezorras", 12);
        g.agregarRuta("San José de la Rinconada", "Valdezorras", 11);
        g.agregarRuta("Valdezorras", "La Celada", 20);
        g.agregarRuta("Barriada de la Liebre", "Torrepalma", 16);
        g.agregarRuta("Barriada de la Liebre", "Alcalá de Guadaíra", 5);
        g.agregarRuta("Barriada de la Liebre", "Montequinto", 13);
        g.agregarRuta("Sevilla", "Barriada de la Liebre", 13);
        g.agregarRuta("Sevilla", "Montequinto", 9);
        g.agregarRuta("Sevilla", "Fuente del Rey", 10);
        g.agregarRuta("Fuente del Rey", "Dos Hermanas", 8);
        g.agregarRuta("Dos Hermanas", "Montequinto", 7);
        g.agregarRuta("Fuente del Rey", "La Hermandad", 13);
        g.agregarRuta("La Hermandad", "Dos Hermanas", 15);
        g.agregarRuta("La Hermandad", "Los Palacios y Villafranca", 21);
        g.agregarRuta("Los Palacios y Villafranca", "Dos Hermanas", 18);

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        String inicio = "";
        String fin = "";
        String resultado = "";
        int entrada = -1;
        char ch;

        do {
            System.out.println("1. Calcular ruta optima");
            System.out.println("   Introduzca 0 para finalizar\n------------------------------\n");

            entrada = sc.nextInt();

            switch (entrada) {
                case 1:
                    System.out.println("CIUDADES\n--------\n");

                    for (int i = 0; i < ciudades.length; i++) {
                        System.out.println(ciudades[i]);
                    }

                    System.out.println("\nIntroduzca inicio ruta: ");
                    inicio = sc1.nextLine();

                    System.out.println("\nIntroduzca fin ruta: ");
                    fin = sc1.nextLine();

                    int index = Arrays.asList(ciudades).indexOf(inicio);
                    int index2 = Arrays.asList(ciudades).indexOf(fin);

                    resultado = g.encontrarRutaMinimaDijkstra(ciudades[index], ciudades[index2]);

                    System.out.println("\n" + resultado + "\n");

                    break;
            }
            System.out.println("\n¿Quiere continuar?(Si/No)\n");
            ch = sc.next().charAt(0);
        } while (ch == 'S' || ch == 's');
    }
}