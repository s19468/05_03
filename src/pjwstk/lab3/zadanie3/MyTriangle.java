package pjwstk.lab3.zadanie3;

public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1.toString() + "," + v2.toString() + "," + v3.toString() + "]";
    }

    public double getPerimeter() {
        double x = v1.distance();
        double y = v2.distance();
        double z = v3.distance();

        return x + y + z;
    }

    public String getType() {
        double a = v1.distance();
        double b = v2.distance();
        double c = v3.distance();

        if(a == b && a == c) {
            return "Equilateral";
        } else if(a == b || a == c || b == c) {
            return "Isosceles";
        } else if(a != b && b != c && a != c) {
            return "Scalene";
        }

        return null;
    }
}
