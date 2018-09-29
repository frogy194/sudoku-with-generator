package generator;

import java.util.Arrays;

public class PuzzleGenerator {

    public static int[] checkIfSolvable (int[] sudoku) {
        int[] result = sudoku;
        if (sudoku.length<81) {
            System.out.println("Size of sudoku doesn't apply");
            return result;
        }

        int[][] column = new int[9][9];
        int[][] row = new int[9][9];
        int[][] block = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                column[i][j] = sudoku[i*9+j];
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                row[i][j] = sudoku[(i%9)+(j*9)];
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                block[i][j] = // sudoku[????];
            }
        }
        System.out.println(Arrays.toString(row[8]));

        return result;
    }

    public static void main(String[] args) {
        int[] elo = {4,2,9,8,1,3,5,6,7,5,1,6,4,7,2,9,3,8,7,8,3,6,5,9,2,4,1,6,7,2,1,3,4,8,5,9,3,9,5,2,8,6,1,7,4,8,4,1,7,9,5,6,2,3,1,5,8,3,6,7,4,9,2,9,3,4,5,2,8,7,1,6,2,6,7,9,4,1,3,8,5};
        checkIfSolvable(elo);
    }
}

// petla dla kazdej kolumny i * 9 + j, i % 9 = numer kolumny , wiersza j % 9, i = numer wiersza, bloku
