package Practice;

/**At least 4 characters
        At least one numeric digit
        At least one Capital letter
        Must not have space or slash (/)
        Starting character must not be a number
 **/

import java.util.Scanner;

public class Password_validate {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a= s.nextLine();
        Validate(a);
    }
    static void Validate(String pass){
        if(pass.length()<4){
            System.out.println("Invalid");
            return;
        }
        if(pass.charAt(0)>='0' && pass.charAt(0)<='9'){
            System.out.println("Invalid");
            return;
        }
        int cap=0;
        int num=0;
        for (int i = 0; i < pass.length(); i++) {
            if(pass.charAt(i)==' ' || pass.charAt(i)=='/'){
                System.out.println("Invalid");
                break;
            }
            if (pass.charAt(i)>='A' && pass.charAt(i)<='Z'){
                cap++;
            }
            else if(pass.charAt(i)>='0' && pass.charAt(i)<='9'){
                num++;
            }
        }
        if (num>0 && cap>0){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
