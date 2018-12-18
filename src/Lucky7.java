import TerminalIO.*;
public class Lucky7 {

    
    public static void main(String[] args) {
        int dollars,rolls=0, highest, ndollar=0, froll=0;
        int n1,n2,end;
        Dice die1 = new Dice();
        Dice die2 = new Dice();
        
        KeyboardReader k = new KeyboardReader();
        dollars = k.readInt("How many dollars do you have? $");
        
        while (true){
            if (dollars<=0) break;
            n1 = die1.roll();
            n2 = die2.roll();
            end=n1+n2;
            if (end==7) dollars+=4;
            else dollars--;
            rolls++;
            if (dollars>ndollar){
                ndollar=dollars;
                froll=rolls;
            }
            //System.out.format("Roll %d: %d + %d = %d\n",rolls, n1,n2,end);
        }
        System.out.println("You are broke after " + rolls + " rolls");
        System.out.format("You should have quit after " + froll + " rolls when you had $"+ ndollar + "\n");
    } 
}
