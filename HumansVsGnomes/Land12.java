package HumansVsGnomes;

import java.util.Scanner;

public class Land12 {




    public char playGame(Humanz p , Goblinz g)
    {


        System.out.println("Welcome to the board");

        System.out.println("Look board");

        int size=4; char move=' ';
        Goblinz s= new Goblinz();
        Humanz hl = new Humanz();
//move=s.move();
        String choiceToPlay;
        Scanner sc = new Scanner(System.in);

        String land[][]=new String[size][size];

        for(int h=0;h<size;h++)
        {System.out.println();
            for(int o=0;o<size;o++)
            {
                land[h][o]="|_|";
                System.out.print(land[h][o]);
            }
        }
        String player ="|P|"; String space="|_|";
        String goblin="|G|";
        int mvpupdwn=2; int mvpltrt=0;

        int mvgnupdwn=1; int mvgnltrt=1;
        land[mvpupdwn][mvpltrt]=player;
        land[mvgnupdwn][mvgnltrt]=goblin;
        for(int h=0;h<size;h++)
        {System.out.println();
            for(int o=0;o<size;o++)
            {

                System.out.print(land[h][o]);
            }
        }
        char quit='N'; char plmove=' ';
        while (quit!='Y')
        {

            System.out.println("");
            System.out.println("Move player U up D down L left R right ");
            plmove=sc.next().charAt(0);move=s.move();
            if (plmove=='U')
            {// land[mvpupdwn][mvpltrt]=space;
                mvpupdwn--;
                if(mvpupdwn<0)
                {
                    mvpupdwn++;
                    System.out.println("You can't move Up");
                }
                else{mvpupdwn++;
                    land[mvpupdwn][mvpltrt]=space;
                    mvpupdwn--;
                    land[mvpupdwn][mvpltrt]=player;}
            }
            else if (plmove=='D')
            {
                //land[mvpupdwn][mvpltrt]=space;
                mvpupdwn++;
                if(mvpupdwn>=size)
                {
                    mvpupdwn--;
                    System.out.println("You can't move Down");
                }
                else{  mvpupdwn--;
                    land[mvpupdwn][mvpltrt]=space;
                    mvpupdwn++;
                    land[mvpupdwn][mvpltrt]=player;}
            }
            else if (plmove=='L')
            {

                mvpltrt--;
                if (mvpltrt<0)
                {
                    mvpltrt++;
                    System.out.println("You can't move Left");
                }
                else{ mvpltrt++;
                    land[mvpupdwn][mvpltrt]=space;
                    mvpltrt--;
                    land[mvpupdwn][mvpltrt]=player;}
            }
            else if (plmove=='R')
            {
                // land[mvpupdwn][mvpltrt]=space;
                mvpltrt++;
                if (mvpltrt>=size)
                {
                    mvpltrt--;
                    System.out.println("You can't move Right");
                }
                else{mvpltrt--;
                    land[mvpupdwn][mvpltrt]=space;
                    mvpltrt++;
                    land[mvpupdwn][mvpltrt]=player;}
            }
            //land[mvpupdwn][mvpltrt]=player;

            System.out.println("Move "+move);
            if (move=='U')
            { //land[mvgnupdwn][mvgnltrt]=space;
                mvgnupdwn--;
                if(mvgnupdwn<0)
                {
                    mvgnupdwn++;
                    System.out.println("Goblin can't move Up");
                }
                else{ mvgnupdwn++;
                    land[mvgnupdwn][mvgnltrt]=space;
                    mvgnupdwn--;
                    land[mvgnupdwn][mvgnltrt]=goblin;}
            }
            else if (move=='D')
            {
                // land[mvgnupdwn][mvgnltrt]=space;
                mvgnupdwn++;

                if(mvgnupdwn>=size)
                {
                    mvgnupdwn--;
                    System.out.println("Goblin can't move Down");
                }
                else{ mvgnupdwn--;
                    land[mvgnupdwn][mvgnltrt]=space;
                    mvgnupdwn++;
                    land[mvgnupdwn][mvgnltrt]=goblin;}
            }
            else if (move=='L')
            {
                // land[mvgnupdwn][mvgnltrt]=space;
                mvgnltrt--;
                if (mvgnltrt<0)
                {
                    mvgnltrt++;
                    System.out.println("Goblin can't move Left");
                }
                else{ mvgnltrt++;
                    land[mvgnupdwn][mvgnltrt]=space;
                    mvgnltrt--;
                    land[mvgnupdwn][mvgnltrt]=goblin;}
            }
            else if (move=='R')
            {
                //land[mvgnupdwn][mvgnltrt]=space;
                mvgnltrt++;
                if (mvgnltrt>=size)
                {
                    mvgnltrt--;
                    System.out.println("Goblin can't move Right");
                }
                else{ mvgnltrt--;
                    land[mvgnupdwn][mvgnltrt]=space;
                    mvgnltrt++;

                    land[mvgnupdwn][mvgnltrt]=goblin;}
            }

            for(int h=0;h<size;h++)
            {System.out.println();
                for(int o=0;o<size;o++)
                {

                    System.out.print(land[h][o]);
                }
            }

            if (land[mvpupdwn][mvpltrt]==land[mvgnupdwn][mvgnltrt])
            {
                System.out.println("Battle");
                boolean run=false;
                boolean dead=false; int turn =0; char choice=' ';
                Goblinz ghealth1=new Goblinz();
                Humanz health1 =new Humanz();
                while(run==false&&dead==false)
                {


                    HumanInventory h1=new HumanInventory();
                    GoblinInventory g1=new GoblinInventory();
                    if (turn==0){
                        System.out.println("Player Turn Run R or Fight F");
                        choice=sc.next().charAt(0);
                        if (choice =='R')
                        {
                            run=true;
                            System.out.println("Human Ran");
                        }
                        else {
                            System.out.println("Human attacks");
                            ghealth1 = hl.attack(s);
                            if (ghealth1.getHealth() >= 15) {
                                System.out.println("Human Wins");
                                dead = true;
                            }
                        }
                    }
                    else if (turn ==1) {
                        System.out.println("Goblin Attacks");
                        health1 =  s.attack(hl);//human health
                        if(health1.getHealth()>=15)
                        {
                            System.out.println("Goblin Wins Wins");
                            dead=true;
                        }


                    }

                    if (turn==0) turn=1;
                    else if(turn ==1) turn=0;

                }

                //get Gob Hu //strength
            }

            System.out.println();
            System.out.println("Maze");
            System.out.println("Quit Y yes or N no");
            quit=sc.next().charAt(0);




        }





        return quit;
    }

}
