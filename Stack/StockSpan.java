import java.util.*;
public class StockSpan {

    public static void stockSpanProblem(int[] prices, int[] span){

        Stack<Integer> s = new Stack<>();

        span[0] = 1;
        s.push(0);
        for(int i = 1; i< prices.length; i++){

         while(!s.isEmpty() && prices[i] >= prices[s.peek()]){
            s.pop();
            
        }

        if(s.isEmpty()){
            span[i] = i + 1;
        } else {
            span[i] = i - s.peek();
        }

        s.push(i);
    }

    }

    public static void main(String[] args) {
        
        int[] prices = {100, 80, 60, 70, 60, 75, 85, 100};
        int[] span = new int [prices.length];

        stockSpanProblem(prices, span);
        for(int i = 0; i< span.length; i++){
            System.out.print(span[i] + " ");
        }
    }
}