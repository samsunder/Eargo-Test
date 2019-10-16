import java.lang.*;
import java.util.HashMap;

class Problem1 {
    public static void main(String[] args) {
        int inputAmount = 143;   //Input amount value
        HashMap<String,Integer> map = new HashMap<>(); //Hashmap to store end result
        if(inputAmount>0) {
            calculateChange(inputAmount,map);
            for (HashMap.Entry<String, Integer> pair : map.entrySet()) { //Iterating through the HashMap to print the results
                System.out.println(pair.getKey() + pair.getValue());
            }
        }
        else{
            System.out.println("Invalid Input Amount");
        }
    }
    public static HashMap<String,Integer> calculateChange(int inputAmount,HashMap<String,Integer> map){
        int quarters = Math.round((int)inputAmount/25); //Given amount divided by 25 will give us the quarters required
        inputAmount=inputAmount%25;                     //The remainder will be assigned to the original input amount
        int dimes = Math.round((int)inputAmount/10);    //The updated input amount when divided by 10 gives the dimes required
        inputAmount=inputAmount%10;                     //Again, the input amount is updated with the remainder value
        int nickels = Math.round((int)inputAmount/5);   //Similarly, for nickels and pennies the above process is followed.
        inputAmount=inputAmount%5;                      //I have typecasted to (int) just incase if the input value is modified to double or float,
        int pennies = Math.round((int)inputAmount/1);   //Since the input is in cents, it should be an integer always.

        map.put("Quarters: ",quarters);     //Updating HashMap with the results
        map.put("Dimes: ",dimes);
        map.put("Nickels: ",nickels);
        map.put("Pennies: ",pennies);

        System.out.println("Quarters: " + quarters); //Printing on the console as well.
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);

        return map; //Return the HashMap.
    }
}