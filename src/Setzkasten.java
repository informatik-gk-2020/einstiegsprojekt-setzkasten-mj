import basis.*;

public class Setzkasten {
    private final Fenster fenster;
    private final Stift stift;

    private final int width;
    private final int height;
    private final int cellSize = 100;
    private final int inset = 20;

    public Setzkasten() {
        this(3, 2);
    }

    public Setzkasten(int width, int height) {
        this.width = width;
        this.height = height;

        fenster = new Fenster(width * cellSize + inset * 2, height * cellSize + inset * 2);
        stift = new Stift();
    }

    public void draw() {
        draw(inset, inset);
    }

    public void draw(int offsetX, int offsetY) {
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                int x = column * (cellSize - 1) + offsetX;
                int y = row * (cellSize - 1) + offsetY;

                stift.rechteck(x, y, cellSize, cellSize);
                drawObject(x, y);
            }
        }
    }

    private void drawObject(int x, int y) {
        SetzkastenShape.getRandomShape().draw(stift, x, y, cellSize);
    }
}
