public class Main {
    public static void main(String[] args) {
        // Kırmızı renkli bir kare
        Shape square = new Square(new Red());
        System.out.println(square.draw());
        // Mavi renkli üçgen
        Shape triangle = new Triangle(new Blue());
        System.out.println(triangle.draw());
    }
}
