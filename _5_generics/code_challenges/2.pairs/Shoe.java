package pairs;

public interface Shoe {
    String getColor();
    int getSize();
}
class Running implements Shoe {
    String color;
    int size;

    Running(String c, int s) {
        this.color = c;
        this.size = s;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
class  Heels implements Shoe {
    String color;
    int size;

    Heels(String c, int s) {
        this.color = c;
        this.size = s;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
class Boot implements Shoe {
    String color;
    int size;

    Boot(String c, int s) {
        this.color = c;
        this.size = s;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
