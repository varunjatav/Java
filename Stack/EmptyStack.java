import java.util.Scanner;

public class EmptyStack {

    public static void main(String[] args) {
        int stk[] = new int[10];
        int Top = -1;
        // int c = 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < stk.length; i++) {
            if (scanner.hasNextInt()) 
            {
                int a = scanner.nextInt();
                Top++;
                stk[Top] = a;
            }
            else
            {
              System.out.println("Please Enter a Valid Number");
              i--;
            }

        };
        scanner.close();

        for (int i = 0; i < stk.length; i++) {
            System.out.println(stk[i]);
        }
    };

}
