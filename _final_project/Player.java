package project2;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private final List<Piece> pieces = new ArrayList<>();
    private final boolean white;

    public Player(boolean white) {
        this.white = white;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setStart() {
        if (this.white) {
            for (int index = 1; index <= 8; index++)
                pieces.add(new Pawn(index, 2, false, true));
            pieces.add(new Rook(1, 1, false, true));
            pieces.add(new Rook(8, 1, false, true));
            pieces.add(new Knight(2, 1, false, true));
            pieces.add(new Knight(7, 1, false, true));
            pieces.add(new Bishop(3, 1, false, true));
            pieces.add(new Bishop(6, 1, false, true));
            pieces.add(new Queen(4, 1, false, true));
            pieces.add(new King(5, 1, false, true));
        } else {
            for (int index = 1; index <= 8; index++)
                pieces.add(new Pawn(index, 7, false, false));
            pieces.add(new Rook(1, 8, false, false));
            pieces.add(new Rook(8, 8, false, false));
            pieces.add(new Knight(2, 8, false, false));
            pieces.add(new Knight(7, 8, false, false));
            pieces.add(new Bishop(3, 8, false, false));
            pieces.add(new Bishop(6, 8, false, false));
            pieces.add(new Queen(4, 8, false, false));
            pieces.add(new King(5, 8, false, false));
        }
    }
}
