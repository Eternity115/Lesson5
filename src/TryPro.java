import processing.core.*;
import g4p_controls.*;

public class TryPro extends PApplet{
    GButton btnred, btnorange, btnyellow,btngreen,btnaqua, btnblue, btnpurple, btnpink, btnwhite,btnblack;
    Ball b;
    
    
    public void setup(){
        size(600,480,JAVA2D);
        btnred = new GButton(this, 10,10,120,25);
        btnorange = new GButton(this, 10,40,120,25);
        btnyellow = new GButton(this, 10,70,120,25);
        btngreen = new GButton(this,10,100,120,25);
        btnaqua = new GButton(this,10,130,120,25);
        btnblue = new GButton(this,10,160,120,25);
        btnpurple = new GButton(this,10,190,120,25);
        //btnpink = new GButton(this,270,10,120,25);
        btnred.setText("Make a Red Ball");
        btnorange.setText("Make a Orange Ball");
        btnyellow.setText("Make a Yellow Ball");
        btngreen.setText("Make a Green Ball");
        btnaqua.setText("Make a Aqua Ball");
        btnblue.setText("Make a Blue Ball");
        btnpurple.setText("Make a Purple Ball");
        //btnpink.setText("Make a Blue Ball");
        //btnblack.setText("Make a Blue Ball");
        //btnwhite.setText("Make a Blue Ball");
        btnred.setLocalColorScheme(0);
        btnorange.setLocalColorScheme(4);
        btnyellow.setLocalColorScheme(2);
        btngreen.setLocalColorScheme(1);
        btnaqua.setLocalColorScheme(5);
        btnblue.setLocalColorScheme(6);
        btnpurple.setLocalColorScheme(3);
    }
    
    public static void main(String[] args) {
        PApplet.main("TryPro");
    }
    
    public void handleButtonEvents(GButton button, GEvent event) {
        if (button == btnred){
            b=new Ball(this, (float)(Math.random()*590), (float) (Math.random()*470),'r');
        }
        if (button == btnorange){
            b=new Ball(this, (float)(Math.random()*590), (float) (Math.random()*470),'o');
        }
        if (button == btnyellow){
            b=new Ball(this, (float)(Math.random()*590), (float) (Math.random()*470),'y');
        }
        if (button == btngreen){
            b=new Ball(this, (float)(Math.random()*590), (float) (Math.random()*470),'g');
        }
        if (button == btnaqua){
            b=new Ball(this, (float)(Math.random()*590), (float) (Math.random()*470),'a');
        }
        if (button == btnblue){
            b=new Ball(this, (float)(Math.random()*590), (float) (Math.random()*470),'b');
        }
        if (button == btnpurple){
            b=new Ball(this, (float)(Math.random()*590), (float) (Math.random()*470),'p');
        }  
    }	
    
    public void draw(){
        //background (255,255,255);
        //ellipse(250,250,50,50);
        if (b!=null)
            b.draw();
    }
    
}
