import java.util.Arrays;

/**
 * PigLatin
 */
public class PigLatin {
    static String convert(String word){
       // Your Code
        Character[] vowels = {'a','e','i','o','u'};
        char[] wordChars = word.toCharArray();
        String temp = word.toLowerCase();
        int firstVowelIndex = -1;
        for(int i = 0; i < wordChars.length; i++){
            Character currentChar = wordChars[i];
            boolean isVowel = Arrays.asList(vowels).contains(currentChar);
            // System.out.println(currentChar + " : " + isVowel);
            if(isVowel){
                firstVowelIndex = i;
                break;
            }
        }

        if(firstVowelIndex == 0){
           
            return word;
        }else if(firstVowelIndex > 0){
         // System.out.println(firstVowelIndex);     

            String wordVowel = word.substring(0,firstVowelIndex);
            word = word.substring(firstVowelIndex);
            
            word =  word + wordVowel +  "ay";
    
        //  System.out.println(word);     
             
        } else {
  
            return word + "ay";
        }
              
       
        return word;
    }

    public static void main(String[] args){
        System.out.println(convert("art").equals("art"));
        System.out.println(convert("vowel").equals("owelvay"));
        System.out.println(convert("nginx").equals("inxngay"));
        System.out.println(convert("hello").equals("ellohay"));
        System.out.println(convert("Dr").equals("Dray"));
    }
}