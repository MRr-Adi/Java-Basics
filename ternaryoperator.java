public class ternaryoperator{

    public static void main (String args[]){
        int a = 40>30?50:60;
        System.out.println(a);
        
        //ODD or EVEN
        int number = 4;
        String type =(number%2==0)? "true":"false";
        System.out.println(type);

        //PASS or FAIL
        int marks = 51;
        String result= (marks>=33)?"PASS":"FAIL";
        System.out.println(result);

    }
    
}
