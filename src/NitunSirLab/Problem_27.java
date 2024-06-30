package NitunSirLab;

public class Problem_27 {
    public static void main(String[] args) {
        try {

            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (Exception e) {

            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static int divide(int a, int b) {
        return a / b;
    }
}
