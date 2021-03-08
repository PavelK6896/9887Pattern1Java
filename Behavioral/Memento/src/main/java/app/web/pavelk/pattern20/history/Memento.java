package app.web.pavelk.pattern20.history;

import app.web.pavelk.pattern20.editor.Editor;

public class Memento {
  private String backup;
  private Editor editor;

  public Memento(Editor editor) {
    this.editor = editor;
    this.backup = editor.backup();
  }

  public void restore() {
    editor.restore(backup);
  }
}