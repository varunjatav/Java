import java.util.Scanner;

public class Circular {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int q[] = new int[5];
        int f = -1;
        int r = -1;
        int n = q.length;
        int choice = 1;

        // Circular methods = new Circular();
        char choice2 = 'a';
        do {
            System.out.println("1-Insert 2-Delete 3-Print 4-Exit");
            System.out.println("please choose between number 1 to 4");
            choice = sc.nextInt();

            if (choice == 1) {
                // methods.insertQ(r,f,n,q);
                System.out.println("Please insert a number");
                if (r == f - 1 || f == 0 && r == n - 1) {
                    System.out.println("Queue is fuuly filled");
                } else {
                    if (f == -1) {
                        f = 0;
                        r++;
                    } else if (f >= 0 && r < n - 1) {
                        r++;
                    } else if (r == n - 1 && f > 0) {
                        r = 0;
                    } else if (f > r + 1) {
                        r++;
                    }
                    q[r] = sc.nextInt();
                    System.out.println(q[r] + " : is inserted ");
                }
            } else if (choice == 2) {
                if (f == -1) {
                    System.out.println("Quese is empty");
                } else if (f < r) {
                    System.out.println(q[f] + " : is deleted");
                    f++;
                } else if (f == r) {
                    System.out.println(q[f] + " : is deleted, Now Queue is empty");
                    f = -1;
                    r = -1;
                } else if (r < f) {
                    if (f < n - 1) {
                        System.out.println(q[f] + " : is deleted");
                        f++;
                    } else if (f == n - 1) {
                        System.out.println(q[f] + " : is deleted");
                        f = 0;
                    }
                }
            } else if (choice == 3) {
                if (f == -1) {
                    System.out.println("Quese is empty");
                } else if (f < r) {
                    while (f < r) {
                        System.out.println("element in queue is : " + q[f]);
                        f++;
                        if (f == r) {
                            System.out.println("element in queue is : " + q[f]);
                            f = -1;
                            r = -1;
                            break;
                        }
                    }

                } else if (f == r) {
                    System.out.println("element in queue is : " + q[f]);
                    f = -1;
                    r = -1;
                    break;
                } else if (r < f) {
                    while (f < n - 1) {
                        System.out.println("element in queue is : " + q[f]);
                        f++;
                    }
                    if (f == n - 1) {
                        System.out.println("element in queue is : " + q[f]);
                        f = 0;
                    }
                    while (f <= r) {
                        System.out.println("element in queue is : " + q[f]);
                        f++;
                    }
                }
            } else if (choice == 4) {
                System.exit(choice);
            }
            System.out.println("Do you want another choice y/Y?");
            choice2 = sc.next().charAt(0);

        } while (choice2 == 'y' || choice2 == 'Y');

    }

}