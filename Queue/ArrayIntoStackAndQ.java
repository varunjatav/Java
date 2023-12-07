import java.util.Scanner;

public class ArrayIntoStackAndQ {

    public static void main(String[] args) {

        int arr[] = new int[10];
        int stack[] = new int[arr.length];
        int Q[] = new int[arr.length];
        int Top = -1;
        int F = -1;
        int R = -1;
        int c = 0;
        int max = -1;
        int min = 999;
        int pos1 = -1;
        int pos2 = -1;
        Scanner Obj = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {

            System.out.println("Enter in Array " + i);
            arr[i] = Obj.nextInt();
        }
        Obj.close();
        System.out.println("----------------------------------------------------------");
        while (c < arr.length) {
            min = 999;
            max = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    if (min > arr[i] && arr[i] < 999) {
                        min = arr[i];
                        pos1 = i;
                    }
                } else if (arr[i] % 2 != 0) {
                    if (max < arr[i] && arr[i] > -1 && arr[i] < 999) {
                        max = arr[i];
                        pos2 = i;
                    }
                }
            }
            if (min != 999) {
                Top++;
                stack[Top] = min;
                arr[pos1] = 999;
            }
            if (max != -1) {
                if (F == -1) {
                    F = 0;
                }
                R++;
                Q[R] = max;
                arr[pos2] = -1;
            }
             c++;
        }
        while(F < Q.length){
            System.out.println("Q :" + Q[F]);
            F++;
        }
         while(Top >= 0){
            System.out.println("Stack :" + stack[Top]);
            Top--;
        }
    }

}
