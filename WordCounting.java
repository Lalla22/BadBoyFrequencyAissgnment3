import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 
import java.util.*;
import java.io.*;
/**
 * Counting the word freuency of the Song bad boy
 *
 * @author Lalla Sankara
 * @version 12/03/2019
 */
public class WordCounting
{
    // instance variables - replace the example below with your own
    static void countWords(String fileName, Map<String, Integer> words) throws FileNotFoundException{
        //inport scanner and song file which would be redvelvetbad.txt
        Scanner file = new Scanner(new File(fileName));
        //while loop and if esle statement to scan and count each word in file
        while (file.hasNext()){
            String word = file.next();
            Integer count = words.get(word);
            if (count != null)
                count++;
            else
                count = 1;
            words.put(word, count);
                     
        } 
        file.close();
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        //create new hashap
        Map<String, Integer> words = new HashMap<String, Integer>();
        //entering file name and putting in countWords method
        countWords("C:\\Users\\lalla\\Downloads\\redvelvetbad.txt", words);
        //print out output of words
        System.out.println(words);
    }

}

