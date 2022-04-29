package chess;

import boardgame.BoardException;

public class ChessException extends BoardException {
    private static final long serialVersionUID = 1;

    public ChessException(String msg){
        super(msg);
    }
}