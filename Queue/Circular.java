import java.util.Scanner;

public class Circular {
    public static void main(String[] args) {
        int q[] = new int[5];
        int f = -1;
        int r = -1;
        int n = q.length;
        int choice = 1;
        Scanner sc = new Scanner(System.in);
        Circular methods = new Circular();
        char choice2 = 'a';
        do {
            System.out.println("1-Insert 2-Delete 3-Print 4-Exit");
            System.out.println("please choose between number 1 to 4");
            choice = sc.nextInt();
           
            if (choice == 1) {
                methods.insertQ();
            } else if (choice == 2) {
                methods.deleteQ();
            }
            else if (choice == 3) {
                methods.printQ();
            }
             else if (choice == 4) {
                System.exit(choice);
            }
            System.out.println("Do you want another choice y/Y?");
            choice2 = sc.next().charAt(0);
            

        } while (choice2 == 'y' || choice2 == 'Y');

    }

    public void insertQ() {
        System.out.println("1");
    }

    public void deleteQ() {
        System.out.println("2");
    }
    public void printQ() {
        System.out.println("2");
    }
}