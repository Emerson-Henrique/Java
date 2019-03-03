
package br.com.java.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import org.hibernate.Session;


public class PhaseListenerJsf implements PhaseListener{

    //antes da fase
    @Override
    public void beforePhase(PhaseEvent fase) {
        if(fase.getPhaseId().equals(PhaseId.RESTORE_VIEW)){
            System.out.println("antes da fase: "+getPhaseId());
            Session session = HibernateUtil.getSessionfactory().openSession();
            session.beginTransaction();
            FacesContextUtil.setRequestSession(session);
        }

    }

    //depois da fase
    @Override
    public void afterPhase(PhaseEvent fase) {
        if(fase.getPhaseId().equals(PhaseId.RENDER_RESPONSE)){
            System.out.println("depois da fase: "+getPhaseId());
            Session session = FacesContextUtil.getRequestSession();
            try {
                session.getTransaction().commit();
            } catch (Exception e) {
                if(session.getTransaction().isActive()){
                    session.getTransaction().rollback();
                }
            }finally{
                session.close();
            }
        }
            
            
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
}
