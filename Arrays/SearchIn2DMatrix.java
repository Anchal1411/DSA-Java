public class SearchIn2DMatrix {

   
    public boolean searchMatrix(int[][] arr, int target) {

        int n = arr.length;
        int m = arr[0].length;

        int start = 0, end = n*m-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            int midElement = arr[mid/m][mid%m];

            if(midElement == target) return true;

            if(target < midElement){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

       return false;
    }
}
    

