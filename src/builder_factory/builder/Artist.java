package builder_factory.builder;

import builder_factory.shape.Shape;

public class Artist {
    private final ShapeBuilder builder;

    public Artist(ShapeBuilder builder) {
        this.builder = builder;
    }

    public void constructShape() {
        builder.buildShape();
        builder.fillColor();
    }

    public Shape getShape() {
        return builder.getShape();
    }
}
