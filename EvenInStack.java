public class EvenInStack {
    public static void main(String[] args){
        int stk [] = new int[] {1,2,3,4,5,6,7,8,9,11};
        int Top = stk.length - 1;
        int c = 0;
       while (Top >= 0) {
        if(stk[Top] % 2 == 0) {
           c++;
        }
        Top--;
       }
        System.out.print(c);
    };
   
}
