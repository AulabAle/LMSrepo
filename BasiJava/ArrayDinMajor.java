import java.util.Scanner;

public class ArrayDinMajor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il numero di elementi dell'array: ");
        
        int len = in.nextInt();
        
        int numArray[] = new int[len];
        
        System.out.println("Inserisci " + len + " numeri!");
        for (int i = 0; i < len; i++) {
            System.out.println("Inserisci l'elemento " + i + " dell'array: ");
            int num = in.nextInt();
            numArray[i] = num;
        }
        

        int max = numArray[0];

        for (int j = 0; j < len; j++) {
            if(numArray[j] > max){
                max = numArray[j];
            }
        }

        System.out.println("Il numero maggiore è: " + max);
    }
}
