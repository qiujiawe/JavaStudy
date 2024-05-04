public class LoopCase {
    public static void main(String[] args) {
        // for 语句
        for (int i = 0; i < 10; i++) {
            System.out.println("循环10次,这是第" + (i + 1) + "次。");
        }
        // 求1~5的和
        int sum = 0;
        for (int i = 1; i < 6; i++) {
            sum += i;
        }
        System.out.println("1~5的和为:" + sum);
        // 求1~100的偶数和
        sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1~100的偶数和为:" + sum);
        // 在控制台打印所有水仙花数
        for (int i = 100; i <= 999; i++) {
            int num = i;
            int hundredsPlace = num / 100;
            num %= 100;
            int tensDigit = num / 10;
            num %= 10;
            int unitsDigit = num;
            double powSum = Math.pow(hundredsPlace, 3) + Math.pow(tensDigit, 3) + Math.pow(unitsDigit, 3);
            if (i == powSum)
                System.out.println(i);
        }
        // while 语句
        sum = 0;
        while (sum < 10) {
            System.out.println("循环10次,这是第" + ++sum + "次。");
        }
        // 高度0.1毫米的纸,折叠多少次后高度大于等于8844430毫米
        sum = 0;
        double high = 0.1;
        while (high < 8844430) {
            high *= 2;
            sum++;
        }
        System.out.println(sum);
        // do while 语句
        sum = 0;
        do {
            System.out.println("循环10次,这是第" + ++sum + "次。");
        } while (sum < 10);
    }
}
