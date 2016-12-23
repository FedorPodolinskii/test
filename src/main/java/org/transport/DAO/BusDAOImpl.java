package org.transport.DAO;

import org.springframework.stereotype.Repository;
import org.transport.entities.Bus;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by Super-Fedya on 23.12.2016.
 */
@Repository
public class BusDAOImpl implements BusDAO {
    @PersistenceContext
    protected EntityManager em;

    public void incert(Bus bus) {
        em.persist(bus);

    }

    public List<Bus> findAllBuses() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Bus> cq = builder.createQuery(Bus.class);
        Root<Bus> root = cq.from(Bus.class);
        cq.select(root);
        return em.createQuery(cq).getResultList();
    }
}
