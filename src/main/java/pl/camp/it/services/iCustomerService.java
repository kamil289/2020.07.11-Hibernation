package pl.camp.it.services;

public interface iCustomerService<generateAndSaveCustomer> {

    void generateAndSaveCustomer(String name, String surname, String pesel);

}
