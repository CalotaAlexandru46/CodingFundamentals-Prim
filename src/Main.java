import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Introduceti limita inferioara a intervalului:");
        int nr1=input.nextInt();
        System.out.println("Introduceti limita superioara a intervalului:");
        int nr2=input.nextInt();
        System.out.println("Introduceti decalajul dintre numere:");
        int diff=input.nextInt();

        Prime.afiseazaNrPrim(nr1, nr2, diff);



    }
}
