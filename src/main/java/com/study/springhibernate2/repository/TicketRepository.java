package com.study.springhibernate2.repository;

import com.study.springhibernate2.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    @Procedure(name = "getTickets")
    List<Ticket> getAllTickets();
}
