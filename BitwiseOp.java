//Bitwise Operator
public class BitwiseOp {

    static void manipulate()
    {
        byte c = (byte)(9<<4);
        c= (byte)(c|12);

        System.out.println((c&0b11110000)>>4);//It isolate the uper 4 bits and shift to the right;

        System.out.println(c&0b00001111);//0b00001111 isolates the lower 4 bits and prints upper bits;

    }

    void swaping()
     {
         int a = 9;
         int b = 12;
         
         System.out.println("Before swaping:"+a+" "+b);
         a = a^b;
         b = a^b;
         a = a^b;
         
         System.out.println("After Swaping:"+a+" "+b);
         
         
     }
     public static void main(String args[])
     {
        System.out.print("\033[2H\033[2J");
        System.out.flush();
        
         int x = 0b1010;
         int y = 0b0110;
         
         int z = x&y;  //logical and operation to be performed ;
         z = x|y;     //logical or operation to be performed ;
         z = x^y;     //XOR operation to be performed;
         
         z = x<<2;
         z = x>>1;

         manipulate();
         
          BitwiseOp m = new BitwiseOp();

         m.swaping();

         
         //System.out.println(z);
         //System.out.println(String.format("%s",Integer.toBinaryString(z)));
         
     }
}