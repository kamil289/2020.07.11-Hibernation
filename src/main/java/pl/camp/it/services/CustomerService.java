package pl.camp.it.services;

import pl.camp.it.DAO.CastomerDAO;
import pl.camp.it.DAO.ICustomerDAO;
import pl.camp.it.model.Addres;
import pl.camp.it.model.Customer;
import pl.camp.it.model.Invoice;
import pl.camp.it.model.Product;

import java.util.Date;

public class CustomerService implements iCustomerService {

    static ICustomerDAO customerDAO = new CastomerDAO();

    public void generateAndSaveCustomer(String name,String surname, String pesel){

        Customer customer = new Customer();
        customer.setName(name);
        customer.setSurname(surname);
        customer.setPesel(Long.parseLong(pesel));

        Addres addres = new Addres();
        addres.setCity(RandomDataService.generateCity());
        addres.setStreet(RandomDataService.generateStreet());

        customer.setAddres(addres);

        Invoice invoice = new Invoice();
        invoice.setDate(new Date());
        invoice.setSignature(RandomDataService.generationInvoiceSignature());

        customer.getInvoices().add(invoice);

        Product product = new Product();
        product.setName(RandomDataService.generateProdactName());
        product.setPrice(RandomDataService.generateProductPrice());

        product.getCustomer().add(customer);
        customer.getProducts().add(product);

        customerDAO.saveCustomerToDatabase(customer);


    }
}
