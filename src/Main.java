import java.util.Scanner;


    public class Main {

        public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

        public static String encrypt(String message, int shiftKey) {
            // Doar pentru caractere lowercase.
            message = message.toLowerCase();

            // Textul codificat final.
            StringBuilder cipherText = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                // Determina caracterul in pozitia alfa.
                int charPosition = alpha.indexOf(message.charAt(i));

                // Codificarea.
                int keyVal = (shiftKey + charPosition) % 26;

                // Caracterul codificat.
                char replaceChar = alpha.charAt(keyVal);

                // Adauga caracterul codificat.
                cipherText.append(replaceChar);
            }

            // Returneaza textul codificat.
            return cipherText.toString();
        }

        //Metoda principala.
        public static void main(String[] args) {
            Scanner  sc = new Scanner(System.in);

            String message;
            System.out.print("Enter the String for Encryption: ");
            message = sc.next();

            System.out.println("\n\nEnter Shift Key or Offset: ");
            int offset = sc.nextInt();

            sc.close();

            System.out.println("\nEncrpyted msg: " + encrypt(message, offset));
        }
    }
