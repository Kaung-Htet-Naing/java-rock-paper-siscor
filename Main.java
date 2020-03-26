import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int round=1;
        System.out.println("Welcome from game ");
        System.out.print("Please Enter Your Name ");
        String playername=sc.nextLine();
        System.out.println("Create User Name as \" "+playername+" \"");
        Player p=new Player(playername);
        Computer pc=new Computer();
        Random rand=new Random();
        System.out.println("Your Hp = 100 Hp");
        System.out.println("Computer Hp = 100 Hp");

        while(p.getPlayerHp()>0 && pc.getComputerHp()>0) {
            int pcrandnum=rand.nextInt(3)+1;
            System.out.println("Welcome \" " + p.getname() + " \". Let\'s start "+round+"st round of the game.");
            System.out.println("Choose One ");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Siscor");
            System.out.print(": ");
            int pinput = sc.nextInt();
            System.out.println("...Compute your value with Computer...");
            compareResult(pinput, pcrandnum);
            System.out.print("Computer choose - ");
            pcRandom(pcrandnum);
            round++;
            if(p.getPlayerHp()<0){
                System.out.println("You Lose the game => Total round complete ( "+round+" round ) ");
            }
            else if(pc.getComputerHp()<0){
                System.out.println("You Win the game => Total round complete ( "+round+" round ) ");
            }
            else {
                System.out.println("Your Hp - " + p.getPlayerHp());
                System.out.println("Computer Hp - " + pc.getComputerHp());
            }
        }
    }

    public static void compareResult(int playerinput, int computerinput){

        String win="You Win";
        String lose="You Lose";
        String draw="Draw";
        if(playerinput==1 && computerinput==3){
            Computer.lose();
            System.out.println(win);
        }
        else if(playerinput==1 && computerinput==2){
            Player.lose();
            System.out.println(lose);
        }
        else if(playerinput==2 && computerinput==1){
            Computer.lose();
            System.out.println(win);
        }else if(playerinput==2 && computerinput==3){
            Player.lose();
            System.out.println(lose);
        }else if(playerinput==3 && computerinput==2){
            Computer.lose();
            System.out.println(win);
        }else if(playerinput==3 && computerinput==1){
            Player.lose();
            System.out.println(lose);
        }
        else{
            System.out.println(draw);
            Player.draw();
            Computer.draw();
        }
    }

    public static void pcRandom(int rad){
        switch(rad){
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Siscor");
        }
    }
}
