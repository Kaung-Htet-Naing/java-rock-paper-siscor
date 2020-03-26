import java.util.Random;

public class Player {

    private static int playerHp=100;
    private String name;
    public Player(String inputname){
        this.name=inputname;
    }
    public int getPlayerHp(){
        return this.playerHp;
    }
    public String getname(){
        return this.name;
    }
    public static int lose(){
        return playerHp-=30;
    }
    public static int draw(){
        return playerHp+=10;
    }
}
