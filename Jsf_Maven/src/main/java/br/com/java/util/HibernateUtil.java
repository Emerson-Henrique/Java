

package br.com.java.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;





public class HibernateUtil {
    private static final SessionFactory sessionfactory;
    public static final String HIBERNATE_SESSION = "hibernate_session";
    
    static{
        try {
            System.out.println("Tentando abrir uma session Factory");
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceregistry = new ServiceRegistryBuilder().
                    applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionfactory = configuration.buildSessionFactory(serviceregistry);
            System.out.println("Session Factory criada corretamente!");
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro ao inicar a session factory" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionfactory() {
        return sessionfactory;
    }
    
}
