package org.dongnguyen.webservice.model;

import javax.persistence.*;

@Entity(name = "trip")
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "fare")
	private int fare;

	@Column(name = "journey_time")
	private String journeyTime;

	@ManyToOne(targetEntity = Stop.class)
	@JoinColumn(name = "source_stop_id")
	private Stop sourceStop;

	@ManyToOne(targetEntity = Stop.class)
	@JoinColumn(name = "dest_stop_id")
	private Stop destStop;

	@ManyToOne(targetEntity = Bus.class)
	@JoinColumn(name = "bus_id")
	private Bus bus;

	@ManyToOne(targetEntity = Agency.class)
	@JoinColumn(name = "agency_id")
	private Agency agency;
}
