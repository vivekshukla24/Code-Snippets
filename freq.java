package Practice;
import java.util.HashMap;
import java.util.Scanner;
//Program to find the frequency of words in a sentence using HashMap
public class freq {
    public static void main(String[] args) {
        HashMap<String, Integer> frequency= new HashMap<>();
        Scanner s= new Scanner(System.in);
        String sentence= s.nextLine();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (frequency.containsKey(words[i])){
                frequency.put(words[i],frequency.get(words[i])+1);
            }
            else{
                frequency.put(words[i],1);
            }
        }
        System.out.println(frequency);
        System.out.println("The number of words - "+ words.length);
    }
}
