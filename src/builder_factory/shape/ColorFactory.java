package builder_factory.color;

import builder_factory.factory.Factory;
import builder_factory.shape.Blue;
import builder_factory.shape.Color;
import builder_factory.shape.Green;
import builder_factory.shape.Red;

public class ColorFactory implements Factory {
    public Color getShape(String type) {
        if (type.equalsIgnoreCase("red")) {
            return new Red();
        }
        if (type.equalsIgnoreCase("green")) {
            return new Green();
        }
        return new Blue();
    }
}
