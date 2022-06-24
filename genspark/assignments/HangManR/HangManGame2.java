package genspark.assignments.HangManR;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HangManGame2 {


    public static void main(String[] args) throws IOException {
        String choiceToPlay;
        Scanner sc = new Scanner(System.in);


        System.out.println("HANGMAN");

        System.out.println("Do you want to play Hangman Y or N");
        choiceToPlay = sc.next();
        Stream<String> stream = Files.lines(Paths.get("src/main/resources/hangart1"));
        Object[] arrayList1=stream.collect(Collectors.toList()).toArray();
        int lgth=arrayList1.length;
        String n[] = new String[lgth];

        for (int j=0;j<lgth;j++) {

            n[j]=String.valueOf(arrayList1[j]);
        }
     /*   Path file = Path.of("src/main/resources/PlayerHigh");
        try {
            // Create the empty file with default permissions, etc.
            Files.createFile(file);
        } catch (FileAlreadyExistsException x) {
            System.err.format("file named %s" +
                    " already exists%n", file);
        } catch (IOException x) {
            // Some other sort of failure, such as permissions.
            System.err.format("createFile error: %s%n", x);
        }*/
        Path filePath = Path.of("src/main/resources/PlayerHigh");

        String content  = "hello world !!";

//Write bytes
       // Files.write(filePath, content.getBytes());
        //Write lines
        List<String> lines = Arrays.asList("a", "b", "c");
       // Files.write(filePath, lines, StandardCharsets.UTF_8);

        String head=n[0];//"O";
        String bod1=n[1];//"|";
        String bod2=n[2];//"\\|";
        String bod3=n[3];//"\\|/";
        String bod4=n[4];//"|";
        String legs1=n[5];//"/";
        String legs2=n[6];//"/\\";
        String top="+---+";
        String post1="    |";
        String post2="    |";
        String post3="    |";
        String base1="  ===";
        String input1=""; boolean correctword=false;int igc=0; boolean in;
        String input2=""; int y=0;
        String input3=""; String input4="";String guess=""; char guesslet=' '; char guesslet1=' ';String guessword="tortoise";String guessword1=guessword;
        while (choiceToPlay.equals("Y")) {

            System.out.println("+---+");
            System.out.println(" "+input1+  " |");
            System.out.println(" "+input2+ " |");
            System.out.println(" "+input3+ " |");
            System.out.println(" "+input4+ " |");
            System.out.println("  ===");

            System.out.println("Guess a letter");
           String word=""; AtomicInteger atomicInteger = new AtomicInteger(0);
            guesslet = sc.next().charAt(0);
            int e=0; ;int h=0;int compareOneTwo=0;int igc1=0;


            if (igc<=7) {
                y= (int) count1(guessword,guesslet);
                if (y>0)//guessword.chars().filter(hh -> hh == guesslet).count() > 0)
                     {
                    in = true;

                    // guessword = guessword.replace("" + guesslet, "");


                   // if (in == true) {

                        System.out.println("Correct Guess1");
                       // in = false;
                        // word=word+guessword.charAt(e);
                        guessword = guessword.replace("" + guesslet, "");

                        if (guessword.equals("")) {
                            correctword = true;
                            break;
                        }
                       // System.out.println("Guess a letter");
                       // guesslet = sc.next().charAt(0);

                    //}
                    in = false;
                }
                    else {
                        in=false;
                        igc++; //igc1= Integer.parseInt(IntStream.iterate(0, i -> i + 2).toString());
                        if (igc == 1) {
                            input1 = head;
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

                       // System.out.println("Guess a Letter");
                       // guesslet = sc.next().charAt(0);
                    }

                }
            else{
                break;
            }


            }


            if (correctword==true)
            {
                System.out.println("You guessed Correct");
            }
            else {
                System.out.println("You did not guess Correct");
            }
        Scanner sc1 = new Scanner(System.in);
String plname="";

        System.out.println("Enter Name");
    plname=sc1.nextLine();

        Files.write(filePath, plname.getBytes());

            System.out.println("Do you want to play Hangman again Y or N");
            choiceToPlay = sc.next();
        }
    public static long count1(String s, char ch)
    {

        return s.chars()
                .filter(c -> c == ch)
                .count();
    }


    }


