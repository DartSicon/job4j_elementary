package ru.job4j.array;

public class MatrixCheck {
    private static final char SYMBOL = 'X';

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board[row].length; index++) {
            if (board[row][index] != SYMBOL) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int rowIndex = 0; rowIndex < board.length; rowIndex++) {
            if (board[rowIndex][column] != SYMBOL) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int row = 0; row < board.length; row++) {
            rsl[row] = board[row][row];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (monoHorizontal(board, index) || monoVertical(board, index)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
