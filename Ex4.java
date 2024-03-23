public class Ex4 {
    public static void main(String[] args) {
        int a = 80000;
        int b = 200000;
        int years = 0;

        while (a < b) {
            a += a * (3.0 / 100);
            b += b * (1.5 / 100);
            years++;
        }

        System.out.println("País A: " + a);
        System.out.println("País B: " + b);
        System.out.println("O país A somente ultrapassará o país B após " + years + " anos.");
    }
}