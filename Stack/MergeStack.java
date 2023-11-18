public class MergeStack {

    public static void main(String[] args) {
        int stk1[] = new int[] { 1, 2, 3, 4, 5 };
        int stk2[] = new int[] { 10, 20, 30, 40, 50, 60 };
        int stk3[] = new int[stk1.length + stk2.length];
        int Top1 = stk1.length - 1;
        int Top2 = stk2.length - 1;
        int Top3 = -1;

        while (Top1 > -1) {
            Top3++;
            stk3[Top3] = stk1[Top1];
            Top1--;
        }
        while (Top2 > -1) {
            Top3++;
            stk3[Top3] = stk2[Top2];
            Top2--;
        }

        for(int i = 0; i < stk3.length; i++){
            System.out.println(stk3[i]);
        }
    }

}
