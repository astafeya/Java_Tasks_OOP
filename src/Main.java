import singleclasses.*;


public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 20, 45);
        Container container = new Container(0, 100, 100, 100);

        for (int i = 0; i < 5; i++) {
            ball.move();
            System.out.println(ball.getX() + " " + ball.getY());
            System.out.println((container.collides(ball)) ? "Ball in container\n" : "Ball out of conteiner\n");
        }
    }
}
