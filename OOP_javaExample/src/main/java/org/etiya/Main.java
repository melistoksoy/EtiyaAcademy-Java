package org.etiya;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.GiveCredit();

        /* CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer();
        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();

        Person person = new Person();
        person.setNationalIdentity("458690");

        CustomerManager customerManager2 = new CustomerManager(person);
        customerManager2.save();

        Company company = new Company(55,"heyo");
        company.setTaxNumber("1000");

        CustomerManager customerManager3 = new CustomerManager(company);
        customerManager3.save();*/


    }

}

/*class CreditManager {
    public void calculate() {

        System.out.println("Hesaplandı");

    }

    public void save() {
        System.out.println("Kredi verildi");
    }
}*/
interface CreditManager {
    void calculate();

    void save();
}

abstract class BaseCreditManager implements CreditManager {
    public abstract void calculate();

    public void save() {
        System.out.println("Kaydedildi");
    }

}

class TeacherCreditManager extends BaseCreditManager {

    @Override
    public void calculate() {

        System.out.println("Öğretmen kredisi hesaplandı.");
    }


}

class MilitaryCreditManager extends BaseCreditManager {

    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandı.");

    }


}

class Customer {
    private int id;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class Company extends Customer {

    private String TaxNumber;

    public String getTaxNumber() {
        return TaxNumber;
    }

    public void setTaxNumber(String textNumber) {
        TaxNumber = textNumber;
    }
}

class Person extends Customer {

    private String NationalIdentity;

    public String getNationalIdentity() {
        return NationalIdentity;
    }

    public void setNationalIdentity(String natinolIdentity) {
        NationalIdentity = natinolIdentity;
    }
}

class CustomerManager {
    public Customer _customer;
    public CreditManager _creditManager;

    public CustomerManager(Customer customer, CreditManager creditManager) {
        _customer = customer;
        _creditManager = creditManager;

    }

    public void save() {
        System.out.println("Müşteri eklendi : ");
    }

    public void delete() {
        System.out.println("Müşteri silindi : ");
    }

    public void GiveCredit() {
        _creditManager.calculate();
        _creditManager.save();

    }
}