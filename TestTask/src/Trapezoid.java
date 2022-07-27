public class Trapezoid extends Figures {
    double TrapezoidWeight = 10;
    double a = 9;
    double b = 5;
    double TrapezoidArea = 0.5 * (a + b) * TrapezoidWeight;
    String TrapezoidColor = "Yellow";
    // Унікальний метод для фігури, як в завданні ("Також фігури мають унікальні методи, наприклад, повернути радіус ...")
    // Він не викликаеться в програмі окремо, так як є не обов'язковим для виклику, але він є =)
    public void PrintTrapezoidWeight(){
        System.out.println("Trapezoid weight is: " + TrapezoidWeight);}
    public void showArea() {
        System.out.println("Figure area is: " + TrapezoidArea );
    }
    public void showColor() {
        System.out.println("Figure color is: " + TrapezoidColor);
    }
    public void draw() {
        System.out.println("Trapezoid. Figure area is: "+ TrapezoidArea + ". "
                + "Trapezoid weight is: " + TrapezoidWeight + ". "
                + "Figure color is: " + TrapezoidColor);
    }
}
