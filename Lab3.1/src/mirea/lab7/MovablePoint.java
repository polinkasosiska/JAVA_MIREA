package mirea.lab7;

public class MovablePoint implements MovableInterface{
    int x, y, xSpeed, ySpeed;

     public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y += ySpeed;
    }

    public void moveDown() {
        y -=ySpeed;
    }

    public void moveLeft() {
        x -=xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    public String toString() {
        return "x = " + x + "\ny = " + y + "\nxSpeed = " + xSpeed + "\nySpeed = " + ySpeed;
    }

    public MovablePoint copy() {
        return new MovablePoint(x, y, xSpeed, ySpeed);
    }
}
