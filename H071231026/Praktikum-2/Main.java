//Tugas003
class Cuboid {
    double height;
    double width;
    double length;


    double getVolume() {
        return height * width * length;
    }
}

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 15;
        cuboid.width = 30;
        cuboid.length = 10;
        System.out.printf("Volume: %.2f\n", cuboid.getVolume());
    }
}