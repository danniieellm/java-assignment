public class Multiples {
    public static void main(String[] args) {
        // Define the ranges to be used
        int start = 71;
        int end = 150;
        
        // Print multiples of 2, 3, and 7 within the range
        System.out.println("Multiples of 2, 3, and 7 between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}


