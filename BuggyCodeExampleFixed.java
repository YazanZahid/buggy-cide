public class BuggyCodeExampleFixed {

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, 4, -5};
        int max = findMax(numbers);
        System.out.println("Max: " + max);          // 4
        printArray(numbers);                          // prints all 5 elements
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);   // 0.2
    }
}
