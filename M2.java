package mod2;

import java.util.Scanner;

public class M2 {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    final int MAX = 10;

    String[] list = new String[MAX];
    int choice = 0;
    int count = 0;

    while (choice != 3) {

        System.out.println();
        System.out.println("Type 1 to add a new thing to your to do list.");
        System.out.println("Type 2 to print the to do list.");
        System.out.println("Type 3 to exit the program.");
        System.out.print("Select an option: ");
        choice = input.nextInt();
        

        if (choice == 1) {
            System.out.println("Keep hitting enter after to do's, if you want to stop, type 'stop'.");
            for (int i=count;i<MAX;i++) {
                list[i] = input.nextLine();
                if (list[i].equals("stop")) break;
                count++;
            }
        }

        if (choice == 2) {
            for (int index = 0;index < count; index++) {
                System.out.println(list[index]);                    
            }               
        }

    }

}
}