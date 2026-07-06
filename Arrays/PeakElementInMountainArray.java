public class PeakElementInMountainArray {

     public int peakIndexInMountainArray(int[] arr) {

        int n = arr.length-1;
        int ans = -1;
        int start = 0, end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] < arr[mid+1]){
                ans = mid+1;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
    

