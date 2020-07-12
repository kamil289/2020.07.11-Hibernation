package pl.camp.it.gui;

import pl.camp.it.services.CustomerService;
import pl.camp.it.services.iCustomerService;

import java.util.Scanner;

public class GUI {

    static iCustomerService customerService = new CustomerService();

    public static void showAddCustomerScreen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String surname = scanner.nextLine();
        System.out.println("Podaj PESEL");
        String pesel = scanner.nextLine();

        customerService.generateAndSaveCustomer(name, surname, pesel);
        System.out.println("Zostales dodany do bazy i masz niezaplacone faktury !!");

        showAddCustomerScreen();




    }
}


