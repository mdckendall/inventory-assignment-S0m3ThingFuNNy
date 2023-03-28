import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    ArrayList<String[]> inve = new ArrayList<String[]>();

    while(true){
      System.out.println("Press 1 to add an item.");
      System.out.println("Press 2 to delete an item.");
      System.out.println("Press 3 to update an item.");
      System.out.println("Press 4 to show all the items.");
      System.out.println("Press 5 to quit the program.");

      String userInput = input.nextLine();
      int number = Integer.parseInt(userInput);

      if(number == 1){
        int size = 1;
        for (int i = 0; i < size; i++) {
          System.out.println("Enter the name:");
          String name = input.nextLine();

          System.out.println("Enter the serial number:");
          String serialNumber = input.nextLine();

          System.out.println("Enter the value in dollars (whole number):");
          String value = input.nextLine();

          String[] innerArray = {name, serialNumber, value};
          inve.add(innerArray); 
         }
      }

      if(number == 2){
        System.out.println("Enter the serial number of the item to delete:");
        String serialNumberToRemove = input.nextLine();

        for (int i = 0; i < inve.size(); i++) {
          if (inve.get(i)[1].equals(serialNumberToRemove)) {
            inve.remove(i);
            break; // stop looping after removing the element
          }
        }
      }

      if(number == 3){
        System.out.println("Enter the serial number of the item you want to change:");
        String serialNumberToUpdate = input.nextLine();

        boolean found = false;
        for (String[] arr : inve) {
          if (arr[1].equals(serialNumberToUpdate)) {
            System.out.println("Enter the new name:");
            String newName = input.nextLine();

            System.out.println("Enter the new value in dollars (whole number):");
            String newValue = input.nextLine();

            arr[0] = newName;
            arr[2] = newValue;
            found = true;
            break;
          }
        }
      }

      if(number == 4){
        for (String[] arr : inve) {
          for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
              System.out.print(", ");
            }
          }
          System.out.println();
        }
      }

      if (number == 5) {
        break;
      }
    }
  }
}