package l.impl.good;

public class Rectangle implements IFourSidedFigured {

    private int width;
    private int height;

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int calculateArea() {
        return 0;
    }
}
