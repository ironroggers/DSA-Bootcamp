public class NearlySorted {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 10, 30, 20, 40};
        int index = nearSearch(arr, 4);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int num, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (num > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int nearSearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                int ind1 = binarySearch(arr, num, start, mid);
                int ind2 = binarySearch(arr, num, mid + 1, end);
                return Math.max(ind1, ind2);
            } else if (arr[mid] < num && arr[mid - 1] != num && arr[mid + 1] != num) {
                end = mid - 1;
            } else if (arr[mid] < num && arr[mid - 1] == num) {
                return mid - 1;
            } else if (arr[mid] < num && arr[mid + 1] == num) {
                return mid + 1;
            } else if (arr[mid] > num && arr[mid - 1] != num && arr[mid + 1] != num) {
                end = mid - 1;
            } else if (arr[mid] > num && arr[mid - 1] == num) {
                return mid - 1;
            } else if (arr[mid] > num && arr[mid + 1] == num) {
                return mid + 1;
            }

        }
        return -1;
    }
}
