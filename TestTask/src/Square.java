public class Square extends Figures {
    double SquareSide = 6;
    String SquareColor = "Black";
    double SquareArea = SquareSide * SquareSide;
    // Унікальний метод для фігури, як в завданні ("Також фігури мають унікальні методи, наприклад, повернути радіус ...")
    // Він не викликаеться в програмі окремо, так як є не обов'язковим для виклику, але він є =)
    public void PrintLengthSquareSide(){
        System.out.println("Square side length is: " + SquareSide);
    }
    public void showArea() {
        System.out.println("Figure area is: " + SquareArea);
    }
    public void showColor() {
        System.out.println("Figure color is: " + SquareColor);
    }
    public void draw() {
        System.out.println("Square. Figure area is: "+ SquareArea + ". " + "Square side length is: " + SquareSide + ". "
                + "Figure color is: " + SquareColor);
    }
}
