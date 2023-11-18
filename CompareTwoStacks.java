public class CompareTwoStacks {
    public static void main(String[] args) {
        int stk1[] = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int stk2[] = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        boolean flag = false;

        if (stk1.length != stk2.length) {
            System.out.println("Both are not Identical");
        } else {
            int Top = stk1.length - 1;
            while( Top >= 0) {
                if(stk1[Top] != stk2[Top]) {
                    flag = true;
                    break;
                }
            }
            if(flag == true) 
            {
                System.out.println("Both are not Identical");
            }
            else
            {
                System.out.println("Both are Identical");
            }
        }
    }
}
