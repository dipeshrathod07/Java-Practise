import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Conditional 
{


    //Input ages of sita,gita,nita and find out who is greater
    static void Ages()
    {
        int sita,gita,nita;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Ages: ");
        sita = sc.nextInt();
        gita = sc.nextInt();
        nita = sc.nextInt();

        

        if(sita > gita && sita>nita)
        {
            System.out.println("Sita is Elder one");
        }
        else if(gita>nita )
        {
            System.out.println("Gita is Elder one");
        }
        else{
            System.out.println("Nita is Elder one");
        }
    }
    //Input three Number and print all are same or all are different//
    static void SameNumber()
    {
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if(a==b && b==c)
        {
            System.out.println("Same Numbers");
        }
        else{
            System.out.println("Different Numbers");
        }

        // if(a==b)
        // {
        //     if(b == c)
        //     {
        //         System.out.println("Same Numbers");
        //     }
        //     else{
        //         System.out.println("Different Numbers");
        //     }
        // }
        // else{
        //     System.out.println("Different Numbers");
        // }
    }

    static void EvenOdd() throws Exception
    {
        Integer num ;
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number: ");
        num = Integer.valueOf(br.readLine());

        if(num % 2 == 0)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Even");
        }


    }
    public static void main(String[] args)throws Exception {
        // float per;
        // Scanner sc = new Scanner(System.in);
        // //System.out.println("Enter Your Percentage:" );
        // //per = sc.nextFloat();

        // if(per>35)
        // {
        //    // System.out.println("Pass");
        // }
        // else{
        //     //System.out.println("Fail");
        // }

       // EvenOdd();
      // SameNumber();
      //Ages();
      ArithmaticalCalculator();
    }

    //Perform Arithmatical Operation using switch case:
    static void ArithmaticalCalculator()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.println("Enter your Choice");

        switch (sc.next().charAt(0) ) {
            case '+':
                System.out.println(a+b);
                break;
            case'-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }
    }

    //Ternary Operator

    static void Ternary()
    {
        int largest = (5>3)?5:3;
        System.out.println(largest);


        String type = (5 % 2 == 0) ? "even":"odd";
        System.out.println(type);

    }
    
}
