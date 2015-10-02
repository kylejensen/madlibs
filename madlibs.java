import java.io.Console;

public class MadLibs {

    public static void main(String[] args) {
      Console console = System.console();
      int age = Integer.parseInt(console.readLine("How old are you?:  "));
      if (age < 13) {
        //Exit code
        console.printf("Sorry, you must be at least 13 to use this program.\n");
        System.exit(0);
      }
      String name = console.readLine("Enter a name:  ");
      String adjective = console.readLine("Enter an adjective:  ");
      String noun;
      boolean isInvalidWord;
      do {
        noun = console.readLine("Enter a noun:  ");
        isInvalidWord = (noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("jerk"));
        if (isInvalidWord) {
          console.printf("That language is not allowed. Try again. \n\n");
        }
      } while (isInvalidWord);
      String adverb = console.readLine("Enter an adverb:  ");
      String verb = console.readLine("Enter a verb:  ");
      console.printf("%s is a %s %s. They are always %s %s.", name, adjective, noun, adverb, verb);
    }
}
