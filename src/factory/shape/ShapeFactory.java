package factory.shape;

import factory.color.Circle;
import factory.color.Rectangle;
import factory.color.Shape;
import factory.color.Square;
import factory.factory.Factory;

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
