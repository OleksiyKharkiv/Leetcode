import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][]board){
        for(char[]row: board){
            for (char c : row){
                if (c != '.' && (c < '1' || c > '9')){
                    return false;
                }
            }
        }
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] blocks = new HashSet[9];
        for (int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            blocks[i] = new HashSet<>();

            for ( i = 0; i <9; i++){
                for (int j = 0; j < 9; j++){
                    if (board[i][j] == '.') continue;
                    if (rows[i].contains(board[i][j])){
                        return false;
                    } else {
                        rows[i].add(board[i][j]);
                    }
                    if (cols[i].contains(board[i][j])){
                        return false;
                    } else {
                        cols[i].add(board[i][j]);
                    }
                    int index = ((i/3)*3 + j/3);
                    if (blocks[index].contains(board[i][j])){
                        return false;
                    } else {
                        blocks[index].add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
}
