package miniproject;

// tictactoe

public class B {

    private int [][] board;

    B(){
        board = new int [3][3];
    }

    void makeMove(int x, int y, int player){
        if(board[x][y] == 0){
            board[x][y] = player;
        }
        else{
            System.out.println("Impossible move!");
        }

        end(player);
    }

    private void end(int player){
        if(Win()){
            System.out.println("Player " + player + " Wins!");
            System.exit(0);
        }
        
        if(Tied()){
            System.out.println("The Game is over. The Players have tied.");
            System.exit(0);
        }
    }

    private boolean Win(){

        // horizontal & vertical
        for(int i = 0; i < 3; i++){
            boolean horizonal = true;
            boolean vertical = true;
            for(int j = 0; j < 2; j++){
                if(board[i][j] != board[i][j+1] || board[i][j] == 0){
                    horizonal = false;
                }
                if(board[j][i] != board[j+1][i] || board[j][i] == 0){
                    vertical = false;
                }

                if(!(vertical || horizonal)){break;} 
                    
            }

            if (horizonal || vertical){
                return true;
            }
        }

        // diagonal

        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != 0){
            return true;
        }

        if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] != 0){
            return true;
        }

        return false;
    }

    private boolean Tied(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }
    
}