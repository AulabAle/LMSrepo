import java.util.Scanner;

public class Stampatello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci la frase da analizzare: ");
        
        String stringa = in.nextLine();
        
        String[] parole = stringa.split(" ");

        String inizialiConcatenate = new String();

        for (int i = 0; i < parole.length; i++) {
            char iniziale = Character.toUpperCase(parole[i].charAt(0));
            inizialiConcatenate += iniziale + ".";
        }
        
        System.out.println("Iniziali delle parole: " + inizialiConcatenate);
    }
}
