import processing.core.*;
import g4p_controls.*;
import java.awt.Color;
import javax.swing.*;

//change name of class:
public class FaceMaker extends PApplet
{       
        Face f;
        GButton button1;
        GButton button2;
        GButton button3;
        GButton button4;
        GButton button5;
        
        float x,y;
        float rad;
        float r=255,g=0,b=0;
        int mood, hat=0;
        
	//make sure to change the name here too
	static String[] program = {"FaceMaker"};
	public void setup()
	{
		size(800, 800, JAVA2D);
                background(255);
                f = new Face(this, 400,400);
                button1 = new GButton(this, 20,20,80,30);
                button1.setText("Move Face");
                button2 = new GButton(this, 20,60,80,30);
                button2.setText("Resize Face");
                button3 = new GButton(this, 20,100,80,30);
                button3.setText("Change Colour");
                button4 = new GButton(this, 20,140,80,30);
                button4.setText("Set Mood");
                button5 = new GButton(this, 20,180,80,30);
                button5.setText("Hat On/Off");

	}

	public void handleButtonEvents(GButton button, GEvent event) 
	{
            if (button==button1){
                //ask for new x-y location
                while (true){
                   x = Float.parseFloat(JOptionPane.showInputDialog(this, "Enter new x: "));
                   if (x>=0 && x<=800) break;
                }
                while (true){
                   y = Float.parseFloat(JOptionPane.showInputDialog(this, "Enter new y: "));
                   if (y>=0 && y<=800) break;
                }
                //move to new x-y location
                f.erase(); //erase face in current state
                f.move(x,y);
            }
            if (button==button2){
                //ask for new radius
                while (true){
                    rad = Float.parseFloat(JOptionPane.showInputDialog(this, "Enter new diameter (0-800): "));
                    if (rad>=0 && rad<=800)break;
                }
                f.erase();
                f.resize(rad);
            }
            if (button==button3){
                /*
                while (true){
                    r = Float.parseFloat(JOptionPane.showInputDialog(this, "How much red do you want (0-255): "));
                    if (r>=0 && r<=255) break;
                }
                while (true){
                    g = Float.parseFloat(JOptionPane.showInputDialog(this, "How much green do you want (0-255): "));
                    if (g>=0 && g<=255) break;
                }
                while (true){
                    b = Float.parseFloat(JOptionPane.showInputDialog(this, "How much blue do you want (0-255): "));
                    if (b>=0 && b<=255) break;
                }
                f.erase();
                f.setColor((int)r,(int)g,(int)b);
                */
                Color fcc = JColorChooser.showDialog(this, "Pick a face colour", Color.RED);
                Color eyc = JColorChooser.showDialog(this, "Pick a eye colour", Color.RED);
                //apply colour to face
                f.erase();
                f.setColor(fcc,eyc);
            }
            if (button==button4){
                while (true){
                    mood = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter 1 for happy or 0 for sad: "));
                    if(mood==0 || mood==1) break;
                }
                f.erase();
                f.setMood(mood);
            }
            if (button==button5){
                f.erase();
                f.setHat();
            }
            
	}		

	public void draw()
	{
            f.draw();
	}

	//this is needed to run the program
	public static void main (String ags[])
	{
		
		PApplet.main(program);
	}

}