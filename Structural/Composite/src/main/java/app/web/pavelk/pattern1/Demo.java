package app.web.pavelk.pattern1;

import app.web.pavelk.pattern1.editor.ImageEditor;
import app.web.pavelk.pattern1.shapes.Circle;
import app.web.pavelk.pattern1.shapes.CompoundShape;
import app.web.pavelk.pattern1.shapes.Dot;
import app.web.pavelk.pattern1.shapes.Rectangle;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                ),

                new CompoundShape(
                        new Circle(255, 20, 45, Color.RED),
                        new Circle(260, 20, 30, Color.GREEN),
                        new Rectangle(250, 20, 50, 50, Color.GREEN),
                        new Rectangle(255, 20, 20, 50, Color.BLUE),
                        new Dot(205, 15, Color.RED),
                        new Dot(215, 15, Color.BLUE),
                        new Dot(225, 15, Color.GRAY),
                        new Dot(235, 15, Color.GREEN)
                )
        );
    }
}