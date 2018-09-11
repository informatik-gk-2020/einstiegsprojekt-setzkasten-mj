import basis.*;

public class Setzkasten {
    private final Fenster fenster = new Fenster(800, 600);
    private final Stift stift = new Stift();

    private final int width;
    private final int height;
    private final int cellSize = 100;

    public Setzkasten() {
        this(3, 2);
    }

    public Setzkasten(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                int x = column * cellSize, y = row * cellSize;

                stift.rechteck(x, y, cellSize, cellSize);
                drawObject(x, y);
            }
        }
    }

    private void drawObject(int x, int y) {
        SetzkastenShape.getRandomShape().draw(stift, x, y, cellSize);
    }
}
