package builder_factory.shape;

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
