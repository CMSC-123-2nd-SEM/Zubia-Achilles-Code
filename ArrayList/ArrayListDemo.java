import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
		ArrayList arr = new ArrayList();	//create and initialize variables
	
        int option;

        //do loop function so the option will repeat
        do {

            //initialize the option function
            arr.showOptions();

            //asks the user for  an option number
            Scanner opt = new Scanner(System.in);
            option = opt.nextInt();

            System.out.println();

            switch (option) {

                //Add String Elements into the array, it uses the add function
                case 1:
                System.out.println("Enter name: ");
                Scanner scan = new Scanner(System.in);
                String name = scan.next();
                arr.add(name);
                System.out.println("Name successfully added!");
                System.out.println();
                break;

                //Finds the element at a given index. It uses the GetElementAtIndex function.
                case 2:
                System.out.println("Enter index number: ");
                Scanner number = new Scanner(System.in);
                int input = number.nextInt();
                arr.GetElementAtIndex(input);
                break;

                //It asks the user for a name and will check if the element exists in the array or not. It uses the find function.
                case 3:
                System.out.println("Enter name: ");
                Scanner check = new Scanner(System.in);
                String contain = check.nextLine();
                arr.Find(contain);
                break;

                //Prints the size of the array. Uses the size function.
                case 4:
                System.out.println("Array size: "+ arr.Size());
                break;

                //Check the contents of the array.
                case 5:
                System.out.println("Elements of array: ");	//for loop prints out the contents of the array
                for (int i = 0; i < arr.Size(); i++) {
                    System.out.print(arr.Array[i] + " ");
                }
                break;

                //Prints the capacity of the array. Uses the capacity function
                case 6:
                System.out.println("Cap size: "+arr.Capacity());
                break;

                //Ends the program. Uses the exit function.
                case 7:
                System.out.println("Exiting program...");
                System.exit(1);
                break;
            }
        } while (option != 7);
        
	}
    
}
