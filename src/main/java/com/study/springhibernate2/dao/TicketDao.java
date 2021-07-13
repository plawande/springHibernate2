package com.study.springhibernate2.dao;

import com.study.springhibernate2.entity.Ticket;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

@Repository
public class TicketDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public List<Ticket> getAllTickets() {
        return em.createNamedStoredProcedureQuery("getTickets")
                .getResultList();
    }

    @Transactional
    public List<Ticket> getAllTicketsByCategory(String category) {
        return em.createNamedStoredProcedureQuery("getTicketsByCategory")
                .setParameter("tcategory", category)
                .getResultList();
    }

    @Transactional
    public void getSummaryReport(String title, Double highPrice) {
        StoredProcedureQuery query = em.createNamedStoredProcedureQuery("summaryReport")
                .setParameter("title", title)
                .setParameter("highPrice", highPrice);

        query.execute();  //put in try-catch block

        Integer totalBooks = (Integer) query.getOutputParameterValue("totalBooks"); //If we don't put @Transactional we will get InvalidDataAccessApiUsageException: OUT/INOUT parameter not available: totalBooks
        Double totalValue = (Double) query.getOutputParameterValue("totalValue");
        highPrice = (Double) query.getOutputParameterValue("highPrice");

        System.out.println(totalBooks + " " + totalValue + " " +highPrice);
    }
}
