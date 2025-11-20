import java.util.*;

public class WordScramble {
    /**
     * @param solution current word
     * @param remaining remaining letters
     */

    public static void permutation(StringBuilder solution, StringBuilder remaining){
        // TODO

        //base case
        if(remaining.isEmpty()){
            System.out.println(solution.toString());
        }
        else{ // recursive case

            for(int i = 0; i < remaining.length(); i++) {
                // 1. make a choice
                char ch = remaining.charAt(i);
                solution.append(ch);
                remaining.deleteCharAt(i);
                // 2. explore
                permutation(solution, remaining);
                // 3. unmake a choice
                solution.deleteCharAt(solution.length()-1);
                remaining.insert(i, ch);
            }
        }
    }


    public static void main(String [] args){

        StringBuilder word = new StringBuilder("WORD");

        StringBuilder solution = new StringBuilder("");

        //Set<String> saw = new HashSet<>();
        permutation(solution, word);

    }

}

