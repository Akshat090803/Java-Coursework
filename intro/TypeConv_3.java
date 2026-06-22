class TypeConv_3{

  public static void main (String args[]){
   
   byte a =12;

   int n1 = a; //implicit type Casting


   int num2 = 23;
   byte b = (byte)num2; //explicit Casting
                         //23 is in range of byte so b will have 23 stored

   int num3 = 257;
   byte cd = (byte)num3; //explicit Casting
                        //number 257 is not in the range of byte (-128 to 127)
                        //so 257 will be modulus with 256 and remainidr gets stored
                        //i.e 257%256 = 1;


   System.out.println(n1); //12
   System.out.println(b); //23
   System.out.println(cd); //1

  }
}


// Type Casting
// !Implicit Casting (Small → Large)
// int a = 10;
// double b = a;
//! Explicit Casting (Large → Small)
// double x = 9.8;
// int y = (int)x;

// Output:

// 9
