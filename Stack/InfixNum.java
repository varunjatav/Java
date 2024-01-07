import java.util.Scanner;

public class InfixNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        char array[] = new char[str.length()];
        int array2[] = new int[str.length()];
        char stack[] = new char[str.length()];
        char exp = 'a';
        int number = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);
        }
        int i = 0, j = 0, top = -1;
        while (i < array.length) {
            if (array[i] != '(' && array[i] != '*' && array[i] != ')' && array[i] != '+' && array[i] != '-'
                    && array[i] != '^' && array[i] != '$'&& array[i] != '/') {
                number = Character.getNumericValue(array[i]);
                // System.out.println("number : " + number);
                array2[j] = number;
                j++;
            } else {
                if (top == -1) {
                    top++;
                    stack[top] = array[i];
                } else if (top > -1) {
                    if (array[i] == '-' && stack[top] == '-' || array[i] == '-' && stack[top] == '+'
                            || array[i] == '-' && stack[top] == '*'
                            || array[i] == '-' && stack[top] == '/' || array[i] == '-' && stack[top] == '^'
                            || array[i] == '-' && stack[top] == '$' || array[i] == '+' && stack[top] == '-'
                            || array[i] == '+' && stack[top] == '+' || array[i] == '+' && stack[top] == '*'
                            || array[i] == '+' && stack[top] == '/' || array[i] == '+' && stack[top] == '^'
                            || array[i] == '+' && stack[top] == '$' || array[i] == '/' && stack[top] == '/'
                            || array[i] == '/' && stack[top] == '*' || array[i] == '/' && stack[top] == '^'
                            || array[i] == '/' && stack[top] == '$' || array[i] == '*' && stack[top] == '*'
                            || array[i] == '*' && stack[top] == '/' || array[i] == '*' && stack[top] == '^'
                            || array[i] == '*' && stack[top] == '$') {
                        exp = stack[top];
                        stack[top] = array[i];
                        if (exp == '*') {
                            num = array2[j - 2] * array2[j - 1];
                            j -= 2;
                            array2[j] = num;
                            j++;
                        } else if (exp == '-') {
                            num = array2[j - 2] - array2[j - 1];
                            j -= 2;
                            array2[j] = num;
                            j++;
                        } else if (exp == '+') {
                            num = array2[j - 2] + array2[j - 1];
                            j -= 2;
                            array2[j] = num;
                            j++;
                        } else if (exp == '/') {
                            num = array2[j - 2] / array2[j - 1];
                            j -= 2;
                            array2[j] = num;
                            j++;
                        } else if (exp == '^') {
                            int pow = array2[j - 1];
                            int mult = 1;
                            while (pow > 0) {
                                mult *= array2[j - 2];
                                pow--;
                            }
                            num = mult;
                            j -= 2;
                            array2[j] = num;
                            j++;
                        } else if (exp == '$') {
                            int pow = array2[j - 1];
                            int mult = 1;
                            while (pow > 0) {
                                mult *= array2[j - 2];
                                pow--;
                            }
                            num = mult;
                            j -= 2;
                            array2[j] = num;
                            j++;
                        }
                        // System.out.println("num : " + num);
                    } else if (array[i] == ')') {
                        while (stack[top] != '(') {
                            exp = stack[top];
                            if (exp == '*') {
                                num = array2[j - 2] * array2[j - 1];
                                j -= 2;
                                array2[j] = num;
                                j++;
                            } else if (exp == '-') {
                                num = array2[j - 2] - array2[j - 1];
                                j -= 2;
                                array2[j] = num;
                                j++;
                            } else if (exp == '+') {
                                num = array2[j - 2] + array2[j - 1];
                                j -= 2;
                                array2[j] = num;
                                j++;
                            } else if (exp == '/') {
                                num = array2[j - 2] / array2[j - 1];
                                j -= 2;
                                array2[j] = num;
                                j++;
                            } else if (exp == '^') {
                                int pow = array2[j - 1];
                                int mult = 1;
                                while (pow > 0) {
                                    mult *= array2[j - 2];
                                    pow--;
                                }
                                num = mult;
                                j -= 2;
                                array2[j] = num;
                                j++;
                            } else if (exp == '$') {
                                int pow = array2[j - 1];
                                int mult = 1;
                                while (pow > 0) {
                                    mult *= array2[j - 2];
                                    pow--;
                                }
                                num = mult;
                                j -= 2;
                                array2[j] = num;
                                j++;
                            }
                            // System.out.println("num2 : " + num);
                            top--;
                        }
                        top--;
                    } else {
                        top++;
                        stack[top] = array[i];
                    }

                }
            }
            i++;
        }
        if (top > -1) {
            while (top > -1) {
                exp = stack[top];
                if (exp == '*') {
                    num = array2[j - 2] * array2[j - 1];
                    j -= 2;
                    array2[j] = num;
                    j++;
                } else if (exp == '-') {
                    num = array2[j - 2] - array2[j - 1];
                    j -= 2;
                    array2[j] = num;
                    j++;
                } else if (exp == '+') {
                    num = array2[j - 2] + array2[j - 1];
                    j -= 2;
                    array2[j] = num;
                    j++;
                } else if (exp == '/') {
                    num = array2[j - 2] / array2[j - 1];
                    j -= 2;
                    array2[j] = num;
                    j++;
                } else if (exp == '^') {
                    int pow = array2[j - 1];
                    System.out.println(pow);
                    int mult = 1;
                    while (pow > 0) {
                        mult *= array2[j - 2];
                        pow--;
                    }
                    num = mult;
                    j -= 2;
                    array2[j] = num;
                    j++;
                } else if (exp == '$') {
                    int pow = array2[j - 1];
                    int mult = 1;
                    while (pow > 0) {
                        mult *= array2[j - 2];
                        pow--;
                    }
                    num = mult;
                    j -= 2;
                    array2[j] = num;
                    j++;
                }
                // System.out.println("num3 : " + num);
                top--;
            }
        }
        for (int k = 0; k < array2.length; k++) {
            System.out.println("arr2 : " + array2[k]);
        }
       
    }

    
}
