import java.util.Scanner;

class Password {
    static char arr[] = new char[4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Password obj = new Password();
        obj.convertToArray(word);
        obj.convertToString(arr, word);
        sc.close();
    }

    public void convertToArray(String word) {
        for (int i = 0; i < word.length(); i++) {
            arr[i] = word.charAt(i);
        }
    }

    public void convertToString(char arr[], String word) {
        String str = "";
        char ch = 'a';
        while (str.compareTo(word) != 0) {
            
            int i = 0, j = 1;
            while (j < arr.length) {
                str = "";
                ch = arr[i];
                arr[i] = arr[j];
                arr[j] = ch;
                for (int k = 0; k < arr.length; k++) {
                    str += arr[k];
                }
                System.out.println("str: " + str);
                i++;
                j++;
            }
        }
    }
}