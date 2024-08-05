public class ItrativePattern {
    static void pattern1()
    {
        for(int i = 1 ; i <= 5 ; i++)
        {
            for(int j = 1 ; j <= 5 ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            /*
                   * * * * *
                   * * * * *
                   * * * * *
                   * * * * *
                   * * * * *
            */
        }
    }

    static void pattern2()
    {
        // for(int i = 1 ; i <= 5 ; i++)
        // {
        //     for(int j = 1 ; j <= i ; j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for(int i = 1 ; i <= 5 ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }  
        
        /*
                1 
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
         */
    }

    static void pattern3()
    {
        // for(int i = 5; i > 0 ; i--)
        // {
        //     for(int j = 1; j<= i ; j++)
        //     {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }  
        /*
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
         */

         for(int i = 1; i <= 5; i++)
         {
             for(int j = i; j<=5 ; j++)
             {
                 System.out.print(j+" ");
             }
             System.out.println();
         }  

         /*
            1 2 3 4 5 
            2 3 4 5
            3 4 5
            4 5
            5
          */

          for(int i = 1; i <= 5 ; i++)
          {
            for(int j= 5 ; j >= i ; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
          }
          /*
                5 4 3 2 1
                5 4 3 2
                5 4 3
                5 4
                5
           */

           for(int i = 5 ; i > 0 ; i--)
           {
            for(int j = 5 ; j >= i ; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
           }


           /* 
            5
            5 4
            5 4 3
            5 4 3 2
            5 4 3 2 1
            */

            for(int i = 5 ; i > 0 ; i--)
           {
            for(int j = i ; j > 0; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
           }

           /*
                5 4 3 2 1
                4 3 2 1
                3 2 1
                2 1
                1
            */

            for(int i = 5 ; i > 0 ; i--)
            {
                for(int j = i; j<=5; j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();


            }
            /*
                5
                4 5
                3 4 5
                2 3 4 5
                1 2 3 4 5
             */

    }

    static void pattern4()
    {
        Integer x = 1;
        for(int i = 1 ; i<=5; i++)
        {
            for(int j = 1 ; j<= i ; j++)
            {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
        /*
            1 
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
         */
    }

    static void pattern5()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j = 1; j<=5; j++)
            {
                if(i<= j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        /*
            *****
             ****
              ***
               **
                *
         */
        for(int i=1;i<=5;i++)
        {
            for(int j = 1; j<=5; j++)
            {
                if(i+j > 5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         
        /*
             *
            **
           ***
          ****
         *****
         */
    }
    
    static void pattern6()
    {
         for(int i = 1 ; i <= 5; i++)
         {
            for(int j = 5 ; j>i ; j--)
            {
                    System.out.print(" ");
            }
            for(int k = 1; k <= (2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();

         }

         for(int i = 4 ; i > 0 ; i--)
         {
            for(int j = 5; j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k = 1 ; k <=(2*i-1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
         }

         /*
             
                       *
                      ***               
                     *****
                    *******
                   *********
                    *******
                     *****
                      ***
                       *

          */
    }
    
    public static void main(String[] args) {

       // pattern1();
       // pattern2();
        //  pattern3();
        //pattern4();

        //pattern5();
        pattern6();
        
    }
}
