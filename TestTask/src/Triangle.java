public class Triangle extends Figures {
    double TriangleWeight = 20;
    String TriangleColor = "Blue";
    double TriangleSide = 15;
    double TriangleArea = 0.5 * TriangleSide * TriangleWeight ;
    // Унікальний метод для фігури, як в завданні ("Також фігури мають унікальні методи, наприклад, повернути радіус ...")
    // Він не викликаеться в програмі окремо, так як є не обов'язковим для виклику, але він є =)
    public void PrintLengthTrianglesWeight(){
    System.out.println("Triangle weight length is: "+ TriangleWeight);}
    public void showArea() {
        System.out.println("Figure area is: " + TriangleArea);
    }
    public void showColor() {
        System.out.println("Figure color is: " + TriangleColor);
    }
    public void draw() {
        System.out.println("Triangle. Figure area is: " + TriangleArea + ". "
                + "Triangle weight length is: "+ TriangleWeight + ". "
                + "Figure color is: " + TriangleColor);
    }
}


