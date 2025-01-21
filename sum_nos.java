import java.util.*;
public class sum_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i =1;
        int sum = 0;
        
        while(i<=a){
            System.out.println(i);
            
            sum=sum +i;
            i++;
            
        }
        System.out.println(sum);
        

    }
    
}
