class Dragon {
    int x, y, width, height;

    Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        x--;
        if (x < 0) {
            detectCollision();
        }
    }

    void moveRight() {
        x++;
        if (x > width) {
            detectCollision();
        }
    }

    void moveUp() {
        y--;
        if (y < 0) {
            detectCollision();
        }
    }

    void moveDown() {
        y++;
        if (y > height) {
            detectCollision();
        }
    }

    void printPosition() {
        System.out.println("Posisi Dragon: (" + x + ", " + y + ")");
    }

    void detectCollision() {
        System.out.println("Game Over");
    }
}

public class Dragon01 {
    public static void main(String[] args) {
        Dragon dragon = new Dragon(3, 3, 5, 5);

        dragon.printPosition();
        dragon.moveRight();
        dragon.moveRight();
        dragon.moveRight();
    }
}