import java.util.Scanner;
public class binaryToDecimal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Inserisci una stringa binaria: ");
        String binaryString = scanner.nextLine();

        int decimalValue = 0;
        //int decimalValue = binaryToDecimal (binaryString);

        System.out.println("Valore decimale: " + decimalValue);
        scanner.close();
    }
}
