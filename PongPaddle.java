public class PongPaddle {
    
    private int x; int width; int y; int height;

    public PongPaddle(int top, int left, int w, int h){
        x = left;
        y = top;
        width = w;
        height = h;
    }

    public int getBottomY(){
        return y+(height-1);
    }

    public int getLeftX(){
        return x;
    }
    //good

    public int getRightX(){
        return x+(width-1);
    }

    public int getTopY(){
        return y;
    }
    //good

    public void moveDown(int d){
        y += d;
    }

    public void moveUp(int d){
        y -= d;
    }

}
