class MyNumber
{
       private int data;
       public MyNumber()
       {
              data=0;
       }
       MyNumber (int data)
       {
                this.data=data;
       }
       public boolean isNegative()
       {
              if (data<0)
                 return true;
              return false;
       }
       public boolean isPositive()
       {
              if (data>0)
                 return true;
              return false;
       }
       public boolean isOdd()
       {
              if (data%2!=0)
                 return true;
              return false;
       }
       public boolean isEven()
       {
              if (data%2==0)
                 return true;
              return false;
       }
       public boolean isZero()
       {
              if (data==0)
                 return true;
              return false;
       }
       public static void main (String[] args)
       {
              int x=Integer.parseInt(args[0]);
              MyNumber m = new MyNumber(x);
              if (m.isNegative())
                 System.out.println(x+" is -ve");
              if (m.isPositive())
                 System.out.println(x+" is +ve");
              if (m.isEven())
                 System.out.println(x+" is Even");
              if (m.isOdd())
                 System.out.println(x+" is Odd");
              if (m.isZero())
                 System.out.println(x+" is zero");
       }
} 
