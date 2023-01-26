import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        int key = 6;
        String encryptedMessage = encrypt(key);
        decrypt(encryptedMessage, key);
    }

    public static String encrypt(int key){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] charArray = text.toCharArray();
        String output = "";
        System.out.println("The encrypted message is: ");
        for (char c : charArray) {
            c += key;
            System.out.print(c);
            output += c;
        }
        System.out.println();
        return output;
    }

    public static void decrypt(String text, int key){
        char[] charArray = text.toCharArray();
        System.out.println("The original message is: ");
        for (char c : charArray) {
            c -= key;
            System.out.print(c);
        }
    }

}
