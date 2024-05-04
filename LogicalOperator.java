public class LogicalOperator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        // 逻辑与，两个条件同时为 true 时结果为 true，其余都是 false
        System.out.println(a & b);
        System.out.println(a && b);
        // 逻辑或，两个条件同时为 false 时结果为 false，其余都是 true
        System.out.println(a | b);
        System.out.println(a || b);
        // 逻辑异或，两个条件同时为 true 或 false 时结果为 true，其余都是 false
        System.out.println(a ^ b);
        // 逻辑非,条件为 true 结果为 false，条件为 false 结果为 true
        System.out.println(!b);
    }
}
