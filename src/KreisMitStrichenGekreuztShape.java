import basis.Stift;

public class KreisMitStrichenGekreuztShape extends SetzkastenShape {
    @Override
    void draw(Stift stift, int x, int y, int cellSize) {
        int center = cellSize / 2;
        stift.kreis(x + center, y + center, cellSize / 3);
    }
}
