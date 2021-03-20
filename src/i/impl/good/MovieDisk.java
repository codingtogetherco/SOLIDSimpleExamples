package i.impl.good;

import i.impl.bad.IProduct;

import java.util.Date;

public class MovieDisk implements IProduct, IAgeAware {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getStock() {
        return 0;
    }

    @Override
    public int getNumberOfDisks() {
        return 0;
    }

    @Override
    public Date getReleaseDate() {
        return null;
    }

    @Override
    public int getRecommendedAge() {
        return 0;
    }
}
