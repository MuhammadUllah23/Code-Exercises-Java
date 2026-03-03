package codingProblems.ArrayAndHashing;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
            Set<Character> columnSet = new HashSet<Character>();
            for (int j = 0; j < board.length; j++) {
                char element = board[j][i];
                if (element == '.') continue;
                if (!columnSet.add(element)) {
                    return false;
                }
            }

            // Check Rows
            Set<Character> rowSet = new HashSet<Character>();
            for (int j = 0; j < board.length; j++) {
                char element = board[i][j];
                if (element == '.') continue;
                if (!rowSet.add(element)) {
                    return false;
                }
            }
        }
        // Check Boxes
        for (int box= 0; box < 9; box += 3) {
            int boxStartingRow = 3 * (box % 3);
            int boxStartingCol = box - (box % 3);

            boolean[] seen = new boolean[9];

            for (int r = boxStartingRow; r < boxStartingRow + 3; r++) {
                for (int c = boxStartingCol; c < boxStartingCol + 3; c++) {
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

        return true;
    }
}
