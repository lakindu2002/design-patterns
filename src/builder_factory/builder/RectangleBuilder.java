package builder_factory.builder;

import builder_factory.color.ColorFactory;
import builder_factory.factory.FactoryProducer;
import builder_factory.shape.Shape;

public class RectangleBuilder extends ShapeBuilder {

    private final Shape rectangle;

    public RectangleBuilder(Shape rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void buildShape() {
        rectangle.draw();
    }

    @Override
    public void fillColor() {
        FactoryProducer producer = new FactoryProducer();
        ColorFactory factory = (ColorFactory) producer.getFactory("color");
        factory.getColor("red").fill();
    }

    @Override
    public Shape getShape() {
        return this.rectangle;
    }
}
