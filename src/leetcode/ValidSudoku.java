package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {

    }
//    public static boolean isValidSudoku(char[][] board){
//        for (int row =0 ; row<9 ; row++){
//            Set<Character> seen = new HashSet<>();
//            for (int i= 0 ;i<9;i++){
//                if(board[row][i]=='.'){
//                    continue;
//                }
//                if(seen.contains(board[row][i])){
//                    return false
//                }
//                seen.add(board[row][i]);
//            }
//        }
//        for (int col =0 ; col<9;col++){
//            Set<Character> seen = new HashSet<>();
//            for (int i =0 ; i<9 ;i++){
//                if (board[i][0]=='.')continue;
//                if (seen.contains(board[i][col]))return false;
//                seen.add(board[i][col]);
//            }
//        }
//        for (int square =0 ; square<9; square++){
//            Set<Character>seen = new HashSet<>();
//            for (int i = 0 ; i <3; i++){
//                for (int j =0; j<3;j++){
//                    int row= (square/3)*3+i;
//                    int col = (square/3)*3+j;
//                    if(board[row][col]=='.'){
//                        continue;
//                    }
//                    if(seen.contains(board[row][col])){
//                        return false;
//                    }
//                    seen.add(board[row][col]);
//                }
//            }
//        }
//        return  true;
//    }
//
    public boolean isValidSudoku(char[][] board) {

        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] squares = new int[9];
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') continue;
                int val = board[row][col] - '1';
                if ((rows[row] & (1 << val)) > 0 ||
                        (cols[col] & (1 << val)) > 0 ||
                        (squares[(row / 3) * 3 + (col / 3)] & (1 << val)) > 0) {
                    return false;
                }
                rows[row] |= (1 << val);
                cols[col] |= (1 << val);
                squares[(row / 3) * 3 + (col / 3)] |= (1 << val);
            }
        }
        return true;
    }

}