package builder_factory.color;

import builder_factory.shape.Circle;
import builder_factory.shape.Rectangle;
import builder_factory.shape.Shape;
import builder_factory.shape.Square;
import builder_factory.factory.Factory;

public class ShapeFactory implements Factory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        if (type.equalsIgnoreCase("square")) {
            return new Square();
        }
        return new Rectangle();
    }
}
