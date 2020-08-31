import java.util.Random;
import java.util.Scanner;

public class CaesarChiffre {

    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your message: ");

        String yourMsg = scanner.nextLine();
        char[] yourMsgChar = yourMsg.toCharArray();

        char[] encryptedMsgChar = new char[yourMsgChar.length];

        int offset = rnd.nextInt(26);
        System.out.println("Your offset value is: " + offset);

        for (int i = 0; i < yourMsgChar.length; i++) {

            if ((int) yourMsgChar[i] == 32) {
                encryptedMsgChar[i] = (char) 32;

            } else if (((int) yourMsgChar[i] + offset) > 122) {
                int overflow = (int) yourMsgChar[i] + offset - 122;
                encryptedMsgChar[i] = ((char) (96 + overflow));

            } else if ((int) yourMsgChar[i] <= 90 && (int) yourMsgChar[i] + offset > 90) {
                int overflow = (int) yourMsgChar[i] + offset - 90;
                encryptedMsgChar[i] = ((char) (64 + overflow));

            } else {
                encryptedMsgChar[i] = ((char) ((int) yourMsgChar[i] + offset));
            }
        }
        System.out.println(encryptedMsgChar);

    }
}

