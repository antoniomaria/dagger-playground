package com.acme.subcomponents2;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseImplModule {

  private final int concurrencyLevel;

  public DatabaseImplModule(int concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
  }

  @Provides
  public DatabaseConnectionPool provideDatabaseConnectionPool() {
    return new DatabaseConnectionPool(concurrencyLevel);
  }

  @Provides
  public DatabaseSchema provideDatabaseSchema() {
    return new DatabaseSchema();
  }

  @PrivateToDatabase
  @Provides
  public Database provideDatabase(
      DatabaseSchema databaseSchema, DatabaseConnectionPool databaseConnectionPool) {
    return new Database(databaseSchema, databaseConnectionPool);
  }
}
