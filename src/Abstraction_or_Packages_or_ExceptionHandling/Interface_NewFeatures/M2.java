package Abstraction_or_Packages_or_ExceptionHandling.Interface_NewFeatures;

@FunctionalInterface
interface Test {
    int myFunction(int a, int b, int c);
}

public class M2 {
    public static void main(String[] args) {
        // Lambda expression for addition
        Test t1 = (a, b, c) -> a + b + c;

        // Lambda expression for multiplication
        Test t2 = (a, b, c) -> a * b * c;

        // Calling the functions and printing results
        int sumResult = t1.myFunction(2, 3, 4);      // 2 + 3 + 4 = 9
        int productResult = t2.myFunction(2, 3, 4);  // 2 * 3 * 4 = 24

        System.out.println("Sum: " + sumResult);
        System.out.println("Product: " + productResult);
    }
}
