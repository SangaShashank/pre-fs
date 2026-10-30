/*
Mr. Dharma went to D-mart, and picked a basket with a capacity C.
There are N products in Dharma's wishlist.
You will be given desired cost and quantity of each Product.
Out of the wishlist Mr Dharma has, he wants to purchase the products in the following way:
	- The sum of quantities taken into the basket is less than or equal to C.
	- The sum of cost of the products in the basket is maximum among all 
	   the possible combinations of products.

Your task is to help, Mr. Dharma to purachase the products with maximum cost, 
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
38.0

Explanation:
------------
Quantity = 2 + 4 + 6 + 3 = 15
Cost = 10 + 10 + 12 + 6 = 38


Sample Input-2:
---------------
4 21
18 6
20 3
14 5
18 9

Sample Output-2:
----------------
66.0

Explanation:
------------
Quantity = 6 + 3 + 5 + 4 = 18
Cost = 18 + 20 + 14 + 14 = 66
*/
import java.util.*;
public class knapsack_fractonal{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int capacity = s.nextInt();
		int weight [] = new int[n];
		double value[] = new double[n]; // float enduku anntey division kosam 
		double ratio [] = new double[n];
		for(int i=0;i<n;i++){
			value [i] = s.nextInt();
			weight[i] = s.nextInt();
			ratio[i] = value[i]/weight[i];
		}
		for(int i=0;i<n;i++){
			for(int j = 0;j<n-1;j++){
				if(ratio[j]<ratio[j+1]){
					// swap all 
					double  temp = ratio[j];
					ratio[j] = ratio[j+1];
					ratio[j+1] = temp;
					
					int temp1 = 	weight[j];
					weight[j] = weight[j+1];
					weight[j+1] = temp1;

					double temp2 = value[j];
					value[j] = value[j+1];
					value[j+1] = temp2;

				}
			}
		} // now all are sorted in the ratio's order 
		//lets appply the knapscak now
		double res = 0;
		for(int i=0;i<n;i++){
			if(weight[i]<=capacity){
				res += value[i];
				capacity-= weight[i];
			}
			else{
				// fraction case 
				res += ratio[i]*capacity;
				capacity -= capacity;
				//System.out.println(res);

			}
			/*if(capacity==0) { // end point  kani alsu avasram ledu 
				System.out.println(res);
				return;
			}*/

		}
		System.out.println(res);


	}
}