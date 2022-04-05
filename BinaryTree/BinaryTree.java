import java.util.Scanner;

public class BinaryTree {
    static class Node {    
        int value; 
            Node left, right;  // node for the left and right
              
            Node(int value){ 
                this.value = value; // constructor for the int tree
                left = null; 
                right = null; 
            }

        String StringValue; 
            Node (String StringValue){
                this.StringValue = StringValue; // constructor for the string tree
                right = null; 
                left = null;
        }
    }

    private Node root; // root node
    Scanner scan; // scanner

    public BinaryTree() {
        root = null; // set the root to null 
        scan = new Scanner (System.in); // calls for the scanner 
    }

    //Add function for Integer Binary Tree
    public void add(Node node, int value) {

        if (value < node.value) {
            
            if (node.left != null) {
                add(node.left, value);
            } 
            
            else {
                System.out.println();
                System.out.println("Inserted " + value + " to left of " + node.value); 

                node.left = new Node(value);
            }
        }

        else if (value > node.value) {

            if (node.right != null) {
                add(node.right, value);
            } 

            else {
                System.out.println();
                System.out.println("Inserted " + value + " to right of " + node.value);

                node.right = new Node(value);
            }
        }
    }

    int height(Node root)
    {
        // the root is null then the height of the tree will be Zero  
        if (root == null)  
           return 0;  
        else  
        {  
            /* compute  height of each subtree */  
            int lheight = height(root.left);  
            int rheight = height(root.right);  
               
            /* use the larger one */  
            // height of both the sub trees is calcualted and which one is higher is used.   
            if (lheight > rheight)  
                return(lheight+1);  
            else   
                return(rheight+1);  
        }  
    }

    public int countNode(Node root){

        //base case
        if(root==null)
            return 0;

        //recursive call to left child and right child and
        // add the result of these with 1 ( 1 for counting the root)
        return 1 + countNode(root.left) + countNode(root.right);
    }

    public boolean isIdentical(Node x, Node y)
	{
		
		if (x == null && y == null) // if null, return true
		{
			return true;
		}

		
		return (x != null && y != null) && (x.value== y.value) &&    // if non-empty and root node matches,
					isIdentical(x.left, y.left) &&					// recur for their left and right subtree
					isIdentical(x.right, y.right);
	}

    public void treePrint(Node node, int space){ // reverse pre order traversal
        if (node == null){
            return;
        }
        int count = 5; // for spacing purposes

        space += count; // addition assignment the space and the count variable
        treePrint(node.right, space);  //recurs the function with the right node
        System.out.print("\n");

        for (int i = count; i < space; i++){
            System.out.print(" "); //print blank sapce
        }
        System.out.print(node.StringValue + "\n"); // prints the value of the tree
        treePrint(node.left, space); // recurs the function with the left node

        return;
    }

    public void IntTreePrint(Node node, int space){ // reverse pre order traversal
        if (node == null){
            return;
        }
        int count = 5; // for spacing purposes

        space += count; // addition assignment the space and the count variable
        IntTreePrint(node.right, space);  //recurs the function with the right node
        System.out.print("\n");

        for (int i = count; i < space; i++){
            System.out.print(" "); //print blank sapce
        }
        System.out.print(node.value + "\n"); // prints the value of the tree
        IntTreePrint(node.left, space); // recurs the function with the left node

        return;
    }

    public void treePrinter (Node root){
        treePrint(root, 0); // calls the tree print function with the root node and set the space as 0
    }

    public void IntTreePrinter (Node root){
        IntTreePrint(root, 0); // calls the tree print function with the root node and set the space as 0
    }

    public void inOrder (Node node) { // inorder printing of the int binary tree
        if (node == null){
            return; // in cases that there's no values in the tree
        }

        inOrder(node.left); // recurs the function with the left node
        System.out.print(node.value + " ");
        inOrder(node.right); //recurs the function with the right node
    }

    public void preOrder (Node node){ // preorder printing of the int binary tree
        if (node == null){
            return; // in cases that there's no values in the tree
        }
        System.out.print(node.value + " ");
        preOrder(node.left); // recurs the function with the left node
        preOrder(node.right); //recurs the function with the right node
    }

    public void postOrder (Node node){ // postorder printing of the int binary tree
        if (node == null){
            return; // in cases that there's no values in the tree
        }
        postOrder(node.left); // recurs the function with the left node
        System.out.print(node.value + " ");
        postOrder(node.right); //recurs the function with the right node
    }

    public void strInOrder (Node node) { // inorder printing of the string binary tree
        if (node == null){
            return;
        }

        strInOrder(node.left); // recurs the function with the left node
        System.out.print(node.StringValue + " "); 
        strInOrder(node.right); //recurs the function with the right node
    }

