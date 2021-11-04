import java.util.Scanner;

public class DrunkAlcoholic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        if (1<=t && t<=100000) {
            for (int i = 0; i < t; i++) {
                int k= sc.nextInt();
                int steps=0;
                if (0<=k && k<=100000) {
                    if (k%2==0) {
                        steps=k;
                    }else{
                        steps=k+2;
                    }
                }
                System.out.println(steps);
            }
        }
    }
}
