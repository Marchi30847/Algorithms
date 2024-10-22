public class Searching {
    private Searching(){}

    public static int skipping(int[] arr, int target, int stepSize) {
        int currentIndex = 0;
        while (currentIndex < arr.length) {
            if (arr[currentIndex] == target) {
                return currentIndex;
            } else if (arr[currentIndex] < target) {
                currentIndex = Math.min(currentIndex + stepSize, arr.length - 1);
            } else {
                currentIndex--;
            }
        }
        return -1;
    }
}
