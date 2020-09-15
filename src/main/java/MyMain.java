import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int last = binary.length()-1;
        int decimal = 0;
        for(int i = 0; i < binary.length(); i++ ){
            decimal += (Integer.parseInt(binary.charAt(last) + "")) * Math.pow(2, i);
            last--;
        }
        return decimal;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number in binary");
        String numb = scan.nextLine();
        System.out.println("That is equal to the decimal value: " + binaryToDecimal(numb));
        scan.close();
    }
    
}
