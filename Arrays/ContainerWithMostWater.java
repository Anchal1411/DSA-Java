public class ContainerWithMostWater {

   
    public int maxArea(int[] height) {
      

        int maxWater = 0;
        int lp = 0;
        int rp = height.length-1;

        while(lp<rp){
            int lh = height[lp];
            int rh = height[rp];
            int min_h = Math.min(lh,rh);
            maxWater = Math.max(maxWater, min_h *(rp-lp));

            if(lh<rh){
                lp++;

            } else {
                rp--;
            }
        }
        return maxWater;
    } 
    
    
}

        
    

