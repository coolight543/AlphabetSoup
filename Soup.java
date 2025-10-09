// Kuang Miao
// This code will choose random/assigned letters or words to remove if there's letters added to string of letters, and center the company name when instructed

public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    //precondition: letters are english characters, must add the word "add " to get letters
    public void add(String word){ 
        // letters = letters + word: contactenation
        letters += word;}
        // public void no return
        // postcondition：the string cotains "bew letters is" + the word I added


    //Use Math.random() to get a random character from the letters string and return it.
    // precondition: Input must be the letters - randomLetter, it will not work if you type anything else
    public char randomLetter(){
        // make a new int, find a random place on the whole string of letters
        int randomCharacter = (int)(Math.random()* (letters.length()));
        //return the letter, a single letter, can be represented as char
        return letters.charAt(randomCharacter);
        // postcondition: the char returns a random character from the letters that typed previously in the add section
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //precondition: String company is not null, and called the method using "centered" and press enter
    public String companyCentered(){
        //create a string, choose from beginning to the midpoint of the whole string of letters, using midpoint formula
        String companyCentered  =  letters.substring(0,(letters.length()+1)/2);
        //add the company name after
        companyCentered += company;
        //add the rest of the string after the midpoint
        companyCentered += letters.substring((letters.length()+1)/2); 
        //public string return
        return companyCentered;
        //postcondition: company name is print in the middle of the string of letters typed previously
    }



    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    // Precondition: the string of letters is not null, call the command by calling "removeVowel"
    public void removeFirstVowel(){
        //Find the first vowels to replace, which are searching AEIOU && aeiou, replace with an empty string
        letters = letters.replaceFirst("[AEIOUaeiou]","");
        //public void no return, use System.out.print instead
        System.out.print(letters);
        //postcondition: The first vowel found in the string of letters will be removed
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    // precondition: num must be an integer > 0, string of letters is not null, and num < length of string, type removeSome + an integer (ex: removeSome 5) to use command
    public void removeSome(int num){
        //create an int start to find where the num start to count
        int start = (int)(Math.random()*(letters.length()-num));
        //only copy the letters not included in the num index
        letters  = letters.substring(0, start)+ letters.substring(start+num);
        //public void no return
        System.out.print(letters);
        //postcondition: string contains the letters kept
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    //precondition: String word and letters is not null, use removeWord +  word (removeWord koko) to command
    public void removeWord(String word){
        //remove the index of the word, create the integer for what to return
        int num = letters.indexOf(word); 
        //replace word only, use the num selected
        letters = letters.replace(letters.substring(num, num+word.length()),"");
        //public void no return
        System.out.print(letters);
        //postcondition: remove the word in the string from string letters if found
        }
    
}
