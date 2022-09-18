package builder_factory.color;

import builder_factory.factory.Factory;
import builder_factory.color.Blue;
import builder_factory.color.Color;
import builder_factory.color.Green;
import builder_factory.color.Red;

public class ColorFactory implements Factory {
    public Color getColor(String type) {
        if (type.equalsIgnoreCase("red")) {
            return new Red();
        }
        if (type.equalsIgnoreCase("green")) {
            return new Green();
        }
        return new Blue();
    }
}
