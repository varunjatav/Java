import java.util.Scanner;

class Password {
    static Password obj = new Password();
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    char arr[] = new char[word.length()];
    char ch = 'a';
    String newWord = "";
    for(int i=0; i< arr.length; i++) {
        arr[i] = word.charAt(i);
    }
    sc.close();
   
    for(int i=0; i<arr.length;i++){
        newWord = "";
        ch = arr[i];
        newWord += ch;
        for(int j=0; j<arr.length; j++){
            if(ch == arr[j]){
                continue;
            }
            else{
                newWord += arr[j];
            }
        }
        // System.out.println("newWord: " + newWord + " " + "Char" + ch);
        obj.combinator(newWord,ch,arr);
    }
  }
  

  public void combinator(String nw, char c, char[] arr){
    String str = "";
    char newCh = 'a';
    // System.out.println("Str outer while : "+ str );
    String combineStr = "";
    if(combineStr != nw){
        combineStr = obj.fun(str,newCh, arr,c);
        System.out.println(combineStr);
    }
    
  }


  public String fun(String str, char newCh, char[] arr,char c){
    for(int i = 0; i< arr.length - 1; i++){
            if(arr[i] == c){
                continue;
            }
            else{
                newCh = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = newCh;
                str="";
                for(int j = 0; j < arr.length; j++){
                    str += arr[j];
                }
                return str;
            }
        }
    return str;
  }
}