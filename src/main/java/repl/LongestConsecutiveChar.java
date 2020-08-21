package repl;

import java.util.Hashtable;

public class LongestConsecutiveChar {
    static Hashtable<Character, Integer> longestConsecutiveChar(String s){

        Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>();
        if(s.length() == 0)
            return null;

        int max_count = 0;
        int count = 0;
        char max_char = '\0';
        char prev_char = '\0';

        for (int i=0; i< s.length(); i++ ){
            if (prev_char == s.charAt(i))
                count++;
            else
                count = 1;
            if(count > max_count){
                max_char = s.charAt(i);
                max_count = count;
            }
            prev_char = s.charAt(i);
        }hash.put(max_char, max_count);
        System.out.println(hash);
        return hash;
    }
    public static void main(String[] args){
        LongestConsecutiveChar.longestConsecutiveChar("abbccaadddeeeeff");
    }
}
