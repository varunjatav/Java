import java.util.Scanner;

public class ArrayIntoStackAndQ {

    public static void main(String[] args) {

        int arr[] = new int[20];
        int stack[] = new int[arr.length];
        int Q[] = new int[arr.length];
        int Top = -1;
        int F = -1;
        int R = -1;
        int c = 0, c1 = 0, c2 = 0;
        int max = 0;
        int min = 0;
        int pos1 = -1;
        int pos2 = -1;
        Scanner Obj = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {

            System.out.println("Enter in Array " + i);
            arr[i] = Obj.nextInt();
        }
        Obj.close();
        int i = 0;
        while (i < arr.length) {
            if (arr[i] % 2 == 0) {
                min = arr[i];
                c1 = 1;
            } else if (arr[i] % 2 != 1) {
                max = arr[i];
                c2 = 1;
            }
            if (c1 == 1 && c2 == 1) {
                break;
            }
        }

        while (c < arr.length) {
            int j = 0;
            while (j < arr.length) {
                if (arr[j] % 2 == 0) {
                    if (min > arr[j] && arr[j] >= 0) {
                        min = arr[j];
                        pos1 = j;
                    }
                } else if (arr[j] % 2 != 0) {
                    if (max < arr[j] && arr[j] >= 0) {
                        max = arr[j];
                        pos2 = j;
                    }
                }
                j++;
            }
            if (min > 0) {
                Top++;
                stack[Top] = min;
                arr[pos1] = -1;
            }
            if (max > 0) {
                if (F == -1) {
                    F = 0;
                }
                R++;
                Q[R] = max;
                arr[pos2] = -1;
            }
        }

        System.out.println("Stack");
        for (int j = 0; j < stack.length; j++) {
            System.out.println(stack[j]);
        }
        System.out.println("Queue");
        for (int j = 0; j < stack.length; j++) {
            System.out.println(Q[j]);
        }
    }
}
