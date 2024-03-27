public class MathFunctions {
    public static void main(String[] args) {

        System.out.print("PI Value: " + Math.PI);
        System.out.println("Sin (0): " + Math.sin(0));
        System.out.println("Sin (90): " + Math.sin(Math.PI / 2));
        System.out.println("cos (30): " + Math.cos(Math.PI / 6));
        System.out.println("sin (30): " + Math.sin(Math.PI / 6));

        System.out.println("Exp Value: " + Math.E);
        System.out.println("Exponent 1: " + Math.exp(1));
        System.out.println("2 Power 3: " + Math.pow(2,3));
        System.out.println("Square root of 16: " + Math.sqrt(16));

        System.out.println("Max 6 and 8: " + Math.max(6, 8));
        System.out.println("Min 6 and 8: " + Math.min(6, 8));
        System.out.println("Absolute Value: " + Math.abs(-3));

        System.out.println("Max of 12, 17, 9: " + Math.max(12, Math.max(17, 9)));

        System.out.println("Round Up: " + Math.ceil(2.4));
        System.out.println("Round Down: " + Math.floor(2.7));
        System.out.println("Round Integer: " + Math.rint(2.5));

        System.out.println("Random 0 - 9: " + (int)(Math.random() * 10));
        System.out.println("Random 50 - 99: " + (50 + (int)(Math.random() * 50)));
        System.out.println("Random 20 - 50: " + (20 + (int)(Math.random() * 31)));
        System.out.println("Random 100 - 500: " + (100 + (int)(Math.random() * 401)));

        System.out.println(('z' - 'a' + 1));
        System.out.println("Random character a - z: " + (char)('a' + (int)(Math.random() * ('z' - 'a' + 1))));
        System.out.println("Random character A - Z: " + (char)('A' + (int)(Math.random() * ('Z' - 'A' + 1))));

    }
}
