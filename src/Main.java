public class Main {
    public static void main(final String[] args) {
        System.out.println("add");
        System.out.println("1 + 2 = " + new Cal(1, 2).add()); // 3
        System.out.println("-11 + 2 = " + new Cal(-11, 2).add()); // -9
        System.out.println("multiply");
        System.out.println("3 * 1 = " + new Cal(3, 1).multiply()); // 3
        System.out.println("5 * 5 = " + new Cal(5, 5).multiply()); // 25
        System.out.println("diff");
        System.out.println("|2 - 3| = " + new Cal(2, 3).diff()); // 1
        System.out.println("|6 - 6| = " + new Cal(6, 6).diff()); // 0
    }
}