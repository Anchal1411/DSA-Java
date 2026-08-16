import java.util.*;
public class MostFrequentNumber {
    public int frequentNumber(ArrayList <Integer> nums, int key){

        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.size()-1; i++){

            if(nums.get(i) == key){
                int target = nums.get(i+1);

                map.put(target, map.getOrDefault(target, 0) + 1);
            }
        }

        int maxFreq = Integer.MIN_VALUE;
        int answer = 0;
        
        for(int target: map.keySet()){
            if(map.get(target) > maxFreq){
                maxFreq = map.get(target);
                answer = target;

            }
        }

        return answer;
  }

}
