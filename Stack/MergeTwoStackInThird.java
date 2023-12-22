import java.util.Scanner;

public class MergeTwoStackInThird {
    public static void main(String[] args) {
        int stk1[] = new int[6];
        int stk2[] = new int[8];
        int stk3[] = new int[stk1.length + stk2.length];
        int Top1 = -1, Top2 = -1, Top3 = -1;
        int stk1_count = 0;
        int min = 0, min2 = 0;
        int pos_stk1 = -1, pos_stk2 = -1;
        Scanner obj = new Scanner(System.in);
        while (Top1 < stk1.length - 1 || Top2 < stk2.length - 1) {
            if (Top1 < stk1.length - 1) {
                System.out.println("Enter in Stack1: ");
                stk1[++Top1] = obj.nextInt();
            }
            if (Top2 < stk2.length - 1) {
                System.out.println("Enter in Stack2: ");
                stk2[++Top2] = obj.nextInt();
            }
        }
        obj.close();

        System.out.println("--------------------------------------------------------------------------- ");

       // System.out.println("Stack1");
        //System.out.println(Top1);
        //System.out.println(Top2);

        while (stk1_count < stk3.length -1) {
            Top1 = stk1.length - 1;
            Top2 = stk2.length - 1;
            min = 999;
            min2 = 999;
            pos_stk1 = -1; pos_stk2 = -1;
            while (Top1 >= 0) {
                if (min > stk1[Top1] && stk1[Top1] >= 0) {
                    min = stk1[Top1];
                    pos_stk1 = Top1;
                }
                Top1--;
            }
            //System.out.println("pos_stk1 : " + pos_stk1);
            //System.out.println("min : " + min);
            while (Top2 >= 0) {
                if (min2 > stk2[Top2] && stk2[Top2] >= 0) {
                    min2 = stk2[Top2];
                    pos_stk2 = Top2;
                }
                Top2--;
            }
           // System.out.println("pos_stk2 : " + pos_stk2);
            //System.out.println("min2 : " + min2);
            
                Top3++;
                if (min < min2) {
                    stk3[Top3] = min;
                    stk1[pos_stk1] = -1;
                    System.out.println("min: " + min );
                } 
                else if (min2 < min) {
                    stk3[Top3] = min2;
                    stk2[pos_stk2] = -1;
                    System.out.println("min2: " + min2 );
                }
                else if(Top1 == 0){
                    Top3++;
                    stk3[Top3] = min2;
                }else if(Top2 == 0){
                    Top3++;
                    stk3[Top3] = min;
                }
           
            stk1_count++;
        }
        // System.out.println("stk1[pos_stk1] : " + stk1[pos_stk1]);
        // System.out.println("stk2[pos_stk2] : " + stk2[pos_stk2]);
        
        System.out.println("Stack3");
        // while (Top3 >= 0) {
        //     System.out.println(stk3[Top3]);
        //     Top3--;
        // }
        stk3[stk3.length -1] = min2;
        Top3 = stk3.length -1;
        while (Top3 >= 0) {
            System.out.println(stk3[Top3]);
            Top3--;
        }
    }

}
