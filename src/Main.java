public class Main {
    public static void main(String[] args) {

        Parallelogram parallelogram = new Parallelogram();
        int length = 3;
        int width = 4;

        Parallelogram parallelogram2 = new Parallelogram();
        int sideLength = 5;

        System.out.println("Figura 1: " + "perimetr = " + parallelogram.calculatePerimeter(length, width) + ", area =" + parallelogram.calculateArea(length, width));
        System.out.println("Figura 2: " + "perimetr = " + parallelogram2.calculatePerimeter(sideLength) + ", area =" + parallelogram2.calculateArea(sideLength));


    }
}