    public void strPreOrder (Node node){ // preorder printing of the string binary tree
        if (node == null){
            return; // in cases that there's no values in the tree
        }
        System.out.print(node.StringValue + " ");
        strPreOrder(node.left); // recurs the function with the left node
        strPreOrder(node.right); //recurs the function with the right node
    }

    public void strPostOrder (Node node){ // postorder printing of the string binary tree
        if (node == null){
            return; // in cases that there's no values in the tree
        }
        strPostOrder(node.left); // recurs the function with the left node
        System.out.print(node.StringValue + " ");
        strPostOrder(node.right);//recurs the function with the right node
    }

    public Node insertNode (Node current, String value){
        if (current == null){
            return new Node (value); //For the case the there's no root. The value becomes the root
        }
        System.out.println("Choose L(left) or R(right)to insert " + value);
        String choice = scan.nextLine(); // scans user choice L or R
        switch(choice){
            case "L":
                if(current.left != null){
                    insertNode(current.left, value); //recurse the insert function if the left of the root has a value
                    break;
                }else{
                    System.out.println("Inserted " + value + " to the left of " + current.StringValue);
                    System.out.println("\n");
                    current.left = new Node(value); // makes the value the left of the root
                    break;
                }
            case "R":
                if(current.right != null){
                    insertNode(current.right, value); //recurse the insert function if the right of the root has a value
                    break;
                }
                else{
                    System.out.println("Inserted " + value + " to the right of " + current.StringValue); 
                    System.out.println("\n");
                    current.right = new Node(value); // makes the value the left of the root
                    break;
                }
            } 
        return current; // returns the current node/root
    }

    public void addNode (String value){
        root = insertNode(root, value); // calls for the root node and made the function insertNode as the source of the root
    }

      public double evaluate(Node root)
    {
        // base case: invalid input
        if (root == null) {
            return 0;
        }
 
        // the leaves of a binary expression tree are operands
        if (isLeaf(root)) {
            return Double.valueOf(root.StringValue);
        }
 
        // recursively evaluate the left and right subtree
        double x = evaluate(root.left);
        double y = evaluate(root.right);
 
        // apply the operator at the root to the values obtained in the previous step
        return process(root.StringValue, x, y);
    }

