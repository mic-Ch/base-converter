import java.lang.Math;

class BaseConverter {
    public static void main(String[] args) {
        double num = 1500.0;
        int printNum = (int) num;
        double base = 9.0;
        double i = 0.0;
        double bar;
        double remainder;
        double value = 0.0;
        while (num != 0) {
            if (Math.pow(base, i) <= num) {
                ++i;
            } else {
                bar = Math.pow(base, i - 1.0);
                remainder = num % bar;
                num -= remainder;
                value += (num / bar) * Math.pow(10.0, i - 1.0);
                num = remainder;
                i = 0.0;
            }
        }
        System.out.print("\nThe value of ");
        System.out.print(printNum);
        System.out.println(" (base 10) is equal to:");
        System.out.print((int) value);
        System.out.print(" (base ");
        System.out.print((int) base);
        System.out.println(")\n");
    }
}