import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Itrative {

 static void Looping()
 {
    // while (condition) {
        //block of code
    // }

    /*  for (int index = 0; index < array.length; index++) {
        block of code
    }
    */

    /*
        do{
        statement
        }while(condition);
     */
 }

 static void Fibo()
 {
     int a,b,c;
    // a = 0;
    // b = 1;
    // c = 0;
    // System.out.println(a);
    // while (c < 34) {
    //     a = b;
    //     b = c;
    //     c = a+b;
    //     System.out.println(c);
               
    // }
    a = 1;
    b = 0;
    c = 1;
    System.out.println(b);
    while (c < 34) {
        c = a+b;
        System.out.println(c);
        a = b;
        b = c;
               
    }
 }

 static void Factorial()
 {
    int fact = 1;
    int factNumber = 5 ;

    while (factNumber > 0) {
        fact = fact*factNumber;
        factNumber--;
    }
    System.out.println("Factorial is: "+fact);
 }

 static void PrintGivenSeries()
 {
    int a = 1; 
    
    while(a <= 32)
    {
        System.out.println(a);
        a = a*2;
    }
 }

 static void PrimeNo()
 {
    int number , temp = 2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    number = sc.nextInt();
    
    while(number % temp != 0)
    {
        temp++;
    }
    if(number == temp)
    {
        System.out.println("Prime Number: "+number);
    }
    else{
        System.out.println("Not Prime Number");
    }
 }

 static void PrimeSeries()throws Exception
 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the numbers:");
    int start = Integer.parseInt(br.readLine());
    int end = Integer.valueOf(br.readLine());

    while(start <= end)
    {


        int x = 2;

        if(start == 1)
        {
            
        }
        else
        {
            while (start % x != 0) {
                x++;   
            }
            if(start == x)
            {
                System.out.println(start);
            }
            
        }
        start++;
        
    }
 }

 static void Factor()
 {
    int num = 180;
    int c = 2; int sum = 0;
     
    while(num != 1)
    {
        if(num % c == 0)
        {
            System.out.println(c);
            sum = sum +c;
            num = num/c;
        }
        else
        {
            c++;
        
        }
    }
    System.out.println(sum);
    if(sum == num)
    {
        System.out.println("Perfect Number is: ");//only 6 is the perfect number;
    }
 }

 static void SeprateandAddDigit()
 {
    Integer num = 185;
    int t = 0 ;
    int sum = 0 ;
    while (num != 0) {
        t = num % 10;
        sum +=t;
        System.out.println(t);
        num = num/10;
    }
    System.out.println("Sum "+sum);
    
 }

 static void ReverseDigit()
 {
    int num = 185;
    int r = 0;int t ;

    while(num != 0)
    {
        t = num%10;
        r = (r*10)+t;
        num /=10;
    }
    System.out.println(r);
 }

 static void Pallindrome()throws Exception
 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.valueOf(br.readLine());
    int temp = number;int t;int reverse = 0;
    while(number != 0)
    {
        t= number%10;
        reverse = (reverse*10)+t;
        number /=10;


    }
    number = temp;
    if(number == reverse)
    {
        System.out.println("Pallindrome Number");
    }
    else{
        System.out.println("Not a Pallindrome Number");
    }
 }

 static void ArmStrong()
 {
    Integer number = Integer.valueOf(153);
    int cubed = 0, temp ;int sum = 0;
        int temp1 = number;
    while(number != 0)
    {
        temp= number%10;
        cubed = temp*temp*temp;
        sum = sum + cubed;
        number /= 10;
    }
    number = temp1;
    if(number == sum)
    {
        System.out.println("ArmStorng Number");
    }
    else{
        System.out.println("Not ArmStrong number");
    }
 }

 public static void main(String[] args)throws Exception {
            Fibo();
         Factorial();
         PrintGivenSeries();
         PrimeNo();
        PrimeSeries();
         Factor();
        SeprateandAddDigit();
        ReverseDigit();
       Pallindrome();
      ArmStrong();
    }
}
