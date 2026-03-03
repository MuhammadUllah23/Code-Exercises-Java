package codingProblems.ArrayAndHashing;

public class validSudoku {
    public static void main (String[] args) { 

        char[][] valid = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        char[][] duplicateRow = {
            {'5','3','.','.','7','.','.','.','5'}, // duplicate '5' in this row
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        char[][] duplicateColumn = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'5','6','.','.','.','.','2','8','.'}, // duplicate '5' in column 0
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        char[][] duplicateBox = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','9','.','1','9','5','.','.','.'}, // <-- '9' placed at (1,1)
            {'.','9','8','.','.','.','.','6','.'}, // <-- already has '9' at (2,1)
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };


        // Valid
        System.out.println(validate(valid));

        // Not Valid Row
        System.out.println(validate(duplicateRow));

        // Not Valid column
        System.out.println(validate(duplicateColumn));

        // Not Valid box
        System.out.println(validate(duplicateBox));

    }

    public static boolean validate(char[][] board) {
        
        for (int i = 0; i < board.length; i++) {

            // Check Columns
            boolean[] columnSeen = new boolean[9];
            for (int j = 0; j < board.length; j++) {
                char ch = board[j][i];
                if (ch == '.') continue;

                int index = ch - '1';

                if (columnSeen[index]) {
                    return false;  
                }

                columnSeen[index] = true;
            }

            // Check Rows
            boolean[] rowSeen = new boolean[9];
            for (int j = 0; j < board.length; j++) {
                char ch = board[i][j];
                if (ch == '.') continue;

                int index = ch - '1';

                if (rowSeen[index]) {
                    return false;  
                }

                rowSeen[index] = true;
            }
        }
        // Check Boxes
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                boolean[] seen = new boolean[9];

                for (int r = boxRow; r < boxRow + 3; r++) {
                    for (int c = boxCol; c < boxCol + 3; c++) {

                        char ch = board[r][c];
                        if (ch == '.') continue;

                        int index = ch - '1';

                        if (seen[index]) {
                            return false;
                        }

                        seen[index] = true;
                    }
                }
            }
        }

        return true;
    }
}
