import java.util.Scanner;
public class IfCase {
    public static void main(String[] args) {
        System.out.print("请输入您的年龄:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // if 语句
        if (age < 0 || age > 120) {
            System.out.println("老毕登，你是真没见过黑社会啊！");
            System.exit(0);
        } 
        // if else 语句
        if (age >= 18) {
            System.out.print("您已成年，");
        } else {
            System.out.print("您还未成年，");
        }
        // if else if 语句
        if (age >= 0 && age < 18) {
            System.out.println("小登");
        } else if (age >= 18 & age < 35) {
            System.out.println("中登");
        } else {
            System.out.println("老登");
        }
        // switch 语句
        System.out.print("请输入您出生的月份:");
        int month = sc.nextInt();
        sc.close();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("您出生在春季");
                break;
            case 6 : 
            case 7 : 
            case 8 : 
                System.out.println("您出生在夏季");
                break;
            case 9 : 
            case 10 : 
            case 11 : 
                System.out.println("您出生在秋季");
                break;
            case 12 : 
            case 1 : 
            case 2 : 
                System.out.println("您出生在冬季");
                break;
            default:
                System.out.println("老毕登，你是真没见过黑社会啊！");
                break;
        }
    }
}
