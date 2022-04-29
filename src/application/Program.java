package application;

import boardgame.Piece;
import boardgame.Position;
import chess.ChessMatch;

public class Program {

    public static void main(String[] args){
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }

}
