import java.util.*;
//Kuang Miao
//9 24 2025
//This project is to create letter soup
public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Soup mySoup = new Soup();
        while (true) {
            String input = scan.nextLine();
            if (input.contains("add")) {
                mySoup.add(input.replace("add ", ""));
                System.out.println("new letters is " + mySoup.getLetters());
            } 
            
            else if (input.contains("randomLetter")) {
                System.out.println(mySoup.randomLetter());
            } 
            
            else if (input.contains("centered")) {
                System.out.println(mySoup.companyCentered());
            } 
            
            else if (input.contains("company")) {
                mySoup.setCompany(input.replace("company ", ""));
            } 
            
            else if (input.contains("removeVowel")) {
                mySoup.removeFirstVowel();
                System.out.println("new letters is " + mySoup.getLetters());
            } 
            
            else if (input.contains("removeSome")) {
                mySoup.removeSome(Integer.parseInt(input.replace("removeSome ", "")));
                System.out.println("new letters is " + mySoup.getLetters());
            } 
            
            else if (input.contains("removeWord")) {
                mySoup.removeWord(input.replace("removeWord ", ""));
                System.out.println("new letters is " + mySoup.getLetters());
            } 
            
            else if (input.contains("exit")) {
                break;
            }

            else{
                System.out.println("not a legal command please try again!");
            }
        }
        scan.close();
    }

}