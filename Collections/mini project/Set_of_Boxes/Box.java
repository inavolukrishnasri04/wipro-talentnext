public class Box implements Comparable<Box> {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public int compareTo(Box b) {
        if (this.getVolume() == b.getVolume())
            return 0;
        else if (this.getVolume() < b.getVolume())
            return -1;
        else
            return 1;
    }
}