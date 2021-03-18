package app.web.pavelk.pattern15.social_networks;

import app.web.pavelk.pattern15.iterators.ProfileIterator;

public interface SocialNetwork {
  ProfileIterator createFriendsIterator(String profileEmail);

  ProfileIterator createCoworkersIterator(String profileEmail);
}