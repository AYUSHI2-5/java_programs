import java.util.Scanner;

public class p95_table {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1;
        do{
            System.out.println(n+"x"+i+"="+i*n);
            i++;

        } while(i<=10);
    }
    
    
}
