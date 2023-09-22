package org.etiya;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

     BaseLogger[] loggers= new BaseLogger[]{new FileLogger(),new ConsoleLogger()};

     for( BaseLogger logger:loggers){
         logger.log(" : log message");
     }

     CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
     customerManager.add();

    }

}