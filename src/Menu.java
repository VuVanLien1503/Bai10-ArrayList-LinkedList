import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Node{
    int value;
    Node next;
}
public class Menu {

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("0. EXit");
            System.out.println("Enter Choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("case1:");
                    break;
                case 2:
                    System.out.println("case2:");
                    break;
            }
        } while (choice != 0);
    }
}
