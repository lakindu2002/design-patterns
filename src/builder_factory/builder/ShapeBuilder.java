package builder_factory.builder;

import builder_factory.shape.Shape;

public abstract class ShapeBuilder {
    public abstract void buildShape();
    public abstract void fillColor();
    public abstract Shape getShape();
}
