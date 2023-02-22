public class Parallelogram {


    public int calculatePerimeter (int length, int width) {
        return 2 * (length + width);
    }

    public int calculatePerimeter (int sideLength) {
        return 4 * sideLength;
    }

    public double calculateArea (int length, double width) {
        return length * width;
    }

    public double calculateArea (int sideLength) {
        return sideLength * sideLength;
    }

}
