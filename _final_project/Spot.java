package project2;

public class Spot {
    int x, y;
    Piece p;

    public Spot(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        p = null;
    }

    public void occupySpot(Piece piece){
        if(this.p != null)
            this.p.setDead(true);
        this.p = piece;
    }
    public boolean isOccupied() {
        return p != null;
    }

    public Piece releaseSpot() {
        Piece released = this.p;
        this.p = null;
        return released;
    }
}
