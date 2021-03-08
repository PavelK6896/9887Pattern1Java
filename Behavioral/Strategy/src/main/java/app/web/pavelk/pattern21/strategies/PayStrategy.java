package app.web.pavelk.pattern21.strategies;

public interface PayStrategy {
  boolean pay(int paymentAmount);
  void collectPaymentDetails();
}