// Binery Search

public class Binary_search {

    public static int binarySearch(int numbers[], int key) {

        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // Comparisons
            if (numbers[mid] == key) { // Found
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1; // Right
            } else {
                end = mid - 1; // Left
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;

        System.out.println("Index of key is : " + binarySearch(numbers, key));

    }
}
