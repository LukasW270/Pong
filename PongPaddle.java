public class PongPaddle {
    
    private int x; int width; int y; int height;

    public PongPaddle(int top, int left, int w, int h){
        x = left;
        y = top;
        w = width;
        h = height;
    }

    public int getBottomY(){
        return y-height;
    }

    public int getLeftX(){
        return x;
    }
    //good

    public int getRightX(){
        return x-width;
    }

    public int getTopY(){
        return y-height;
    }
    //good

    public void moveDown(int d){
        y += d;
    }

    public void moveUp(int d){
        y -= d;
    }

}
