package app.web.pavelk.pattern22.visitor;

import app.web.pavelk.pattern22.shapes.Circle;
import app.web.pavelk.pattern22.shapes.CompoundShape;
import app.web.pavelk.pattern22.shapes.Dot;
import app.web.pavelk.pattern22.shapes.Rectangle;

public interface Visitor {
  String visitDot(Dot dot);

  String visitCircle(Circle circle);

  String visitRectangle(Rectangle rectangle);

  String visitCompoundGraphic(CompoundShape cg);
}