import static java.lang.Math.PI;

public class Circle extends Figures{
    String CircleColor = "White";

    double CircleRadius = 10;
    double CircleDiameter = 2 * CircleRadius;
    double CircleArea = PI * (CircleRadius * CircleRadius);
    // Унікальний метод для фігури, як в завданні ("Також фігури мають унікальні методи, наприклад, повернути радіус ...")
    // Він не викликаеться в програмі окремо, так як є не обов'язковим для виклику, але він є =)
    public void PrintCircleDiameter(){
        System.out.println("Circle diameter is: " + CircleDiameter);}
    public void showArea() {
        System.out.println("Figure area is: " + CircleArea);
    }
    public void showColor() {
        System.out.println("Figure color is: " + CircleColor);
    }
    public void draw() {
        System.out.println("Circle. Figure area is: "+ CircleArea + ". "
                + "Circle diameter is: " + CircleDiameter + ". "
                + "Figure color is: " + CircleColor);
    }
}
