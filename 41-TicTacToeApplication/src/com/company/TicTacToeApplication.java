package com.company;

import java.util.Scanner;

public class TicTacToeApplication {

    public static void main(String[] args) {
        // Obteniendo entrada
        Scanner sc = new Scanner(System.in);
        // Permite contar los juegos
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            // Configurando nuestros tokens y AI
            System.out.println("Bienvenido a Tic Tac Toe! Estás a punto de enfrentarte al maestro de Tic Tac Toe." +
                    " ¿Estás listo?\n¡Yo espero que sí! PERO PRIMERO, debes elegir qué caracter quieres" +
                    " y qué caractert seré");
            System.out.println();
            System.out.println("Ingrese un solo caracter que lo representará en el tablero");
            char playerToken = sc.next().charAt(0);
            System.out.println("Ingrese un solo caracter que representará a su oponente en el tablero");
            char opponentToken = sc.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();

            // Configura el juego
            System.out.println();
            System.out.println("Ahora podemos comenzar el juego. Para jugar, ingresa un número y tu ficha se pondrá" +
                    " en su lugar.\nLos números van del 1 al 9, de izquierda a derecha." +
                    " Bien veremos quién ganará esta ronda.");
            TicTacToe.printIndexBoard();
            System.out.println();

            // vamos a jugar
            while (game.gameOver().equals("no ha terminado")) {
                if (game.currentMarker == game.userMarker) {
                    // TURNO DE USUARIO
                    System.out.println("¡Es tu turno! Ingrese un lugar para su token");
                    int spot = sc.nextInt();
                    while (!game.playTurn(spot)) {
                        System.out.println("Inténtalo de nuevo. " + spot + " no es válido. Este lugar ya está ocupado" +
                                " o está fuera de rango");
                        spot = sc.nextInt();
                    }
                    System.out.println("Elegiste el lugar numero: " + spot);
                } else {
                    // Turno de AI
                    System.out.println("\n¡es mi turno!");
                    // Recoger lugar
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("Yo escogí " + aiSpot + "!");
                }
                // Imprimir nuevo tablero
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();
            // Configurar un nuevo juego... o no dependiendo de la respuesta
            System.out.println("¿Quieres jugar de nuevo? Ingrese Y si si quiere seguir" +
                    " Ingresa cualquier otra caracter si no quiere jugar mas!");
            char response = sc.next().charAt(0);
            doYouWantToPlay = (response == 'Y');
            System.out.println();
            System.out.println();
        }

    }
}
