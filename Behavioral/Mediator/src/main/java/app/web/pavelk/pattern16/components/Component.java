package app.web.pavelk.pattern16.components;

import app.web.pavelk.pattern16.mediator.Mediator;

public interface Component {
  void setMediator(Mediator mediator);

  String getName();
}