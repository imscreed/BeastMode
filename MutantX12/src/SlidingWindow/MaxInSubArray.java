package SlidingWindow;

class MaxInSubArray {
    public static int findMax(int K, int[] arr) {
        int max = 0;
        int windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd]; // add the next element
            // slide the window, we don't need to slide if we've not hit the required window size of 'k'
            System.out.println("Window Start: " + windowStart +" Window End: "+windowEnd+" Window Sum: "+windowSum);
            if (windowEnd >= K - 1) {
//            if (windowEnd >= windowStart + K - 1) { // Both works
                if(windowSum > max) max = windowSum;
                windowSum -= arr[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int result = MaxInSubArray.findMax(3, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Max of subarrays of size K: " + result);
    }
}