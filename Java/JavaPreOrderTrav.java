/*
Kevin Nguyen
Basic Shell for Java programs.

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java JavaShell"
*/

//imports
import java.io.*;
import java.util.*;

//class
class JavaShell {
	//Global Declarations

	//main driver
	public static void main(String[] args) {
		//local Declarations
		System.out.println("HelloWorld");
	}

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