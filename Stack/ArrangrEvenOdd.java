
import java.util.Scanner;

/**
 * ArrangrOddEven
 */
public class ArrangrEvenOdd {

    public static void main(String[] args) {
        int stack[] = new int[10];
        int Top = stack.length - 1;
        int Bottom = 0;
        int Switch;
        Scanner Obj = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Numbers into Stack");
            stack[i] = Obj.nextInt();
        }
        Obj.close();
        System.out.println("Stack Made by Input");
        for (int i = 0; i < 10; i++) {
            System.out.println(stack[i]);
        }

        while (Top > Bottom) {
            if (stack[Top] % 2 != 0 && stack[Bottom] % 2 == 0) {
                Switch = stack[Top];
                stack[Top] = stack[Bottom];
                stack[Bottom] = Switch;
                Top--;
                Bottom++;
            } else if (stack[Top] % 2 != 0 && stack[Bottom] % 2 != 0) {
                Bottom++;
            } else if (stack[Top] % 2 == 0 && stack[Bottom] % 2 == 0) {
                Top--;
            }
            // Top--;
            // Bottom++;
        }
        System.out.println("Odd at bottom Even at Top");
        for (int i = 0; i < 10; i++) {
            System.out.println(stack[i]);
        }
    }

}