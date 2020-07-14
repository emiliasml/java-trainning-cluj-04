package project2;

public class Rook extends Piece {

    public Rook(int x, int y, boolean dead, boolean white) {
        super(x, y, dead, white);
    }

    public boolean move(int toX, int toY) {
        if ((toX == getX() && toY != getY()) || (toX != getX() && toY == getY()))
            basicMove(toX, toY);
        return false;
    }
}
