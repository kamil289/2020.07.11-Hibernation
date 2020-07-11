package pl.camp.it;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pl.camp.it.model.Customer;


public class App {

    public static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public static void main(String[] args) {


        Customer customer = new Customer();
        //customer.setId(10);
        customer.setName("Mateusz");
        customer.setSurname("Berenda");
        customer.setPesel(6185454);

        saveCustomerToDatabase(customer);

        Customer customer2 = new Customer();

        customer2.setName("MateuszMateusz");
        customer2.setSurname("BerendaBerenda");
        customer2.setPesel(6184324);

        saveCustomerToDatabase(customer2);

    }

    public static void saveCustomerToDatabase(Customer customer){

        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(customer);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }

    }
}
