public class Strong{

    // Function to calculate factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    
    // Function to check if a number is a strong number
    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int originalNum = num;
        
        // Break the number into digits and sum their factorials
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        
        // Return true if the sum of the factorials is equal to the original number
        return sum == originalNum;
    }

    public static void main(String[] args) {
        // Display a message indicating the program's function
        System.out.println("Strong numbers between 1 and 5000:");

        // Loop through numbers from 1 to 5000 and check if they are strong numbers
        for (int num = 1; num <= 5000; num++) {
            if (isStrongNumber(num)) {
                System.out.println(num);
            }
        }
    }
}
