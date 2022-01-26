package set22.movables;

public class TestMovables {

    public static void main(String[] args) {

        MovablePoint point = new MovablePoint(1, 1, 1, 1);
        Movable movable = point;
        movable.moveDown();
        movable.moveLeft();

        System.out.println(point);

        MovableCircle circle = new MovableCircle(point.x, point.y, point.xSpeed, point.ySpeed, 2);
        movable = circle;
        movable.moveUp();
        movable.moveUp();
        movable.moveRight();

        System.out.println(circle);

    }

}
