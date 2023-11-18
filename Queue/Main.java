class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome!");
        String name = "Varun";
        System.out.println(name);
        int myNum = 15;
        System.out.println(myNum);
    }
}

// This is a comment;
class UniqueElement {

    public static void main(String[] args) {
        int arr1[] = new int[] { 1, 2, 2, 4, 5, 6, 7, 8, 9, 10 };
        int count = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    count = 1;
                    // System.out.println("No unique elements");
                    break;
                }
            }
        }
        if (count == 0) {
            System.out.println("No unique elements");
        } else {
            System.out.println("unique elements are present");
        }
    }
}

class BinarySearchDigit {

    public static void main(String[] args) {
        int arr[] = new int[10];
        int num = 1056012847;
        int L = 0;
        int H = 9;
        int M;
        int c = 0;
        int search = 8;
        int i = 0;
        int x;
        int min;
        int pos;
        int a;
        while (num != 0) {
            x = num % 10;
            arr[i] = x;
            num = num / 10;
            i++;
        }

        for (int j = 0; j < 10; j++) {
            min = arr[j];
            pos = j;
            for (int k = j + 1; k < 10; k++) {
                if (min > arr[k]) {
                    pos = k;
                }
            }
            if (pos != j) {
                a = arr[pos];
                arr[pos] = arr[j];
                arr[j] = a;
            }
        }
        // for (int r = 0; r < i; r++) {
        //     System.out.println(arr[r]);
        // }
        while (L <= H) {

            M = (L + H) / 2;
            if (search < arr[M]) {
                H = M - 1;
            } else if (search > arr[M]) {
                L = M + 1;
            } else {
                System.out.println(arr[M] + " is present on position " + M);
                c++;
                break;
            }
        }
        if (c == 0) {
            System.out.println("We couldn't find the search element");
        }

    }
}

class ArrangeEvenOdd {

    public static void main (String[] args){
       int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

       int i = 0; 
       int j = 9;
       int a;
       while(i<j)
       {
        if(arr[i]%2 != 0 && arr[j]%2 == 0)
        {
           a = arr[i];
           arr[i] = arr[j];
           arr[j] = a;
           i++; 
           j--;
        }
        else if (arr[i]%2 == 0 && arr[j]%2 != 0)
        {
            j--;
        }
        else
        {
            i++;
        }
       }
    

    for(int k=0 ; k<arr.length; k++){
       System.out.println(arr[k]);
    }
}
}

