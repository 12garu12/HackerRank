package com.company;

public class TicTacToe {

    // Imagen del juego con índice:
    // PARA ALMACENAMIENTO:
    /*  0 | 1 | 2
       -----------
        3 | 4 | 5
       -----------
        6 | 7 | 8
       LO QUE EL USUARIO PIENSA:
        1 | 2 | 3
       -----------
        4 | 5 | 6
       -----------
        7 | 8 | 9

        Imagen de UI del juego:
        EN ESO:
        - | - | -
       -----------
        - | - | -
       -----------
        - | - | -
        GAMEPLAY: Como se juega
        0 | - | 0
       -----------
        - | X | -
       -----------
        - | - | X
     */

    protected char[] board;
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;

    public TicTacToe(char playerToken, char aiMarker) {
        this.userMarker = playerToken;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.board = setBoard();
        this.currentMarker = userMarker;
    }

    public static char[] setBoard() {
        char[] board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        return board;
    }

    public boolean playTurn(int spot) {
        boolean isValid = withinRange(spot) && !isSpotTaken(spot);
        if (isValid) {
            board[spot - 1] = currentMarker;
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker;
        }
        return isValid;
    }

    // verifica si tu lugar está dentro del rango
    public boolean withinRange(int number) {
        return number > 0 && number < board.length + 1;
    }

    // verificar si el lugar está ocupado
    public boolean isSpotTaken(int number) {
        return board[number - 1] != '-';
    }

    public void printBoard() {
/*          intentando crear ...
            - | - | -
            ----------
            - | - | -
            ----------
            - | - | -
*/
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("-----------");
            }
            if (i != 0 && i != 3 && i != 6) {
                System.out.print("|");
            }
            System.out.print(" " + board[i] + " ");
        }
        System.out.println();
    }

    public static void printIndexBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("-----------");
            }
            if (i != 0 && i != 3 && i != 6) {
                System.out.print("|");
            }
            System.out.print(" " + (i + 1) + " ");
        }
        System.out.println();
    }

    public boolean isThereAWinner() {
        boolean diagonalsAndMiddles = (rightDi() || leftDi() || middleRow() || secondCol()) && board[4] != '-';
        boolean topAndFirst = (topRow() || firstCol()) && board[0] != '-';
        boolean bottomAndthird = (bottomRow() || thirdCol()) && board[8] != '-';
        if (diagonalsAndMiddles) {
            this.winner = board[4];
        } else if (topAndFirst) {
            this.winner = board[0];
        } else if (bottomAndthird) {
            this.winner = board[8];
        }
        return diagonalsAndMiddles || topAndFirst || bottomAndthird;
    }

    public boolean topRow() {
        return board[0] == board[1] && board[1] == board[2];
    }

    public boolean middleRow() {
        return board[3] == board[4] && board[4] == board[5];
    }

    public boolean bottomRow() {
        return board[6] == board[7] && board[7] == board[8];
    }

    public boolean firstCol() {
        return board[0] == board[3] && board[3] == board[6];
    }

    public boolean secondCol() {
        return board[1] == board[4] && board[4] == board[7];
    }

    public boolean thirdCol() {
        return board[2] == board[5] && board[5] == board[8];
    }

    public boolean rightDi() {
        return board[0] == board[4] && board[4] == board[8];
    }

    public boolean leftDi() {
        return board[2] == board[4] && board[4] == board[6];
    }

    public boolean isTheBoardFilled() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == '-') {
                return false;
            }
        }
        return true;
    }

    public String gameOver() {
        boolean didSomeoneWin = isThereAWinner();
        if (didSomeoneWin) {
            return "\n¡Tenemos un ganador! El ganador es " + this.winner;
        } else if (isTheBoardFilled()) {
            return "¡Se acabó el juego!";
        } else {
            return "no ha terminado";
        }
    }

}
