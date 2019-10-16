import java.util.*;
class Problem3{
    public static void main(String[] args){
        int stockPrices[] = new int[]{2,5,10,15,20,25,30,1,30}; //Input array of stock prices
        int profit=0;
        int[] days = new int[2]; //Array to store the buying and selling day
        int previous = 0;
        int max = Integer.MAX_VALUE;
        if(stockPrices !=null) {
            calculateBuySellDays(stockPrices, days, previous, max, profit); //Calculate only if the inputarray is populated
        }
        else{
            System.out.println("Input array is empty");
        }
    }
    public static int[] calculateBuySellDays(int[] stockPrices,int[] days,int previous,int max,int profit){

        for(int i=0;i<stockPrices.length;i++){          //Iterating through the input array ( O(n) solution)
            if(stockPrices[i] < max){                   //If the current value is less than the previous max, update the max value
                max = stockPrices[i];                   //Store this index because this will (index + 1) be the buying day
                previous=i;
            }
            else if(stockPrices[i] - max > profit){     //If the above condition is not satisfied, then it means we can gain profit if the former profit is less than the current difference.
                profit = stockPrices[i] - max;          //Update profit
                days[0]=previous+1;                     //The buying day will be the index stored in 'previous' variable + 1
                days[1] = i+1;                          //The selling day will be the current index value + 1
            }
        }

        if(profit!=0){                                  //If profit is > 0 then print/return the buy and sell days.
            System.out.println("Max Profit is: "+profit);
            System.out.println("Buy on: "+days[0]+"\nSell on: "+days[1]);
            return days;
        }
        else {
            System.out.println("\nThere is no profit");
            return new int[]{0,0};
        }
    }

} 