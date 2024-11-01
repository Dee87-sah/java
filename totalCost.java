import java.util.*;
public class totalCost {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the cost of Pen : ");
    int pen= sc.nextInt();

    System.out.print("Enter the cost of Pencil : ");
    int pencil = sc.nextInt();

    System.out.print("Enter the cost of Eraser : ");
    int eraser= sc.nextInt();

    float tc= pen+pencil+eraser;

    float tcg= tc+ tc/100*18;

    System.out.println(tcg);
    int $=5;
    System.out.println($);
    
  }  
}