    public boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }
 
    // Function to apply an operator 'op' to values 'x' and 'y' and return the result
    public double process(String op, double x, double y)
    {
        if (op.equals("+")) { return x + y; }
        if (op.equals("-")) { return x - y; }
        if (op.equals("*")) { return x * y; }
        if (op.equals("/")) { return x / y; }
 
        return 0;
    }


    public static void main(String[] args) {
        BinaryTree last = new BinaryTree(); // object for the int binary tree implementation
        BinaryTree laster = new BinaryTree(); // object fot the string binary tree implementation

    
        int x;
        char ch;

        System.out.println("-----------Binary Search Tree Test-----------\n");   
        System.out.println("---------------------------------------------\n");   

        System.out.println("\nBinary Search Tree Options\n");
        System.out.println("1. String Binary Tree Option");
        System.out.println("2. Integer Binary Tree Option");

        System.out.println("\nEnter your choice: ");

        int TreeChoice = last.scan.nextInt(); // user input of preferred tree choice (int or string)

        boolean stringExit = true;



        switch (TreeChoice) 
        {
            case 1:
                while (stringExit) {
                System.out.println("\n---------------------------------------------"); 
            
                System.out.println("\nBinary Search Tree Options\n");
                System.out.println("1. Add a node");
                System.out.println("2. Determine the Height of the tree");
                System.out.println("3. Determine the Number of Nodes in the tree");
                System.out.println("4. Check if the created Binary Tree is identical to the cloned Binary Tree");
                System.out.println("5. Display the Binary Tree");
                System.out.println("6. Display the inOrder Traversal of the Binary Tree");
                System.out.println("7. Display the preOrder Traversal of the Binary Tree");
                System.out.println("8. Display the postOrder Traversal of the Binary Tree");
                System.out.println("9. Evaluate the Arithmetic Expression of the Binary Tree");
                System.out.println("10. Exit");

                BinaryTree strClone = new BinaryTree();  // clone binary tree for the string binary tree
                    strClone.root = new Node ("*");
                    strClone.root.right = new Node ("+");
                    strClone.root.left = new Node ("-");

                System.out.println("\nEnter your choice: ");

                int StringChoice = last.scan.nextInt(); // user input of preffered function in string binary tree
                    
                System.out.println();

                switch (StringChoice) 
                    {
                        case 1:
                            String input; // String for user input
                            System.out.println("Enter the value to be inserted:");
                            input = laster.scan.nextLine(); // scans for value
                            laster.addNode(input); // puts the value into the add node function
                            System.out.println("\n---------------------------------------------"); 
                            break;
        
                        case 2:
                            System.out.println("Maximum height of given binary tree: " + laster.height(laster.root));
        
                            System.out.println("\n---------------------------------------------");   
                            break;
        
                        case 3:
                            System.out.println("Number of nodes of given binary tree: " + laster.countNode(laster.root));
        
                            System.out.println("\n---------------------------------------------");   
                            break;
        
                        case 4:
                            last.isIdentical(laster.root, strClone.root); // compares current tree to the clone tree
                            
                            if (last.isIdentical(laster.root, strClone.root)) {
                                System.out.print("Wow ! They are identical !");
                            }
                            else {
                                System.out.print("Sorry ! They are different !");
                            }
                            System.out.println("\n---------------------------------------------");   
                            break;
        
                        case 5:
                            laster.treePrinter(laster.root); // calls tree printer with the input main root of the tree 
                            System.out.println("\n---------------------------------------------");   
                            break;
        
                        case 6:
                            laster.strInOrder(laster.root); // calls inorder printing with the input main root of the tree 
                            System.out.println("\n---------------------------------------------");   
                            break;
        
                        case 7:
                            laster.strPreOrder(laster.root); // calls preorder printing with the input main root of the tree 
                            System.out.println("\n---------------------------------------------");   
                            break;
        
                        case 8:
                            laster.strPostOrder(laster.root); // calls postorder printing with the input main root of the tree 
                            System.out.println("\n---------------------------------------------");   
                            break;
                        case 9:
                            double result = laster.evaluate(laster.root); // calls for the evaluate function 
                            System.out.println("The solved value of the arithmetic expression is " + result);
                            break;
                        case 10:
                            System.out.println("Thank for the love and support mwa!");
                            stringExit = false; // terminates the string binary tree implementation
                            break;
                    }
                }
                break;
                
            case 2:
                System.out.println();
                System.out.println("Enter the root value: ");
                x = last.scan.nextInt(); // asks for the root of the tree
                last.root = new Node(x); // makes the root the first user input
        
                do {
        
                    System.out.println("\n---------------------------------------------"); 
        
                    System.out.println("\nBinary Search Tree Options\n");
                    System.out.println("1. Add a node");
                    System.out.println("2. Determine the Height of the tree");
                    System.out.println("3. Determine the Number of Nodes in the tree");
                    System.out.println("4. Check if the created Binary Tree is identical to the cloned Binary Tree");
                    System.out.println("5. Display the Binary Tree");
                    System.out.println("6. Display the inOrder Traversal of the Binary Tree");
                    System.out.println("7. Display the preOrder Traversal of the Binary Tree");
                    System.out.println("8. Display the postOrder Traversal of the Binary Tree");
        
                    System.out.println("\nEnter your choice: ");
        
                    BinaryTree clone = new BinaryTree();  // clone tree for the int binary tree
                    clone.root = new Node (50);
                    clone.root.right = new Node (51);
                    clone.root.left = new Node (49);
        
                    int Intchoice = last.scan.nextInt(); // user input of choice
                    
                    System.out.println();
        
                    switch (Intchoice) 
                    {
                        case 1:
                            System.out.println("Enter the value to be inserted:");
                            int userinput;
                            userinput = last.scan.nextInt();
                            last.add(last.root, userinput); // calls for the add function with the root of thr tree and user input
                            System.out.println("\n");
        
                            System.out.println("---------------------------------------------\n");   
                            break;
        
                        case 2:
                            System.out.println("Maximum height of given binary tree: " + last.height(last.root));
        
                            System.out.println("\n---------------------------------------------");   
                            break;
        
                        case 3:
                            System.out.println("Number of nodes of given binary tree: " + last.countNode(last.root));
        
                            System.out.println("\n---------------------------------------------");   
                            break;
        
                        case 4:
                            last.isIdentical(last.root, clone.root);
                            
                            if (last.isIdentical(last.root, clone.root)) { // compares the clone tree and the real tree
                                System.out.print("Wow! They are identical!");
                            }
                            else {
                                System.out.print("Sorry...They are different...");
                            }
                            System.out.println("\n---------------------------------------------");   
                            break;
        
                        case 5:
                            last.IntTreePrinter(last.root); // callse for the printing with the main root 
                            System.out.println("\n---------------------------------------------");   
                            break;
        
                        case 6:
                            last.inOrder(last.root); // calls inorder printing with the input main root of the tree 
                            System.out.println("\n---------------------------------------------");   
                            break;
        
                        case 7:
                            last.preOrder(last.root); // calls preorder printing with the input main root of the tree 
                            System.out.println("\n---------------------------------------------");   
                            break;
        
                        case 8:
                            last.postOrder(last.root); // calls postorder printing with the input main root of the tree 
                            System.out.println("\n---------------------------------------------");   
                            break;
                    }
        
                    System.out.println("\nDo you want to continue (Type y or n)"); 
                    ch = last.scan.next().charAt(0);  
        
                } while (ch == 'Y' || ch == 'y'); // the implementation will not terminate until values beside y/Y is typed
        }

    }
}
