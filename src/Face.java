import java.awt.Color;
import processing.core.PApplet;

public class Face {
    private float xPosition, yPosition, radius;
    private Color color, eyecolor;
    private boolean happy=true, hat=false;
    
    private PApplet pen;
    
    public Face(PApplet p, float x, float y){
        xPosition = x;
        yPosition = y;
        radius = 400;
        color = Color.red;
        eyecolor = Color.yellow;
        pen=p;
    }
    
    public void draw(){
        pen.stroke(0); //black outline
        pen.strokeWeight(1);
        pen.fill(color.getRed(), color.getGreen(), color.getBlue()); //head colour
        drawCircle(xPosition, yPosition, radius, radius);//head
        //eyes
        pen.fill(eyecolor.getRed(), eyecolor.getGreen(), eyecolor.getBlue()); //eye colour
        drawCircle(xPosition-radius/5, yPosition-radius/5, radius/4, radius/4);
        drawCircle(xPosition+radius/5, yPosition-radius/5, radius/4, radius/4);
        //mouth - line across and 2 lines pointing up
        if (happy==true){
            drawLine(xPosition-.2*radius,yPosition+.3*radius, xPosition+.20*radius, yPosition+.3*radius); //middle mouth
            drawLine(xPosition-.2*radius,yPosition+.3*radius, xPosition-.25*radius, yPosition+.2*radius); //left mouth
            drawLine(xPosition+.2*radius,yPosition+.3*radius, xPosition+.25*radius, yPosition+.2*radius); //right mouth
        }
        else{
            drawLine(xPosition-.2*radius,yPosition+.2*radius, xPosition+.20*radius, yPosition+.2*radius); //middle mouth
            drawLine(xPosition-.2*radius,yPosition+.2*radius, xPosition-.25*radius, yPosition+.3*radius); //left mouth
            drawLine(xPosition+.2*radius,yPosition+.2*radius, xPosition+.25*radius, yPosition+.3*radius); //right mouth
        }
        //hat
        if (hat==true){
            pen.fill(244, 234, 141);
            pen.stroke(244, 234, 141);
            drawCircle(xPosition, yPosition-.5f*radius, radius+.4f*radius, radius/4);
            drawCircle(xPosition, yPosition-.65f*radius, radius-.3f*radius, radius/2);
            pen.stroke(255, 201, 201);
            pen.fill(255, 201, 201);
            pen.rect(xPosition-.35f*radius, yPosition-.69f*radius, radius-.3f*radius, radius/12);
            //pen.strokeWeight(40);
            //pen.curve(xPosition,yPosition-.2f*radius,200,200,400,200,500,100);
        }
        
        
        
    }
    //private helper method
    private void drawCircle(float x, float y, float wid, float ht){
        pen.ellipse(x,y,wid,ht);
    }
    private void drawLine(double x1, double y1, double x2, double y2){
        pen.line((float)x1,(float) y1, (float)  x2, (float) y2);
    }
    public void erase(){
        pen.fill(255);
        pen.noStroke();
        pen.rect(0,0,800,800);
    }
    public void setColor(Color c, Color e){
        color = c;
        eyecolor = e;
    }
    public void setColor(int r, int g, int b){
        color = new Color(r,g,b);
    }
    
    public void move(float xm, float ym){
        xPosition=xm;
        yPosition=ym;
    }
    public void resize(float rad){
        radius=rad;
    }
    public void setMood(int m){
        if (m==1) happy=true;
        else happy=false;
    }
    public void setHat(){
        if (hat==false) hat=true;
        else hat=false;
    }

    
}
