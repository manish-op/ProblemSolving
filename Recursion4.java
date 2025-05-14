package ProblemSolving;

//sum of first n natural numbers
public class Recursion4 {
    public static void main(String[] args) {
        System.out.println(sumOfNatural(5));
        System.out.println(factorial(5));

        int[] nums = {1, 2, 3, 4, 5};
        System.out.print("Before swapping :");
        for (int i : nums) {

            System.out.print(i + " ");

        }
        System.out.println();
        reverseArray(nums, 0, nums.length - 1);
        System.out.print("After swapping :");
        for (int i : nums) {

            System.out.print(i + " ");
        }
    }


    static int sumOfNatural(int n) {
        // int sum=0;
        if (n < 1) {
            return 0;
        }
        return n + sumOfNatural(n - 1);
    }

    //to find the factorial of N using recursion.
    static int factorial(int n) {

        if (n < 1) {
            return 1;
        }

        return n * factorial((n - 1));
    }

    //to reverse an array using recursion

    public static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) return; // Base case: Stop when left crosses right
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp; // Swap elements
        reverseArray(arr, left + 1, right - 1); // Recursive call
    }


}
