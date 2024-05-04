import java.util.Random;
import java.util.Scanner;
public class CreateRandom {
    public static void main(String[] args) {
        Random ra = new Random();
        // 生成[0,10)范围内的整数随机数
        int num = ra.nextInt(10);
        System.out.println(num);
        // 猜数字游戏
        num = ra.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入一个1~100范围内的数字:");
            int result = sc.nextInt();
            if (result <= 0 || result > 100) {
                System.out.println("超出范围");
                continue;
            }
            if (num == result) {
                System.out.println("猜对了！");
                break;
            } else if (num > result) {
                System.out.println("小了！");
            } else {
                System.out.println("大了！");
            }
        }
        sc.close();
    }
}
