package factory;

import factory.color.ColorFactory;
import factory.factory.FactoryProducer;
import factory.shape.ShapeFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        FactoryProducer producer = new FactoryProducer();
        ColorFactory colorFactory = (ColorFactory) producer.getFactory("color");
        colorFactory.getShape("red").fill();
        colorFactory.getShape("blue").fill();
        colorFactory.getShape("green").fill();
        System.out.println("----------------------");
        ShapeFactory shapeFactory = (ShapeFactory) producer.getFactory("shape");
        shapeFactory.getShape("circle").draw();
        shapeFactory.getShape("rectangle").draw();
        shapeFactory.getShape("square").draw();
    }
}
