package org.etiya.core.logging;

public class DatabaseLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("veritabanina gonderildi: " + data);

    }

}