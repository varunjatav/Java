import java.util.Scanner;

public class Isfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Infix = sc.nextLine();
        char arr[] = new char[Infix.length()];
        for (int i = 0; i < Infix.length(); i++) {
            arr[i] = Infix.charAt(i);
        }
        sc.close();
        Isfix obj = new Isfix();
        obj.func(arr);
    }

    public void func(char arr[]) {
        char arr2[] = new char[arr.length];
        char st[] = new char[arr.length];
        int i = 0, j = 0, t = -1;
        char exp = 'a';
        while (i < arr.length) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr2[j] = arr[i];
                j++;
            } else {
                if (t == -1) {
                    t++;
                    st[t] = arr[i];
                } else if (t > -1) {
                    if (arr[i] == '-' && st[t] == '-' || arr[i] == '-' && st[t] == '+' || arr[i] == '-' && st[t] == '*'
                            || arr[i] == '-' && st[t] == '/' || arr[i] == '-' && st[t] == '^'
                            || arr[i] == '-' && st[t] == '$' || arr[i] == '+' && st[t] == '-'
                            || arr[i] == '+' && st[t] == '+' || arr[i] == '+' && st[t] == '*'
                            || arr[i] == '+' && st[t] == '/' || arr[i] == '+' && st[t] == '^'
                            || arr[i] == '+' && st[t] == '$' || arr[i] == '/' && st[t] == '/'
                            || arr[i] == '/' && st[t] == '*' || arr[i] == '/' && st[t] == '^'
                            || arr[i] == '/' && st[t] == '$' || arr[i] == '*' && st[t] == '*'
                            || arr[i] == '*' && st[t] == '/' || arr[i] == '*' && st[t] == '^'
                            || arr[i] == '*' && st[t] == '$') {
                        exp = st[t];
                        arr2[j] = exp;
                        j++;
                        st[t] = arr[i];
                    }else if(arr[i] == ')') {
                        if(t > -1){
                            while(st[t] != '(') {
                                arr2[j] = st[t];
                                j++; 
                                t--;
                            }
                        }
                    } else {
                        t++;
                        st[t] = arr[i];
                    }
                }
            }
            i++;
        }
        if (t > -1) {
            while (t > -1) {
                arr2[j] = st[t];
                t--;
                j++;
            }
        }
        for (int k = 0; k < arr2.length; k++) {
            System.out.println("arr2 : " + arr2[k]);
        }
    }
}
