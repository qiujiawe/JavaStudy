import java.util.Scanner;
public class ScannerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的年龄:");
        int age = sc.nextInt();
        System.out.println(age >= 18 ? "您成年了" : "您还未成年");
    }
}
