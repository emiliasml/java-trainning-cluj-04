package project2;

public class Knight extends Piece {

    public Knight(int x, int y, boolean dead, boolean white) {
        super(x, y, dead, white);
    }

    public boolean move(int toX, int toY) {
        if ((toX != getX() - 1 && toX != getX() + 1 && toX != getX() + 2 && toX != getX() - 2) ||
                (toY != getY() - 2 && toY != getY() + 2 && toY != getY() - 1 && toY != getY() + 1))
            return false;
        return true;
    }
}
