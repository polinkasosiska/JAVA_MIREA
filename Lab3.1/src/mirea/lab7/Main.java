package mirea.lab7;

public class Main {

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2, 1, 2, 1);
        System.out.println("movablePoint:");
        System.out.println(movablePoint);
        System.out.println("Copying point...");
        MovablePoint pointCopy = movablePoint.copy();
        System.out.println("pointCopy:");
        System.out.println(pointCopy);
        System.out.println("moving down and left movablePoint...");
        movablePoint.moveDown();
        movablePoint.moveLeft();
        System.out.println("movablePoint:");
        System.out.println(movablePoint);
        System.out.println("pointCopy:");
        System.out.println(pointCopy);
        MovableCircle movableCircle = new MovableCircle(2, 4, 1, 2, 5);
        System.out.println("\nmovableCircle:");
        System.out.println(movableCircle);
        System.out.println("Copying circle...");
        MovableCircle circleCopy = movableCircle.copy();
        System.out.println("circleCopy:");
        System.out.println(circleCopy);
        System.out.println("moving up and right movableCircle...");
        movableCircle.moveUp();
        movableCircle.moveRight();
        System.out.println("movableCircle:");
        System.out.println(movableCircle);
        System.out.println("circleCopy:");
        System.out.println(circleCopy);
    }
}
