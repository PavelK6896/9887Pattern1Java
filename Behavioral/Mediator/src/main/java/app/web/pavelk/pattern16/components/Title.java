package app.web.pavelk.pattern16.components;

import app.web.pavelk.pattern16.mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Конкретные компоненты никак не связаны между собой. У них есть только один
 * канал общения – через отправку уведомлений посреднику.
 */
public class Title extends JTextField implements Component {
  private Mediator mediator;

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  protected void processComponentKeyEvent(KeyEvent keyEvent) {
    mediator.markNote();
  }

  @Override
  public String getName() {
    return "Title";
  }
}