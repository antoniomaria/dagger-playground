package com.acme.subcomponents2;

public class Database {
  private DatabaseSchema databaseSchema;
  private DatabaseConnectionPool databaseConnectionPool;

  public Database(DatabaseSchema databaseSchema, DatabaseConnectionPool databaseConnectionPool) {
    this.databaseSchema = databaseSchema;
    this.databaseConnectionPool = databaseConnectionPool;
    System.out.println("Database created with " + databaseSchema + " " + databaseConnectionPool);
  }

  @Override
  public String toString() {
    return "schema: " + databaseSchema +  " " + databaseConnectionPool;
  }
}
