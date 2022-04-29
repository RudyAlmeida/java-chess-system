package boardgame;

public class BoardException extends RuntimeException{
    private static final long serialVersionUID = 1;

    public BoardException(String msg){
        super(msg);
    }
}
