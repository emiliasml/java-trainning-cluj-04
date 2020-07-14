package project2;

public class Game {
    public static void main(String[] args) {
        Player white = new Player(true);
        Player black = new Player(false);
        white.setStart();
        black.setStart();
        Board board = new Board();
        for (int index = 1; index <= black.getPieces().size(); index++) {
            int i = black.getPieces().get(index).getX();
            int j = black.getPieces().get(i).getY();
            board.getSpot(i, j).occupySpot(black.getPieces().get(i));
        }
    }
}