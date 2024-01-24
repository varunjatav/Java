import java.util.Scanner;

class InputRes {
     static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        int q []  = new int [5] ;
        int f = -1;
        int n = q.length-1;
        int r = -1;
        int choice = 1;

        
        char choice2 = 'a';
        do{
            System.out.println("1 - Remove form front 2 - Remove from back 3 - Insert from front 4 - Insert from back 5 - exit");
            System.out.println("press button from 1 to 5");
            choice = sc.nextInt();
            if(choice == 1){
                if(r==-1)
                {
                    System.out.println("Queue is empty");
                }
                else 
                {
                    if(f<r)
                    {
                        System.out.println(q[f] + " : is deleted");
                        f++;
                    }
                    else if(f==r)
                    {
                         System.out.println(q[f] + " : is deleted");
                         f=-1;
                         r=-1;
                    }
                }
            }else if (choice == 2){
                if(r==-1){
                    System.out.println("Queue is empty");
                }else{
                    if(r>f)
                    {
                         System.out.println(q[r] + " : is deleted");
                        r--;
                    }
                     else if(r==f)
                    {
                         System.out.println(q[r] + " : is deleted");
                         f=-1;
                         r=-1;
                    }
                }
            }else if (choice == 3)
            {
                if(f<=0)
                {
                    System.out.println("No space in front");
                }
                else{
                     System.out.println("Insert a number in front of queue");
                     f--;
                     q[f] =  sc.nextInt();
                     System.out.println(q[f]+ " is inserted in front of queue");
                }
            }
            else if(choice == 4)
            {
                if(r==n)
                {
                    System.out.println("No space at back");
                }
                else
                {
                    if(f==-1){
                        f=0;
                    }
                     System.out.println("Insert a number at back of queue");
                     r++;
                     q[r] = sc.nextInt();
                     System.out.println(q[r]+ " is inserted at back of queue");
                }
            }
            else if(choice == 5)
            {
                System.exit(choice);
            }

            System.out.println("Do you want another choice y/Y?");
            choice2 = sc.next().charAt(0);
        }while(choice2 == 'y' || choice2 == 'Y');
    }
}