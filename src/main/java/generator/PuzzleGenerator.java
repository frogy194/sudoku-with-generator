package generator;

public class PuzzleGenerator {

    public static int[] checkIfSolvable (int[] sudoku) {
        int[] result = sudoku;
        if (sudoku.length<81) {
            System.out.println("Size of sudoku doesn't apply");
            return result;
        }

        int[][] column = new int[8][8];
        int[][] row = new int[8][8];
        int[][] block = new int[8][8];

        for (int i = 0; i < 81; i++) {


        }
    }
}

// petla dla kazdej kolumny i * 9 + j, i % 9 = numer kolumny , wiersza j % 9, i = numer wiersza, bloku
