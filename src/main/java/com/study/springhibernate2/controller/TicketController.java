package com.study.springhibernate2.controller;

import com.study.springhibernate2.dao.TicketDao;
import com.study.springhibernate2.entity.Ticket;
import com.study.springhibernate2.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    private TicketDao ticketDao;

    @GetMapping(path = "/tickets")
    public ResponseEntity<?> getAllTickets() {
        List<Ticket> tickets = ticketDao.getAllTickets();
        ticketDao.getSummaryReport("Java", 50.0);
        return ResponseEntity.ok(tickets);
    }

    @GetMapping(path = "/tickets/{category}")
    public ResponseEntity<?> getAllTicketsByCategory(@PathVariable("category") String category) {
        List<Ticket> tickets = ticketDao.getAllTicketsByCategory(category);
        return ResponseEntity.ok(tickets);
    }
}
