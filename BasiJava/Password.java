import java.util.Scanner;

public class Password {

        public static boolean checkPassword(String password) {

            boolean numero_check = false;
            boolean maiuscola_check = false;
            
            if (password.length() < 8) {
                return false;
            }

            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    numero_check = true;
                } else if (Character.isUpperCase(password.charAt(i))) {
                    maiuscola_check = true;
                }
    
                
                if (numero_check && maiuscola_check) {
                    return true;
                }
            }
    
            return false;
        }    

        public static void main(String[] args) {
            
            Scanner in = new Scanner(System.in);
            System.out.println("Inserisci la password: ");
            String password = in.nextLine();
    
            if (checkPassword(password)) {
                System.out.println("La password è valida.");
            } else {
                System.out.println("La password non è valida.");
            }

        }
    
}
