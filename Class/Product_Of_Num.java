
package Class;
import java.util.Scanner;


class Sum_Of_Num 
{
   
    public void Assign(Mathematics Math)
    {
        System.out.println("Values Assigned");
        // 
        System.out.println(Math.Sum());
        // System.out.println(Math.Product());
        
    }
}

class Product_Of_Num extends Sum_Of_Num 
{
   
    public static void main (String args[])
    {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        Mathematics Math = new Mathematics(num1,num2);
        
        Product_Of_Num P = new Product_Of_Num();
        P.Assign(Math);
        System.out.println(Math.Product());
        sc.close();
    }

};

 class Mathematics 
 {
    int a,b;
    Mathematics(int x, int y)
    {
       a=x;
       b=y;
    }
   public int Sum()
   {
       return a+b;
   }
   public int Product()
   {
       return a*b;
   }
}