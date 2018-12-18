
import processing.core.*;

public class VDice {

    private int value;
    private PApplet host;
    private int xloc, yloc;

    public VDice(PApplet pa, int x, int y) {
        value = 1;
        host = pa;
        xloc = x;
        yloc = y;

    }

    public void roll() {
        value = (int) (Math.random() * 6 + 1);
        switch (value) {
            case 1:draw1();break;
            case 2:draw2();break;
            case 3:draw3();break;
            case 4:draw4();break;
            case 5:draw5();break;
            case 6:draw6(); break;

        }

    }

    public int getValue() {
        return value;
    }

    private void draw1() {
        host.fill(255);
        host.rect(xloc, yloc, 50, 50);
        host.fill(0);
        host.ellipse(xloc + 25, yloc + 25, 10, 10); //mid dot
    }

    private void draw2() {
        host.fill(255);
        host.rect(xloc, yloc, 50, 50);
        host.fill(0);
        host.ellipse(xloc + 10, yloc + 10, 10, 10); //top left
        host.ellipse(xloc + 40, yloc + 40, 10, 10); //bottom right
    }

    private void draw3() {
        host.fill(255);
        host.rect(xloc, yloc, 50, 50);
        host.fill(0);
        host.ellipse(xloc + 10, yloc + 10, 10, 10); //top left
        host.ellipse(xloc + 25, yloc + 25, 10, 10); //mid dot
        host.ellipse(xloc + 40, yloc + 40, 10, 10); //bottom right
    }

    private void draw4() {
        host.fill(255);
        host.rect(xloc, yloc, 50, 50);
        host.fill(0);
        host.ellipse(xloc + 10, yloc + 10, 10, 10); //top left
        host.ellipse(xloc + 40, yloc + 10, 10, 10); //top right
        host.ellipse(xloc + 10, yloc + 40, 10, 10); //bottom left
        host.ellipse(xloc + 40, yloc + 40, 10, 10); //bottom right
    }

    private void draw5() {
        host.fill(255);
        host.rect(xloc, yloc, 50, 50);
        host.fill(0);
        host.ellipse(xloc + 10, yloc + 10, 10, 10); //top left
        host.ellipse(xloc + 40, yloc + 10, 10, 10); //top right
        host.ellipse(xloc + 25, yloc + 25, 10, 10); //mid dot
        host.ellipse(xloc + 10, yloc + 40, 10, 10); //bottom left
        host.ellipse(xloc + 40, yloc + 40, 10, 10); //bottom right
    }

    private void draw6() {
        host.fill(255);
        host.rect(xloc, yloc, 50, 50);
        host.fill(0);
        host.ellipse(xloc + 10, yloc + 10, 10, 10); //top left
        host.ellipse(xloc + 40, yloc + 10, 10, 10); //top right
        host.ellipse(xloc + 10, yloc + 25, 10, 10); //mid left
        host.ellipse(xloc + 40, yloc + 25, 10, 10); //mid right
        host.ellipse(xloc + 10, yloc + 40, 10, 10); //bottom left
        host.ellipse(xloc + 40, yloc + 40, 10, 10); //bottom right
    }

}
