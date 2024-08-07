public class Recurssion {

    //Head Recursion
    static void fun1(int n)
    {
        
        if(n>0)
        {
            fun1(n-1);
            System.out.println(n);
        }
    }
    //Tail Recursion
    static void fun(int n)
    {
        if(n>0){
            System.out.println(n);
            fun(n-1);
        }
    }
   public static void main(String[] args) {
    int n = 5;int x = 5;
    fun(n);
    System.out.println();
    fun1(x);
   }
}
