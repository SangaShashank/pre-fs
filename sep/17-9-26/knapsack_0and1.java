/*/*
Mr. Dharma went to D-mart, and picked a basket with a capacity C.
There are N products in Dharma's wishlist.
You will be given the cost and quantity of each Product.
Products are packed items: Mr. Dharma must either take a product
completely or leave it. A product cannot be split or taken partially,
and each product can be taken at most once.

Out of the wishlist Mr Dharma has, he wants to purchase the products
in the following way:
	- The sum of quantities taken into the basket is less than or equal to C.
	- The sum of cost of the products in the basket is maximum among all
	   the possible combinations of products.

Your task is to help Mr. Dharma purchase the products with maximum cost,
with the given basket capacity.

Input Format:
-------------
Line-1: Two space separated integers, N and C.
Next N lines: Two space separated integers, Ci and Qi. cost and quantity of i-th product.

Output Format:
--------------
Print an integer, Maximum cost to pay to D-Mart.

Sample Input-1:
---------------
4 15
10 2
10 4
12 6
18 9

Sample Output-1:
----------------
38

Explanation:
------------
Take products 1, 2 and 4 (all completely).
Quantity = 2 + 4 + 9 = 15
Cost = 10 + 10 + 18 = 38

Sample Input-2:
---------------
4 21
18 6
20 3
14 5
18 9

Sample Output-2:
----------------
56

Explanation:
------------
Take products 1, 2 and 4.
Quantity = 6 + 3 + 9 = 18
Cost = 18 + 20 + 18 = 56
(Taking all four needs quantity 23 > 21, and no partial products are allowed.)
*/
import java.util.*;
public class knapsack_0and1 {
	static int n, capacity;
	static int cost[] = new int[n], weight[] = new int [n];
	// actual ga fucntion call pass cheayli kani , function ep ep ayitadi ani ooriekey ila rasina 
	// if u want change later
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
		 n = s.nextInt();
		 capacity = s.nextInt();
		for(int i=0;i<n;i++) {
			cost[i] = s.nextInt();
			weight[i] = s.nextInt();
		}
		System.out.println(solve(0,capacity));
    }
	public static int solve(int i, int space){
		if(i==n) return 0;
		int leave = solve(i+1,space) ;
		int take = 0;
		if(weight[i]<=space){
			take = cost[i] + solve(i+1, space-weight[i]);
		}
		return Math.max(leave,take);
	}
}
