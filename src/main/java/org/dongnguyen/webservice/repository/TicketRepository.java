package org.dongnguyen.webservice.repository;

import org.dongnguyen.webservice.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
