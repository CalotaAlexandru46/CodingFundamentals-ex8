import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numar= input.nextInt();
        for(int i=1; i<=numar-10; i++){
            if(prim(i)&&prim(i+10)){
                System.out.println(i+", "+(i+10));
            }
        }

    }

    public static boolean prim(int nr){
        for(int i=2; i<nr/2; i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;

    }
}
