class Solution {
    public boolean isValidSudoku(char[][] board) {
        // can't reasign board, just check it
        // board[][] = new char[9][9];
        HashSet<String> table = new HashSet<>(); 

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    char number = board[i][j];

                    if (!table.add(number + "r" + i) ||
                        !table.add(number + "c" + j) ||
                        !table.add(number + "b" + (i / 3) + "-" + (j / 3))) {
                        return false;
                    }                   
                }
            }
        }
        return true;
    }
}
