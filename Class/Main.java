package Class;

import java.util.Scanner;

public class Main {
    int x,y;
    int i = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Values");
  
    Stack1 st1 = new Stack1();
    Stack2 st2 = new Stack2();
    while (i < st1.stack1.length){
        x = sc.nextInt();
        y = sc.nextInt();
        st1.input_Stack1(x);
        st2.input_Stack2(y);
    }
}



 class Stack1 {

    int stack1 [] = new int[5];
    int top = -1;

    int input_Stack1(int x) {
        return -1;
    }
}

class Stack2 {
    int stack2 [] = new int[5];
    int top2 = -1;

    int input_Stack2(int x) {
        return -1;
    }
}