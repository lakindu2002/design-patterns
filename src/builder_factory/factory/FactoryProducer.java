package factory.factory;

import factory.color.ColorFactory;
import factory.shape.ShapeFactory;

public class FactoryProducer extends AbstractFactory{
    @Override
    public Factory getFactory(String type) {
        if(type.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        if(type.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }
        throw new RuntimeException("unknown factory type");
    }
}
