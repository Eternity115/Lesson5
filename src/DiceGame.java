import processing.core.*;
import g4p_controls.*;
import javax.swing.*;

//change name of class:
public class DiceGame extends PApplet
{
	//make sure to change the name here too
	static String[] program = {"DiceGame"};
        VDice d1,d2;
        GButton rollbtn;
        GLabel totlabel;
        
	public void setup()
	{
            size(350, 250, JAVA2D);
            background(200, 220, 240);
            d1=new VDice(this,100,100);
            d2=new VDice(this,200,100);
            rollbtn = new GButton (this, 100,10,150,30);
            rollbtn.setText("Roll");
            totlabel= new GLabel (this,100,160,150,30);
            totlabel.setOpaque(true);
            totlabel.setText("Click button to roll");
            rollbtn.setLocalColorScheme(5);

	}

	public void handleButtonEvents(GButton button, GEvent event) 
	{
            background(200, 220, 240);
            d1.roll();
            d2.roll();
            int total = d1.getValue() + d2.getValue();
            totlabel.setText("You rolled a " + total);
	}		

	public void draw()
	{
            //background(240, 240, 220); //light tan

	}

	//this is needed to run the program
	public static void main (String ags[])
	{
		
		PApplet.main(program);
	}

}