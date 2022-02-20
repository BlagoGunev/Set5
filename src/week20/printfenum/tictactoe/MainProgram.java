package week20.printfenum.tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        //init field
        String[][] cells = new String[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                cells[row][col] = " ";
            }
        }

        //init winning positions
        ArrayList<Position[]> winningPositions = new ArrayList<>(
                Arrays.asList(
                        new Position[]{ new Position(0, 0), new Position(1, 1), new Position(2, 2) },
                        new Position[]{ new Position(2, 0), new Position(1, 1), new Position(0, 2) },
                        new Position[]{ new Position(0, 0), new Position(0, 1), new Position(0, 2) },
                        new Position[]{ new Position(1, 0), new Position(1, 1), new Position(1, 2) },
                        new Position[]{ new Position(2, 0), new Position(2, 1), new Position(2, 2) },
                        new Position[]{ new Position(0, 0), new Position(1, 0), new Position(2, 0) },
                        new Position[]{ new Position(0, 1), new Position(1, 1), new Position(2, 1) },
                        new Position[]{ new Position(0, 2), new Position(1, 2), new Position(2, 2) }
                )
        );

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            int row, column;

            String player = i % 2 == 0 ? "X" : "O";
            System.out.printf("Enter a row (0, 1 or 2) for player %s: ", player);
            row = scanner.nextInt();
            System.out.printf("Enter a column (0, 1 or 2) for player %s: ", player);
            column = scanner.nextInt();

            while (!cells[row][column].equals(" ")) {
                System.out.println("Cell is already filled.");
                System.out.printf("Enter a row (0, 1 or 2) for player %s: ", player);
                row = scanner.nextInt();
                System.out.printf("Enter a column (0, 1 or 2) for player %s: ", player);
                column = scanner.nextInt();
            }
            cells[row][column] = player;

            boolean isWon = false;
            for (Position[] tryWin : winningPositions) {
                Position a = tryWin[0];
                Position b = tryWin[1];
                Position c = tryWin[2];
                if (!cells[a.row][a.column].equals(" ") && cells[a.row][a.column].equals(cells[b.row][b.column]) && cells[a.row][a.column].equals(cells[c.row][c.column])) {
                    System.out.printf("%s has won.\n", cells[a.row][a.column]);
                    isWon = true;
                    break;
                }
            }

            if (isWon) break;

            printField(cells);
        }

        System.out.println("Game has ended.");
        printField(cells);
    }

    public static void printField(String[][] cells) {
        String rowSeparator = "-------------";
        for (String[] row : cells) {
            System.out.println(rowSeparator);
            System.out.print("|");
            for (String s : row) {
                System.out.printf(" %s |", s);
            }
            System.out.print("\n");
        }
        System.out.println(rowSeparator);
    }

}
