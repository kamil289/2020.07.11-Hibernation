package pl.camp.it;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pl.camp.it.DAO.CastomerDAO;
import pl.camp.it.DAO.ProductDAO;
import pl.camp.it.model.Addres;
import pl.camp.it.model.Customer;
import org.hibernate.query.Query;
import pl.camp.it.model.Invoice;
import pl.camp.it.model.Product;

import java.util.Date;
import java.util.List;

public class App {

    public static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public static void main(String[] args) {
/*

        Customer customer = new Customer();
        //customer.setId(10);
        customer.setName("Mateusz");
        customer.setSurname("Berenda");
        customer.setPesel(6185454);

        Addres addres = new Addres();
        addres.setCity("Kraków");
        addres.setStreet("Ogrodowa");

        customer.setAddres(addres);

        Invoice invoice = new Invoice();
        invoice.setDate(new Date());
        invoice.setSignature("FV/1.7.2020");

        customer.getInvoices().add(invoice);
        CastomerDAO.saveCustomerToDatabase(customer);

        Invoice invoice2 = new Invoice();
        invoice2.setDate(new Date());
        invoice2.setSignature("f/1.4.2020");

        customer.getInvoices().add(invoice2);

        Product product = new Product();
        product.setPrice(100);
        product.setName("mikser");
        product.getCustomer().add(customer);
        customer.getProducts().add(product);


        CastomerDAO.saveCustomerToDatabase(customer);

        Customer customer2 = new Customer();

        customer2.setName("MateuszMateusz");
        customer2.setSurname("BerendaBerenda");
        customer2.setPesel(6184324);

        CastomerDAO.saveCustomerToDatabase(customer2);

        //System.out.println(customer2);

        Customer customer3 = new Customer();
        customer3.setId(2);
        CastomerDAO.delateCustomer(customer3);

        System.out.println("CUSTOMER 1");
        //System.out.println(getCustomerById(1));

        //System.out.println(getAllCastomer());

        Product p = ProductDAO.getProductById(1);

        System.out.println(p.toString2());

*/
    }

}
