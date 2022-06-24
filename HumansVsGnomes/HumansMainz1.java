package HumansVsGnomes;

//package genspark.assignments.HumansVsGnomes;

import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HumansMainz1 {
    public HumansMainz1() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(3);
        frame.setSize(300, 300);
        JButton button = new JButton("Press");
        frame.getContentPane().add(button);
        frame.setVisible(true);
        System.out.println("Welcome to the board");
        System.out.println("Look board");
        int size = 4;
        char move = ' ';
        Goblinz s = new Goblinz();
        Humanz hl = new Humanz();
        Scanner sc = new Scanner(System.in);
        String[][] land = new String[size][size];


        Land12 gh = new Land12();

        while(gh.playGame(hl, s) != 'Y') {
        }

    }
}
