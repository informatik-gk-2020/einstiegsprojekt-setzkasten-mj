import basis.Hilfe;
import basis.Stift;

public abstract class SetzkastenShape {
    private static final SetzkastenShape[] shapes = {
            new SternShape(),
            new TannenbaumShape(),
            new KreisMitStrichenGekreuztShape()
    };

    public static SetzkastenShape getRandomShape() {
        return shapes[Hilfe.zufall(0, shapes.length - 1)];
    }

    abstract void draw(Stift stift, int x, int y, int cellSize);
}
