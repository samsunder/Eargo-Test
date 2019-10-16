//Problem - 3

import java.util.*;
class Problem3{
  public static void main(String[] args){
    //int prices[] = new int[]{3,8,8,55,38,1,7,42,54,53,0,52,18};
    int prices[] = new int[]{9,8,7,6,5,4,3};
    int profit=0;
    int[] days = new int[2];
    int previous = 0;
        int max = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < max){
                max = prices[i];
                previous=i;
            }
            else if(prices[i] - max > profit){
                profit = prices[i] - max;
                days[0]=previous+1;
                days[1] = i+1;
            }
        }
        if(profit!=0){
        System.out.println("Max Profit is: \n"+profit);
        System.out.println("\nBuy on: "+days[0]+"\nSell on: "+days[1]);
        }
        else{
          System.out.println("\nThere is no profit");
        }
  }
} 