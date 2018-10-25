/*
Kevin Nguyen
Basic Java program that performs pre-order traversal iteratively.

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java JavaPreOrderTrav"
*/

//imports
import java.io.*;
import java.util.*;

//class
class JavaPreOrderTrav {
	//Global Declarations

	//main driver
	public static void main(String[] args) {
		//local Declarations

		//get tree

		//call preorder

		//output results
	}

	//call function to perform preorder traversal (iteration)
    public List<Integer> preorder(Node root) {
        //local declarations
        List<Integer> result = new ArrayList<Integer>();
        Stack<Node> myS = new Stack<Node>();
        myS.push(root);
        int i = 0;
        
        //null
        if(root == null) {
            return result;
        }
        
        //dequeue items in queue
        while(!myS.isEmpty()) {
            root = myS.pop();
            result.add(root.val);
            i = root.children.size()-1;
            //get childrens
            while(i > -1) {
                myS.push(root.children.get(i));
                i--;
            }
        }
        return result;
    }
}