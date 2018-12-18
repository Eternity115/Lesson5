
public class Dice {
    private int num1;
    public Dice(){
        num1=1;
    }
    public int roll(){
        num1 = (int)(Math.random()*6+1);
        return num1;
    } 
    public int getValue(){
        return num1;
    }
}
