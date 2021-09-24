package datastructure.algorithms.search;

public class Binary {

    public int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            System.out.println("Midpoint=" + midpoint);
            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] < value) {
                // search right side array
                // input[mid]=10, value=20
                start = midpoint + 1;
            } else {
                // search left array
                end = midpoint;
            }
        }
        return -1;
    }

    public int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    private int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;
        System.out.println("Midpoint:"+ midpoint );

        if (input[midpoint] == value) {
            return midpoint;
        } else if (input[midpoint] < value) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        } else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }

    public static void main(String[] args) {
        Binary searcher = new Binary();
        int[] data = { -22, -15, 1, 7, 20, 35, 55};
//        System.out.println(searcher.iterativeBinarySearch(data, -15));
//        System.out.println(searcher.iterativeBinarySearch(data, 35));
//        System.out.println(searcher.iterativeBinarySearch(data, 8888));
//        System.out.println(searcher.iterativeBinarySearch(data, 1));

        System.out.println(searcher.recursiveBinarySearch(data, -15));
        System.out.println(searcher.recursiveBinarySearch(data, 35));
        System.out.println(searcher.recursiveBinarySearch(data, 8888));
        System.out.println(searcher.recursiveBinarySearch(data, 1));
    }
}
