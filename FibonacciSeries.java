public class FibonacciSeries {

    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // For line break
    }

    public static void main(String[] args) {
        int numberOfTerms = 10;  // You can change this value as needed
        generateFibonacci(numberOfTerms);
    }
}
