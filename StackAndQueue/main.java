public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    Queue q = new Queue();
    Scanner scanner = new Scanner(System.in);

        char letter;
        do {
            System.out.println("\nPress A if you want to access stack options.");
            System.out.println("Press B if you want to access queue options.");
            System.out.println("Press C if you want to exit the program.");

            letter = scanner.next().charAt(0);
            switch(letter) {
                case 'A': //Accessing all stack options
                int choice;
                do {
                    System.out.println("\nPress 1 if you want to add an integer into the stack.");
                    System.out.println("Press 2 if you want to delete the last integer you added from the stack.");
                    System.out.println("Press 3 if you want to inspect the last integer you added into the stack.");
                    System.out.println("Press 4 if you want to inspect the size of the stack.");
                    System.out.println("Press 5 if you want to return to the main menu.");

                    choice = scanner.nextInt();
                    switch(choice) {
                        case 1: //Adding elements to the stack
                        System.out.println("Enter an integer to add into the stack: ");
                        stack.push(scanner.nextInt());
                        System.out.println("The number " + stack.peek() + " has been added to the stack.");
                        break;

                        case 2: //Deleting the last element from the stack
                        try {
                            System.out.println("The number " + stack.pop() + " has been removed from the stack.");
                        } catch (Exception e) {
                            System.out.println("The stack is currently empty.");
                        }
                        break;

                        case 3: //Checking the last/top element on the stack
                        try {
                            System.out.println("The number " + stack.peek() + " is currently at the top of the stack.");
                        } catch (Exception e) {
                            System.out.println("The stack is currently empty.");
                        }
                        break;

                        case 4: //Printing the size of the stack
                        System.out.println("The current size of the stack is " + stack.getSize() + ".");
                        break;

                        case 5: //Exit function of the while loop
                        System.out.println("Returning to main menu...");
                        break;
                    }
                } while (choice < 5);
                break;
                
                case 'B': //Accessing all queue options
                int option;
                do {
                    System.out.println("\nPress 1 if you want to add an integer into the queue.");
                    System.out.println("Press 2 if you want to delete the first integer you added from the queue.");
                    System.out.println("Press 3 if you want to inspect the first integer you added into the queue.");
                    System.out.println("Press 4 if you want to return to the main menu.");

                    option = scanner.nextInt();
                    switch(option) {
                        case 1: //Adding elements to the queue
                        System.out.println("Enter an integer to add into the queue: ");
                        int key = scanner.nextInt();
                        q.enqueue(key);
                        System.out.println("The number " + q.rear.key + " has been added to the queue.");
                        break;

                        case 2: //Deleting the first element from the queue
                        try {
                            System.out.println("The number " + q.front.key + " has been removed from the queue.");
                            q.dequeue();
                        } catch (Exception e) { //Catches null elements
                            System.out.println("The queue is currently empty.");
                        }
                        break;

                        case 3: //Checking the first element on the queue
                        try {
                            System.out.println("The number " + q.front.key + " is currently at the top of the queue.");
                        } catch (Exception e) {
                            System.out.println("The queue is currently empty.");
                        }
                        break;

                        case 4: //Exit function of the while loop
                        System.out.println("Returning to main menu...");
                    }
                } while(option < 4);
                break;

                case 'C': //Ends the while loop and the program
                System.out.println("\nThank you for using our program!");
                System.out.println("Have a nice day ahead.");
                break;
            }
        } while(letter != 'C');
    
}