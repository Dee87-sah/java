import java.util.*;
public class sum {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in) ;

        int a, b, sum, product;
        a= sc.nextInt();
        b= sc.nextInt();
        sum= a+b;
        product=a*b;
        System.out.print("Sum of a & b is : ");
        System.out.println(sum);
        System.out.print("Product of a & b is : ");
        System.out.println(product);

    }
}
