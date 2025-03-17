package Inthence;

public class Point {

    public double x;
    public double y;


    public Point() {

        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void zeruj() {
        this.x = 0;
        this.y = 0;
    }
    public void opis() {
        System.out.println("Punkt ma współrzędne: x = " + this.x + ", y = " + this.y);
    }
    public void przesuń(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}


