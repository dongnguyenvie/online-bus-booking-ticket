package org.dongnguyen.webservice.model;

import java.util.Collection;

import javax.persistence.*;

@Entity(name = "trip_schedule")
public class TripSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "trip_date")
	private String tripDate;

	@Column(name = "available_seats")
	private int availableSeats;

	@OneToOne(targetEntity = Trip.class)
	@JoinColumn(name = "trip_detail_id")
	private Trip tripDetail;

	@OneToMany(targetEntity = Ticket.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "tickets_sold_id")
	private Collection<Ticket> ticketsSold;
}
