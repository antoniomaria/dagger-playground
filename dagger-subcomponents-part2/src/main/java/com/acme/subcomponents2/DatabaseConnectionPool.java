package com.acme.subcomponents2;

public class DatabaseConnectionPool {
  private int concurrencyLevel;

  public DatabaseConnectionPool(int concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
  }

  @Override
  public String toString() {
    return "DatabaseConnectionPool{" + "concurrencyLevel=" + concurrencyLevel + '}';
  }
}
