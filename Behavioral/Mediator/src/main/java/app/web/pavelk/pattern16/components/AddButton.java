package app.web.pavelk.pattern16.components;

import app.web.pavelk.pattern16.mediator.Mediator;
import app.web.pavelk.pattern16.mediator.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Конкретные компоненты никак не связаны между собой. У них есть только один
 * канал общения – через отправку уведомлений посреднику.
 */
public class AddButton extends JButton implements Component {
  private Mediator mediator;

  public AddButton() {
    super("Add");
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  protected void fireActionPerformed(ActionEvent actionEvent) {
    mediator.addNewNote(new Note());
  }

  @Override
  public String getName() {
    return "AddButton";
  }
}