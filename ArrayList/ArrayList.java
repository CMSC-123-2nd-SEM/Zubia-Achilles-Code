/* Achilles Joaquin S. Zubia
   John Isaac Latigay */

public class ArrayList {

    //initialize variables
    int capacity;
    int size;
    String Array[];
    String backingArray[];

    //declaring the initial array
    public ArrayList() {
        this.capacity = 0;          //setting the initial capacity of the array at 0 
        this.size = 4;              //setting the size of the array at 4
        Array = new String[size];
    }

    //add function
    void add(String newElement) {

        //setting the condition if size is equal to capacity the array size will multiply by 2
        if(size == capacity) {

            int newSize;
            newSize = size*2;

            backingArray = new String[newSize];

            for (int i = 0; i < size; i++) {
                backingArray[i] = Array[i];
            }

            Array = backingArray;
            size = newSize;

        }

        Array[capacity] = newElement; //adds the element to the array

        System.out.println();
        System.out.println("Adding Element...");
        System.out.println();

        capacity++;
    }

    //find function, this finds the element on the array if it exists
    Boolean Find(String element2Find) {
        boolean find = false;
            
        for(int i = 0; i < capacity; i++) {
            if (element2Find.equals(Array[i])) {
                System.out.println("Element is found");
                find = true;
                break;
            }
        }
        if (find == false) {
            System.out.println("Element not found");
        }
        return find;
    }

    //Get element function, this find the name of the element stored at a given index
    String GetElementAtIndex(int index) {
        if (index >= size) {
            System.out.println("Error. Index " +index+ " is not found. Please try again since index is out of bounds.");
            throw new IndexOutOfBoundsException();
        } 
        
        else {
            System.out.println("Element at index " +index+ " is "+Array[index]);
            return Array[index];
        }
    }

    int Size() {		//returns the size
		return size;
	}
	
	int Capacity() {		//returns the capacity
		return capacity;
	}
    
    // opening code
    void showOptions() {
        System.out.println("\nWelcome! Please enter the number of your choice:\n"+
                "1. Add name\n"+
                "2. Get element at index\n"+
                "3. Check if element exists\n"+
                "4. Check the size of the array\n"+
                "5. Check contents of array\n"+
                "6. Check the capacity of the array\n"+
                "7. Exit");
    }

}
