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
        int obj = Hilfe.zufall(0, 2);

        switch (obj) {
            case 0:
                drawTannenbaum(x, y);
                break;
            case 1:
                drawStern(x, y);
                break;
            case 2:
                drawKreisMitStrichenGekreuzt(x, y);
                break;
        }
    }

    private void drawTannenbaum(int x, int y) {
        int center = cellSize / 2;
        stift.kreis(x + center, y + center, cellSize / 4);
    }

    private void drawStern(int x, int y) {
        int center = cellSize / 2;

        stift.bewegeBis(x + center, y + center);
        for (int i = 0; i < 6; i++) {

        }
    }

    private void drawKreisMitStrichenGekreuzt(int x, int y) {
        int center = cellSize / 2;
        stift.kreis(x + center, y + center, cellSize / 3);
    }
}
