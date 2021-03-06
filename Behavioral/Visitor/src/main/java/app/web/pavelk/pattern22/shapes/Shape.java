package app.web.pavelk.pattern22.shapes;

import app.web.pavelk.pattern22.visitor.Visitor;

public interface Shape {
  void move(int x, int y);
  void draw();
  String accept(Visitor visitor);
}