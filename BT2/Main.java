package BT2;
public class Main {

    public static void main(String[] args) {
        // Tạo một điểm 2D
        Point2d point2D = new Point2d(1.0f, 2.0f);

        // In ra tọa độ của điểm 2D
        System.out.println("Tọa độ điểm 2D: " + point2D);

        // Di chuyển điểm 2D
        point2D.setXY(3.0f, 4.0f);

        // In ra tọa độ sau khi di chuyển
        System.out.println("Tọa độ sau khi di chuyển: " + point2D);

        // Tạo một điểm 3D
        Point3d point3D = new Point3d(5.0f, 6.0f, 7.0f);

        // In ra tọa độ của điểm 3D
        System.out.println("Tọa độ điểm 3D: " + point3D);

        // Di chuyển điểm 3D
        point3D.setXYZ(8.0f, 9.0f, 10.0f);

        // In ra tọa độ sau khi di chuyển
        System.out.println("Tọa độ sau khi di chuyển: " + point3D);
    }
}