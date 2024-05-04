public class AutomaticTypeConversion {
    public static void main(String[] args) {
        byte age = 18;
        int newAge = age;
        double newNewAge = newAge;
        System.out.println(newAge);
        System.out.println(newNewAge);
        // long test = newNewAge; 编译报错，cannot convert from double to long
    }
}
