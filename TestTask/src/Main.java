import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int selectCount = (int) (Math.random() * 11) + 1;
        String[] figuresArr = {"Square", "Triangle", "Circle", "Trapezoid"};
        String[] selectedArr = new String[selectCount];
        Random rnd = new Random();
        for (int i = 0; i < selectCount; i++) {
            selectedArr[i] = figuresArr[rnd.nextInt(figuresArr.length)];
        }
        System.out.println("Random set of shapes: " + Arrays.toString(selectedArr));
        Figures[] arr = new Figures[]{new Square(), new Triangle(), new Circle(), new Trapezoid()};
        for (int t = 0; t< arr.length; t++)
            arr[t].draw();}
    }