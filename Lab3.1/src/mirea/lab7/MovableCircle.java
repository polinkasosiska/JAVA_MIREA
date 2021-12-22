package mirea.lab7;

public class MovableCircle implements MovableInterface {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        center.y += center.ySpeed;
    }

    public void moveDown() {
        center.y -= center.ySpeed;
    }

    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    public void moveRight() {
        center.x += center.xSpeed;
    }

    public String toString() {
        return "x = " + center.x + "\ny = " + center.y + "\nxSpeed = " + center.xSpeed + "\nySpeed = " + center.ySpeed + "\nradius = " + radius;
    }

    public MovableCircle copy() {
        return new MovableCircle(center.x, center.y, center.xSpeed, center.ySpeed, radius);
    }
}
