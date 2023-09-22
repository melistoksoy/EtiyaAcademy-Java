package org.etiya;

public class CustomerManager {
    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add() {
        System.out.println("Added.");
        this.baseLogger.log("adding log message");
    }
}
