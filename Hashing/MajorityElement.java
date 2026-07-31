import java.util.*;
public class MajorityElement {
    

    public int majorityElement(int[] arr) {
        HashMap <Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i] , hm.get(arr[i]) + (1) );
            } else {
                hm.put(arr[i] , 1);
            }
        }
         
         for(Integer key : hm.keySet()){
            if(hm.get(key) > arr.length/2){
                 return key;
            }
         }
         return -1;
    }
}

    

