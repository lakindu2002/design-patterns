package builder_factory.builder;

import builder_factory.color.ColorFactory;
import builder_factory.factory.FactoryProducer;
import builder_factory.shape.Shape;

public class CircleBuilder extends ShapeBuilder {

    private final Shape circle;

    public CircleBuilder(Shape circle) {
        this.circle = circle;
    }

    @Override
    public void buildShape() {
        circle.draw();
    }

    @Override
    public void fillColor() {
        FactoryProducer producer = new FactoryProducer();
        ColorFactory factory = (ColorFactory) producer.getFactory("color");
        factory.getColor("red").fill();
    }

    @Override
    public Shape getShape() {
        return this.circle;
    }
}
