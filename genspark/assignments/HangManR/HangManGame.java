package genspark.assignments.HangManR;

import java.util.Scanner;

public class HangManGame {

public static void main(String[] args) {
    String choiceToPlay;
    Scanner sc = new Scanner(System.in);


    System.out.println("HANGMAN");

    System.out.println("Do you want to play Hangman Y or N");
    choiceToPlay = sc.next();
    String head="O";
    String bod1="|";
    String bod2="\\|";
    String bod3="\\|/";
    String bod4="|";
    String legs1="/";
    String legs2="/\\";
    String top="+---+";
    String post1="    |";
    String post2="    |";
    String post3="    |";
    String base1="  ===";
    String input1="";
    String input2="";
    String input3=""; String input4="";String guess=""; char guesslet=' '; String guessword="tortoise";String guessword1=guessword;
    while (choiceToPlay.equals("Y")) {

        System.out.println("+---+");
        System.out.println(" "+input1+  " |");
        System.out.println(" "+input2+ " |");
        System.out.println(" "+input3+ " |");
        System.out.println(" "+input4+ " |");
        System.out.println("  ===");

        System.out.println("Guess a letter");
        boolean correctword=false; String word="";
            guesslet = sc.next().charAt(0); boolean in =false;
            int e=0; int igc=0;int h=0;int compareOneTwo=0;
          //  while(correctword==false) {

                while (igc<8) {

                    while(h<guessword.length())
                    {
                         compareOneTwo = Character.compare((Character)guesslet, guessword.charAt(h));
                        if (compareOneTwo==0)
                        {
                            in = true;
                        }
                        h++;
                    }

                        h=0;

                    if ( in == true) {
                        System.out.println("Correct Guess1");
                        in = false;
                       // word=word+guessword.charAt(e);
                        guessword=guessword.replace(""+guesslet,"" );

                        if(guessword.equals(""))
                        {
                            correctword=true; break;
                        }
                        System.out.println("Guess a letter");
                        guesslet = sc.next().charAt(0);

                    } else {
                        in=false;
                        igc++;
                        if (igc == 1) {
                            input1 = "O";
                        } else if (igc == 2) {
                            input2 = bod1;
                        } else if (igc == 3) {
                            input2 = bod2;
                        } else if (igc == 4) {
                            input2 = bod3;
                        } else if (igc == 5) {
                            input3 = bod1;
                        } else if (igc == 6) {
                            input4 = legs1;
                        } else if (igc == 7) {
                            input4 = legs2;
                        }
                        System.out.println("Letter not in word");
                        System.out.println("+---+");
                        System.out.println(" " + input1 + " |");
                        System.out.println(" " + input2 + " |");
                        System.out.println(" " + input3 + " |");
                        System.out.println(" " + input4 + " |");
                        System.out.println("  ===");

                        System.out.println("Guess a Letter");
                        guesslet = sc.next().charAt(0);
                    }

                }
igc=0;  input1="";
         input2="";
         input3="";  input4=""; guessword="tortoise";

          //  }

            if (correctword==true)
            {
                System.out.println("You guessed Correct");
            }
            else {
                System.out.println("You did not guess Correct");
            }

        System.out.println("Do you want to play Hangman again Y or N");
        choiceToPlay = sc.next();
    }


}

}
