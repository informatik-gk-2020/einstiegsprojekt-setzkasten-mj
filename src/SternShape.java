import basis.Stift;

public class SternShape extends SetzkastenShape {
    @Override
    void draw(Stift stift, int x, int y, int cellSize) {
        int center = cellSize / 2;

        stift.bewegeBis(x + center, y + (cellSize - 85) / 2);
        stift.dreheBis(60);
        stift.runter();
        for (int i = 0; i < 6; i++) {
            stift.dreheUm(360 / -3);
            stift.bewegeUm(25);
            stift.dreheUm(360 / 6);
            stift.bewegeUm(25);
        }
        stift.hoch();
    }
}
