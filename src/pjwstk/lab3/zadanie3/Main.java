package pjwstk.lab3.zadanie3;

public class Main {

    public static void main(String[] args) {
        MyTriangle circle = new MyTriangle(2, 2, 4, 4, 5, 2);

        System.out.println(circle.getPerimeter());
        System.out.println(circle.getType());
    }
}
