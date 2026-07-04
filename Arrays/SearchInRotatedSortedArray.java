public class SearchInRotatedSortedArray {

   
    public static int searchElement (int[] arr, int target){
        int start = 0, end = arr.length-1;


        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }

           else if(arr[mid] < arr[end]){
                if(target > arr[mid] && target <= arr[end]){
                    start = mid +1 ;
                } else{
                     end = mid - 1;
                }
                } else {
                    if(target >= arr[start] && target < arr[mid]){
                    end = mid - 1;

                } else {
                    start = mid +1;
                }

            }
            
        }
        return -1;
        
    }

   
  
  
  public static void main(String args[]){


    int[] arr =  {7,8,9,1,2,3,4,5,6};
    int target = 8;

    System.out.println(searchElement(arr,target));

    

   
    

 
    }

  }

       







    

