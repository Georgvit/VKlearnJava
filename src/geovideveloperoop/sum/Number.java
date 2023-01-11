package geovideveloperoop.sum;

public class Number {
    private int x;
    private int y;

    public Number(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sum(Number number){
        return this.x + this.y;
    }
}
