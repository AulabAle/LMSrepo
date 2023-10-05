import java.util.Scanner;

public class ArrayDin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il numero di elementi dell'array: ");
        
        int len = in.nextInt();
        
        int numArray[] = new int[len];

        int sommatoria = 0;
        
        System.out.println("Inserisci " + len + " numeri!");
        for (int i = 0; i < len; i++) {
            System.out.println("Inserisci l'elemento " + i + " dell'array: ");
            int num = in.nextInt();
            numArray[i] = num;
        }
        
        for (int j = 0; j < len; j++) {
            sommatoria += numArray[j];
        }

        System.out.println("La media dei numeri inseriti è: " + sommatoria/len);
    }
}
