import java.util.*;
public class Main {
    public static void main(String[] args){
  
     HashMap<Character, String> jjkCharacters = new HashMap<>();
  jjkCharacters.put('G', "Gojo- Also known as The Honored One");
  jjkCharacters.put('T', "Toji- Also known as the one who gave it all up");
  jjkCharacters.put('S', "Sukuna- Also known as the King of Curses");
  jjkCharacters.put('Y', "Yuta- Also known as The cursed child ");

Scanner  scanner = new Scanner(System.in);
System.out.println("Enter a character to find out their name in Jujutsu Kaisen: ");
char character = scanner.next().charAt(0);
      String name=jjkCharacters.get (character);
if (name == null){
  }else{
    System.out.println("I cant find the name of the character you entered");
  }
}}