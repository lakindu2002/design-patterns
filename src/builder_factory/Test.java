package builder_factory;

import builder_factory.builder.Artist;
import builder_factory.builder.CircleBuilder;
import builder_factory.builder.RectangleBuilder;
import builder_factory.builder.ShapeBuilder;
import builder_factory.shape.Circle;
import builder_factory.shape.Rectangle;

public class Test {
    public static void main(String[] args) {
        ShapeBuilder rectangleBuilder = new RectangleBuilder(new Rectangle());
        Artist artist = new Artist(rectangleBuilder);
        artist.constructShape();

        ShapeBuilder circleBuilder = new CircleBuilder(new Circle());
        Artist circleArtist = new Artist(circleBuilder);
        circleArtist.constructShape();
    }
}
