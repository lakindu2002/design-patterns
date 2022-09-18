package builder_factory.factory;

import builder_factory.color.ColorFactory;
import builder_factory.shape.ShapeFactory;

public class FactoryProducer extends AbstractFactory {
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
