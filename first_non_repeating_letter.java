package Practice;

import java.util.HashMap;
import java.util.Scanner;
public class first_non_repeating_letter {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        HashMap<Character, Integer> non_repeating= new HashMap<>();
        String characters=s.nextLine();
        for(char ch: characters.toCharArray()){
            if (non_repeating.containsKey(ch)){
                non_repeating.put(ch,non_repeating.get(ch)+1);
            }
            else{
                non_repeating.put(ch,1);
            }
        }
        for (HashMap.Entry<Character, Integer> entry:non_repeating.entrySet()) {
            if (entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
