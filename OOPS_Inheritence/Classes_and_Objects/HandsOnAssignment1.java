public class HandsOnAssignment1 {

    private double width;
    private double height;
    private double depth;

    public HandsOnAssignment1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        HandsOnAssignment1 box = new HandsOnAssignment1(5, 4, 3);
        System.out.println("Volume = " + box.getVolume());
    }
}