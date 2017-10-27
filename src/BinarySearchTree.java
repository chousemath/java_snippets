public class BinarySearchTree {
    public static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
        if (left > right) return false;
        int mid = left + ((right - left) / 2);
        if (array[mid] == x) return true;
        else if (x < array[mid]) binarySearchRecursive(array, x, left, mid - 1);
        else binarySearchRecursive(array, x, mid + 1, right);
        return true;
    }

    public static boolean binarySearchRecursive(int[] array, int x) {
        return binarySearchRecursive(array, x, 0, array.length - 1);
    }

    public static boolean binarySearchIterative(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + ((right - left) / 2);
            if (array[mid] == x) return true;
            else if (x < array[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
