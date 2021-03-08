package app.web.pavelk.pattern20.commands;

import app.web.pavelk.pattern20.editor.Editor;
import app.web.pavelk.pattern20.shapes.Shape;

import java.awt.*;

public class ColorCommand implements Command {
  private Editor editor;
  private Color color;

  public ColorCommand(Editor editor, Color color) {
    this.editor = editor;
    this.color = color;
  }

  @Override
  public String getName() {
    return "Colorize: " + color.toString();
  }

  @Override
  public void execute() {
    for (Shape child : editor.getShapes().getSelected()) {
      child.setColor(color);
    }
  }
}