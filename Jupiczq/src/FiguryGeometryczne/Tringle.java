package FiguryGeometryczne;

public class Tringle {
    float x,y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Tringle(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void add (Tringle point1){
        point1.x+=6;
        point1.y+=4;
    }
}
