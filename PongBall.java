public class PongBall {
    
    private int xVelocity; int yVelocity; int x; int y;

    public PongBall(int initX, int initY, int initXVel, int initYVel){
        x = initX;
        y = initY;
        xVelocity = initXVel;
        yVelocity = initYVel;
    }

    public void bounceX(){
        xVelocity = xVelocity*-1;
    }

    public void bounceY(){
        yVelocity = yVelocity*-1;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void move(){
        x = x+xVelocity;
        y = y+yVelocity;
    }

}
