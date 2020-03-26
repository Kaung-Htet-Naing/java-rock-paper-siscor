public class Computer {
    private static int computerHp=100;
    public int function(){
        return computerHp;
    }
    public static int lose(){
        return computerHp-=30;
    }
    public int getComputerHp(){
        return this.computerHp;
    }
    public static int draw(){
        return computerHp+=10;
    }

}
