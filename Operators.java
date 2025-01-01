public class Operators {
    public static void main (String args[]){

        int a = 10;
        int b = 5;
        


        //Types of Operators

        //Arithmatic Operators

        System.out.println("Sum ="+ (a+b));
        System.out.println("Substract ="+ (a-b));
        System.out.println("Multiply ="+ a*b);
        System.out.println("Divide ="+ a/b);
        System.out.println("Modulo ="+ a%b); //Modulo(%) means giving remainder

        //Unary Operators
        int c;
        
        //Pre increment   (Use the below unary code only by commenting the rest unary code)
        c = ++a;
        System.out.println(a);
        System.out.println(c);

         /* //Post increment
        c = a++;
        System.out.println(a);
        System.out.println(c);

         //Pre decrement
        c = --a;
        System.out.println(a);
        System.out.println(c);


         //Post decrement
        c = a--;
        System.out.println(a--);
        
        System.out.println(c);

        */
         
        //Relational Operator
        int d = 10;


        System.out.println(a==d); //Equal to Equal

        System.out.println(a!=d);// Not Equal to 

        System.out.println(a>d);//Greater than

        System.out.println(a<d);//Smaller than

        System.out.println(a>=d);//Greater than or equal to 

        System.out.println(a<=d);//Less than or equal to 

        // Logical Operator
        int m = 6;
        int n = 7;

        System.out.println(m<n && m>= 6); //&& AND OPERATOR

        System.out.println(m==6 || n>100);//OR OPERATOR

        System.out.println(!(m==n));//! NOT OPERATOR



    //Assignment operator ( Used for fast exceqution)
    int j = 2;
    int k = 9;
    int l = 7;
    int f = 100;
    
    j+=10; //j = j + 10
    System.out.println(j);

    k-=9; //k = k-10
    System.out.println(k);

    l*=10; // l = l*10
    System.out.println(l);

    f/=10; // f = f/10
    System.out.println(f);


        

        



    


    }
    
}
