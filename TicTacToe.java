import java.util.Scanner;

public class TicTacToe {

    public static boolean checkWon(char[][] board,char player){
        if (board[0][0] == player && board[0][1] == player && board[0][2] == player ||
                board[1][0] == player && board[1][1] == player && board[1][2] == player ||
                board[2][0] == player && board[2][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][0] == player && board[1][0] == player && board[2][0] == player ||
                board[0][1] == player && board[1][1] == player && board[2][1] == player ||
                board[0][2] == player && board[1][2] == player && board[2][2] == player ) {
            return true;
        }
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player ||
                board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }
    public static String checkBoard(char[][]board){
       int countOfO=0;
       int countOfX=0;
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               if(board[i][j]=='X')countOfX++;
               else if(board[i][j]=='O')countOfO++;
           }
       }



       if(countOfX>countOfO+1 || countOfO>countOfX){
           return "Wrong Turn !!!";

       }

       boolean XWon=checkWon(board,'X');
        boolean OWon=checkWon(board,'O');

        if (XWon && OWon) {
            return "Game Ended Already";
        }

        if (XWon || OWon) {
            return "WIN";
        }

        if(countOfX+countOfO==9){
            return "Draw";
        }

        return "OnGoing";

    }
    public static void main(String[] args) {
        char[][] board = {
                {'X', 'X', ' '},
                {'O', 'O', ' '},
                {' ', ' ', ' '}
        };
        System.out.println(checkBoard(board));

    }
}
