package SoalLatihan;
import java.util.Scanner;
public class NO1 {
    public static void main(String[] args) {
//        Scanner userInput = new Scanner(System.in);
//        int bil;
//        System.out.println("Masukkan Bilangan");
//        bil = userInput.nextInt();
//        String hasil = (bil>0)? "Postif" : "negatif" ;
//        System.out.println(hasil);

        no15();
    }

    public static void no2(){
       int i = 9;
       int j = 0;
        for (int k = 0; k < 5; k++) {
            i += 2;
            j += 2;
            System.out.print(i+" ");
            System.out.print(j+" ");
        }
    }

    static void no3(){
        for (int i = 0; i <5 ; i++) {
            for (int j = 5; j >i ; j--) {
                if(i%2==0){
                    System.out.print("#");
                }
                else
                    System.out.print("&");
            }
            System.out.println();
        }
    }

    static void no10(){
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 1)
                System.out.print(i+" ");
            else
                System.out.print("-"+i+" ");
        }
    }

    static void no11(){
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >0; j--) {
                System.out.print(i);

            }

        }
    }

    static void no12(){
        int input;
        Scanner userInput = new Scanner(System.in);
        input = userInput.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.print(i+" ");
        }
    }
    static void no15() {
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0){

                System.out.print("*****");
            System.out.println();
            }

            else{

                System.out.print("**");
            System.out.println();
            }
        }
    }


}
