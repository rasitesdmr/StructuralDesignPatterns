public class Square extends Shape{

    public Square(Color color){
        super(color);
    }

    @Override
    public String draw() {
        return "Kare çiz " + color.fill() ;
    }
}
