import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //Initialise
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";
        char shift_alphabet;
        int shift_amount,position, shift;
        String encoded = "";
        String encoded_text = "";
        System.out.println("Hi welcome to encoder");

        // Scan Messsage
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your message: ");
        String plain_text = input.nextLine().toUpperCase();
        System.out.println(plain_text);

        //Finding Shift amount
        shift_alphabet = plain_text.charAt(0);
        shift_amount = (alphabet.indexOf(shift_alphabet));

        //Loop to get new message 
        for (int i=1;i<plain_text.length();i++){
            // System.out.println((i + shift_amount)%44);
            position = alphabet.indexOf(plain_text.substring(i,i+1));
            shift = (position - shift_amount);
            //if movement = negative
            if (shift < 0){
                shift = 44 + shift;
            }
            
            if (alphabet.indexOf(plain_text.substring(i,i+1)) != -1 ){
                // encoded += alphabet.charAt((position - shift)%44);
                encoded += alphabet.charAt(shift);
            }
            else{
                encoded += plain_text.substring(i, i+1);
            }
            
        }
        encoded_text += shift_alphabet + encoded;
        System.out.println(encoded_text);
            

        
    }
}
