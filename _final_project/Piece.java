package project2;

public class Piece {
    private int x, y;
    private boolean dead, white;

    public Piece(int x, int y, boolean dead, boolean white) {
        this.x = x;
        this.y = y;
        this.dead = dead;
        this.white = white;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isDead() {
        return dead;
    }

    public boolean isWhite() {
        return white;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public void killed(boolean dead) {
        this.dead = true;
        this.x = -1;
        this.y = -1;
    }

    public boolean basicMove(int toX, int toY) {
        if (toX > 8 || toY > 8 || toX < 1 || toY < 1) return false;
        else {
            this.x = toX;
            this.y = toY;
            return true;
        }
    }
}
