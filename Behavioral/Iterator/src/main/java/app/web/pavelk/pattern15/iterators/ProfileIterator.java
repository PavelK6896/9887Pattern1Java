package app.web.pavelk.pattern15.iterators;

import app.web.pavelk.pattern15.profile.Profile;

public interface ProfileIterator {
  boolean hasNext();

  Profile getNext();

  void reset();
}