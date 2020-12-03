package org.dongnguyen.webservice.model;

import javax.persistence.*;

@Entity(name = "ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "seat_number")
	private int seatNumber;

	@Column(name = "cancellable")
	private boolean cancellable;

	@Column(name = "journey_date")
	private String journeyDate;

	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "passenger_id")
	private User passenger;

	@ManyToOne(targetEntity = TripSchedule.class)
	@JoinColumn(name = "trip_schedule_id")
	private TripSchedule tripSchedule;
}
