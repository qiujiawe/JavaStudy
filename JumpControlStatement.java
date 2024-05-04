public class JumpControlStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2)
                break;
            System.out.println("循环5次,这是第" + (i + 1) + "次。");
        }
        System.out.println("--------------------------------分割线");
        for (int i = 0; i < 5; i++) {
            if (i == 2)
                continue;
            System.out.println("循环5次,这是第" + (i + 1) + "次。");
        }
    }
}
