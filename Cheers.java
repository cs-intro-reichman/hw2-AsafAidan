public class Cheers {
    public static void main(String[] args) {
        String wordToCheer = args[0].toUpperCase();
        int numOfPrints = Integer.parseInt(args[1]);
        String anLetters = "AEFHILMNORSX";
        int stringLength = wordToCheer.length();
        for (int i = 0; i < stringLength; i++) {
            char currentchar = wordToCheer.charAt(i);
            if (anLetters.indexOf(currentchar) != -1) {
                System.out.println("Give me an " + currentchar + ": " + currentchar + "!"); 
            } else {
                System.out.println("Give me a  " + currentchar + ": " + currentchar + "!");
            }
        }
        System.out.println("What does that spell?");
        for (int i = 0; i < numOfPrints; i++) {
            System.out.println(wordToCheer + "!!!");
        }
    }
}