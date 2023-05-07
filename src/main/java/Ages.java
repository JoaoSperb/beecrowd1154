import java.util.Scanner;

public class Ages {
    public static void main(String args[]){
        int somatorio = 0;
        int index = 0;
        int a=0;
        Scanner in = new Scanner(System.in);

        for(int i = 0;a>=0;i++){
            a = in.nextInt();
            if(a>0) {
                somatorio += a;
                index++;
            }
        }

        double media = somatorio/index;
        System.out.printf("%.2f",media);
    }
}
