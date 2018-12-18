import processing.core.PApplet;
public class Ball {
    PApplet pen; //to draw with
    float x,y; //tracks location of ball
    
    public Ball(PApplet p, float x1, float y1, char c){
        pen = p; //assign incoming PApplet to the pen
        //send in 'r' for red or else it will be green
        if (c=='r')
            pen.fill(255,0,0); //sets colour of pen r-g-b style
        else if (c=='o')
            pen.fill(255,120,10);
        else if (c=='y')
            pen.fill(255,255,0);
        else if (c=='g')
            pen.fill(0,255,0);
        else if (c=='a')
            pen.fill(0,180,180);
        else if (c=='b')
            pen.fill(50,50,255);
        else
            pen.fill(150,0,255);
        x=x1;
        y=y1;
    }
    
    public void draw(){
        pen.ellipse(x,y, 20,20);
    }
    
    
    
}

