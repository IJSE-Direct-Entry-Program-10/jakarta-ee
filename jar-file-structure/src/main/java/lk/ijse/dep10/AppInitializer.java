package lk.ijse.dep10;

public class AppInitializer {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Hello JVM!");
    }
}
