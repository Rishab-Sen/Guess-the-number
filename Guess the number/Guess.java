import java.util.*;
public class Guess{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number of times you would want to play the match");
        Random rn=new Random();
        int n=sc.nextInt();int j=0;
        for (int i=1 ; i<=n ;i++){
            int ra=rn.nextInt(100)+ 1;
            System.out.println("ENter the number you guessed ");
            int g=sc.nextInt();
            while (g!=ra){
                if (g > ra)
                System.out.println("The number you guessed is bigger than actual number");
                else if (g<ra)
                System.out.println("The number you guessed is smaller than actual number");
                j=j+1;
                g=sc.nextInt();
            }
            System.out.println("The number of attempts you tried were "+j+"/nAnd your score was "+(100-j*10));
            j=0;
        }
        
    }
}