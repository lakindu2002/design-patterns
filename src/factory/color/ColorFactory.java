package factory.color;

import factory.factory.Factory;
import factory.shape.Blue;
import factory.shape.Color;
import factory.shape.Green;
import factory.shape.Red;

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
