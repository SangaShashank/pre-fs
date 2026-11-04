/*
For X-Mas, santa claus is preparing a X-Mas Tree with set of Bulbs.
The bulbs are of different voltages, and preparation of tree as follows:
	- The bulbs are arranged in level-wise, levels are numbered from 0,1,2,3..
	  so on.
	- At level-0: There will be only one bulb as root bulb.,
	- From next level onwards, we can attach atmost two bulbs, one is to left side
	  and/or the other is to right side of every bulb in previous level.
	- The empty attachements in a level are indicated with -1. 
	(for example: look in hint)
		
You will be given the X-Mas Tree root,
Your task is to findout the average of each level of the X-Mas tree, starts from level-0.

Implement the class Solution.
1.public boolean averageOfLevels(BinaryTreeNode root): returns a boolean value.

Input Format:
-------------
A single line of space separated integers, voltages of the set of bulbs.

Output Format:
--------------
Print a list of double values (averages of each level)

Sample Input-1:
---------------
3 8 4 3 5 -1 7 

Sample Output-1:
----------------
[3.0, 6.0, 5.0]

Sample Input-2:
---------------
3 8 4 3 5 7 7 

Sample Output-2:
----------------
[3.0, 6.0, 5.5]



*/
//https://claude.ai/share/15b6c738-212a-4cf7-9018-4daa8ed2c268
import java.util.*;

class BinaryTreeNode
{
	public int data; 
	public BinaryTreeNode left, right; 
	public BinaryTreeNode(int data){
		this.data = data; 
		left = null; 
		right = null; 
	}
}

class Solution 
{
	List<Integer> sum = new ArrayList<Integer>();
	List<Double> levelcount = new ArrayList<Double>(); // division kosam d
	public  ArrayList<Double>  averageOfLevels(BinaryTreeNode root){
		dfs_avg(root,0,sum,levelcount);
		ArrayList<Double> res = new ArrayList<>();
		int i=0;
		for(int x : sum){
			res.add(x/levelcount.get(i));
			i++;
		}
		return res;
	}
	public void dfs_avg(BinaryTreeNode root, int n,List <Integer> sum , List<Double> levelcount){
		if(levelcount.size()<= n){
			levelcount.add(0.0);
			sum.add(0);
		}
		sum.set(n,sum.get(n)+root.data);
		levelcount.set(n,levelcount.get(n)+1);
		if(root.left!= null && root.left.data != -1){
			dfs_avg(root.left, n+1, sum, levelcount);
		}
		if(root.right!= null && root.right.data != -1){
			dfs_avg(root.right, n+1, sum, levelcount);
		}
		return;
	}


}

public class AverageOfLevels_DFS
{
	static BinaryTreeNode root;
	void insert(BinaryTreeNode temp, int key)
    { 
        if (temp == null) 
		{
            temp = new BinaryTreeNode(key);
            return;
        }
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(temp);
 
        // Do level order traversal until we find an empty place.
        while (!q.isEmpty()) {
            temp = q.remove();
 
            if (temp.left == null) {
                temp.left = new BinaryTreeNode(key);
                break;
            }
            else
                q.add(temp.left);
 
            if (temp.right == null) {
                temp.right = new BinaryTreeNode(key);
                break;
            }
            else
                q.add(temp.right);
        }
    }

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		AverageOfLevels_DFS ln=new AverageOfLevels_DFS();
		Solution sol= new Solution();
		
		String str[]=sc.nextLine().split(" ");
		root=new BinaryTreeNode(Integer.parseInt(str[0]));
		for(int i=1; i<str.length; i++)
			ln.insert(root,Integer.parseInt(str[i]));

		System.out.println(sol.averageOfLevels(root));
	}
}
