# Eargo-Test
Solutions to coding problems of Eargo
Problem1 and Problem3 can be executed on any IDE like IntelliJ or Eclipse.
Problem2 can be executed by creating an equivalent input table with required columns and running the query (https://sqltest.net/)

Problem1:
Approach: I divided the input amount with the highest denomination (quarter - 25) and the quotient will become the number of quarters required and the input amount is updated as the remainder. Similarly, this approach is done for Nickel, dimes and Pennies.

The variable 'inputAmount' which is in cents can be updated in the main function to test for various test cases.
The inputAmount should be greater than '0', else we get output as "Invalid input amount".
The program can be run on any IDE like Eclipse or IntelliJ.

Problem2:
For this, an input table has to be created with the given requirements.
Example: 
CREATE TABLE sql_test_a 
( 
    ID         VARCHAR2(4000 BYTE), 
    Home_Page VARCHAR2(200 BYTE), 
    Product_Page  VARCHAR2(200 BYTE),
    Warranty_Page VARCHAR2(200 BYTE)
); 
INSERT INTO sql_test_a (ID, Home_Page, Product_Page, Warranty_Page) VALUES ('1', '1', '1', '1'); 

INSERT INTO sql_test_a (ID, Home_Page, Product_Page, Warranty_Page) VALUES ('2', '1', '0', '0'); 

INSERT INTO sql_test_a (ID, Home_Page, Product_Page, Warranty_Page) VALUES ('3', '0', '0', '1'); 

INSERT INTO sql_test_a (ID, Home_Page, Product_Page, Warranty_Page) VALUES ('4', '0', '1', '0'); 

INSERT INTO sql_test_a (ID, Home_Page, Product_Page, Warranty_Page) VALUES ('5', '1', '1', '0'); 

INSERT INTO sql_test_a (ID, Home_Page, Product_Page, Warranty_Page) VALUES ('6', '1', '0', '0');

--> On this data, the solution(query) is run to get the desired output.

Output is:
HOME_PAGE_COUNT : 4
PRODUCT_PAGE_COUNT: 4
WARRANTY_PAGE_COUNT: 4

Problem3:
Approach: I used a dynamic programming approach for this problem. I stored the value at every index if if is less than its former value. If the above case is false (which means I can make profit), then I calculated the difference between the current stockPrice and the stockPrice of the day on which I intended to sell. If this difference is greater than previous profit, then I update profit as well as the Day_Bought and Day_Sold.

In this problem , the input array is defined as 'stockPrices'.
The stockPrices array can be modified as required to test various test cases.

Example1: stockPrices = {18, 14, 10, 8, 5, 3}
for this kind of input (sorted descending order) , there is no profit, hence thre are no buying or selling days.

Example2: stockPrices = {2,5,10,15,20,25,30,1,29};
In this example, there are two pairs where we get maximum profit of 28. But we return {2,30 - Day1,Day7} since we encountered that pair first.

Similarly, other test cases can be written by modifying the stockPrices array.

