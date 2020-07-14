package project2;

public class King extends Piece{

    public King(int x, int y, boolean dead, boolean white) {
        super(x, y, dead, white);
    }

    public boolean move(int toX, int toY){
        if(((toX == getX()) && (toY == (getY() + 1))) ||
                (toX == (getX()+1) && toY == getY())
        ||(toX == getX()+1 && toY ==getY()+1)
        ||(toX == getX()-1 && toY ==getY()+1)
        ||(toX == getX()+1 && toY ==getY()-1)
        ||(toX == getX()-1 && toY ==getY()-1))
            basicMove(toX, toY);
        return false;
    }
}
