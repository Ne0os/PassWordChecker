import java.util.Scanner;

public class PasswordChecker{
    public static void main(String[] args) {
       
        boolean length = false;     //marker for right length
        boolean nums = false;       //marker for numbers
        boolean lowercase = false;  //marker for lowecase letters
        boolean uppercase = false;  //marker for uppercase letters
        boolean specials = false;   //marker for special chars

        //Get string from commandline
        System.out.println("Please enter the Password that should be checked against the NIST Standard and press ENTER");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        //Check for length is over or exactly 8 digits
       if(input.length() >= 8){
           length = true;
       }

       //Check on each char 
       for(int i = 0; i < input.length(); i++){
           char current = input.charAt(i);
           if(current >= 65 && current <= 90){      //is a uppercase Letter      
               uppercase = true;
           }
           if(current >= 97 && current <= 121){     //is a lowercase Letter
               lowercase = true;
           }
           if(current >= 48 && current <= 57){      //is a number
               nums = true;
           }
           if((current >= 33 && current <=47) || (current >= 58 && current <= 64) || (current >= 123 && current <= 126)){
               specials = true;
           }                                        //is a special char
       }

       // If everything matches the NIST Standard echo to commandline
       if(length && uppercase && lowercase && nums && specials){
           System.out.println("Your Password matches the NIST Standard");
       }
       // Else echo to commandline that it isnt
       else{
           if(!length)System.out.println("Your Password is to short (min. length 8 digits)");
           if(!uppercase)System.out.println("Your Password has no uppercase letters");
           if(!lowercase)System.out.println("Your Password has no lowercase letters");
           if(!nums)System.out.println("Your Password has no numbers");
           if(!specials)System.out.println("Your Password has no special chars");
       }
    }
}
        
       


