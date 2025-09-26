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
    public void add(String word){
        letters += word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
        int randomCharacter = (int)(Math.random()* (letters.length()));
        return letters.charAt(randomCharacter);
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        String companyCentered  =  letters.substring(0,(letters.length()+1)/2);
        companyCentered += company;
        companyCentered += letters.substring((letters.length()+1)/2); 
        return companyCentered;
    }



    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        String noAs = letters.replace('a',"");
        String noEs = letters.replace('e', "");
        String noIs = letters.replace('i', "");
        String noOs = letters.replace('o', "");
        String noUs = letters.replace('u',""); 
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){

        int start = (int)(Math.random()*letters.length())-num;
        String removeSomeLetters = letters.substring(0, start)+ letters.substring(start+num);
        String letters -= removeSomeLetters;
        System.out.print(letters);

    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
    letters -= word; 
    return letters; 
        
    }
}
