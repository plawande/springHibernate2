package com.study.springhibernate2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "getTickets",
                procedureName = "GET_TICKETS",
                resultClasses = {
                        Ticket.class
                }
        ),
        @NamedStoredProcedureQuery(
                name = "getTicketsByCategory",
                procedureName = "GET_TICKETS_BY_CATEGORY",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "tcategory", type = String.class)
                },
                resultClasses = {
                        Ticket.class
                }
        ),
        @NamedStoredProcedureQuery(
                name = "summaryReport",
                procedureName = "SUMMARY_REPORT",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "title", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "totalBooks", type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "totalValue", type = Double.class),
                        @StoredProcedureParameter(mode = ParameterMode.INOUT, name = "highPrice", type = Double.class)
                }
        )
})
@Entity
public class Ticket {
    @Id
    private int id;
    private int amount;
    private String category;
}
