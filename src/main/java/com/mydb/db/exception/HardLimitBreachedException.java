package com.mydb.db.exception;

public class HardLimitBreachedException extends RuntimeException {
  public HardLimitBreachedException(String errorMessage) {
    super(errorMessage);
  }
}
