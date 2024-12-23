import java.util.Scanner;
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToe
{
  
    public char[][] board = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};

    public boolean gameOver = false;
    public boolean xPlayerTurn = true;
    public int round = 1;
    Scanner input = new Scanner(System.in);
    
    public void startGame()
    {
        System.out.println("TIC-TAC-TOE");
        printBoard();
        while (!gameOver)
        {   
            if (xPlayerTurn)
            {
                System.out.println("Round " + round + ".");
                promptMove('X');
                xPlayerTurn = false;
                if (checkWin('X'))
                    gameOver = true;
            }
            else
            {
                promptMove('O');
                xPlayerTurn = true;
                round++;
                if (checkWin('O'))
                    gameOver = true;
            }
            printBoard();
            
            
        }
    }
    
    public void printBoard()
    {
        System.out.println();
        for (int row = 0; row < board.length; row++)
        {
            for (int col = 0; col < board[row].length; col++)
            {
                if (board[row][col] == 'X')
                {
                    System.out.print("[X]");
                }
                else if (board[row][col] == 'O')
                {
                    System.out.print("[O]");
                }
                else
                {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void promptMove(char symbol) {
    
        String candidateMove = "";
        int candidaterow = -1;
        int candidatecol = -1;
        
        
        boolean validMove = false;
        while (!validMove) {
            System.out.println(symbol + ", make your move. (row,col): ");
        
            candidateMove = input.nextLine();
            candidaterow = Integer.parseInt(candidateMove.substring(0, 1));
            candidatecol = Integer.parseInt(candidateMove.substring(candidateMove.indexOf(",")+1, candidateMove.length()));
          

            validMove = checkValidMove(symbol, candidaterow, candidatecol);
            if (!validMove) {
                System.out.println("Move was not valid. Try again.");
            }   
        }

        placeSymbol(symbol, candidaterow, candidatecol);
    }

    
    public boolean checkValidMove(char symbol, int row, int col)
    {
        if (row > 2 || row < 0)
        {
            System.out.println("Invalid row position. Choose again.");
            return false;
        }
        if (col > 2 || col < 0)
        {
            System.out.println("Invalid col position. Choose again.");
            return false;
        }
        
        if (board[row][col] != ' ')
        {
            System.out.println("Position already filled. Choose again.");
            return false;
        }
        
        return true;
    }
    
    public void placeSymbol(char symbol, int row, int col)
    {
        board[row][col] = symbol;
    }
    
    public boolean checkWin(char symbol)
    {
   
        for (int row = 0; row < board.length; row++)
        {
            boolean rowWin = true;
            for (int col = 0; col < board[row].length; col++)
            {
                if (board[row][col] != symbol)
                {
                    rowWin = false;
                }
            }
            
            if (rowWin)
            {
                System.out.println(symbol + " won on row " + row + ".");
                return true;
            }
        }
        
 
        for (int col = 0; col < board[0].length; col++)
        {
            boolean colWin = true;
            for (int row = 0; row < board.length; row++)
            {
                if (board[row][col] != symbol)
                {
                    colWin = false;
                }
            }
            if (colWin)
            {
                System.out.println(symbol + " won on column " + col + ".");
                return true;
            }
        }
        
   
        boolean negDiagWin = true;
        boolean posDiagWin = true;
        
        for (int row = 0; row < board.length; row++)
        {
            
            if (board[row][row] != symbol)
            {
                negDiagWin = false;
            }
            
            if (board[board.length - 1 - row][board.length - 1 - row] != symbol)
            {
                posDiagWin = false;
            }
            
            
            
        }
        
        if (negDiagWin)
            {
                System.out.println(symbol + " won on the 0,0 diagonal.");
                return true;
            }
            
            if (posDiagWin)
            {
                System.out.println(symbol + " won on the 0,2 diagonal.");
                return true;
            }
        
        return false;
    }
    
    
    
    public static void main(String[] args)
    {
        boolean keepPlaying = true;
        while (keepPlaying)
        {
            TicTacToe game = new TicTacToe();
            game.startGame();
            System.out.print("Enter (y) to play again: ");
            Scanner input = new Scanner(System.in);
            
            if (input.next().charAt(0) != 'y')
            {
                keepPlaying = false;
            }
            
            
        }
        

        
    }
    
    public TicTacToe()
    {
        char[][] board = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        boolean gameOver = false;
        boolean xPlayerTurn = true;
        int round = 1;
        
    }
}
