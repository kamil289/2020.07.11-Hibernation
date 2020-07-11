package pl.camp.it;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pl.camp.it.model.Customer;
import org.hibernate.query.Query;

import java.util.List;

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

        System.out.println(customer2);

        Customer customer3 = new Customer();
        customer3.setId(2);
        delateCustomer(customer3);

        System.out.println(getCustomerById(1));

        System.out.println(getAllCastomer());


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
    public static void delateCustomer(Customer customer){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.delete(customer);
            tx.commit();
        }catch (Exception e){
            if (tx != null){
                tx.rollback();
            }
        }finally {
            session.close();
        }
    }
    public static Customer getCustomerById(int id){
        Session session = sessionFactory.openSession();
        Query <Customer> query = session.createQuery("FROM pl.camp.it.model.Customer where id = " + id);
        Customer customer = query.getSingleResult();
        return customer;
    }
    public static List<Customer> getAllCastomer(){
        Session session = sessionFactory.openSession();
        Query<Customer> query =session.createQuery("FROM pl.camp.it.model.Customer");
        return query.getResultList();
    }
}
