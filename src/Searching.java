public class Searching {
    private Searching(){}

    public static int skipping(int[] arr, int target, int stepSize) {
        int currentIndex = 0;
        int previousJumpIndex = -1;
        while (currentIndex > previousJumpIndex) {
            if (arr[currentIndex] == target) {
                return currentIndex;
            } else if (arr[currentIndex] < target) {
                previousJumpIndex = currentIndex;
                currentIndex = Math.min(currentIndex + stepSize, arr.length - 1);
            } else {
                currentIndex--;
            }
        }
        return -1;
    }

    /*public static int binarySearch(int[] arr, int target) {

    }*/
}
