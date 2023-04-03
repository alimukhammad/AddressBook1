import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Display Contact");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                System.out.println("Enter Name: ");
                String name = scanner.nextLine();
                System.out.println("Enter Phone Number: ");
                String phoneNumber = scanner.nextLine();
                System.out.println("Enter Email Address: ");
                String emailAddress = scanner.nextLine();
            }
        }
    }
}
