package org.dongnguyen.webservice.model;

import javax.persistence.*;

@Entity(name = "bus")
@Table(indexes = { @Index(name = "index_code", columnList = "code", unique = true) })
public class Bus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "code")
	private String code;

	@Column(name = "capacity")
	private int capacity;

	@Column(name = "make")
	private String make;

	@ManyToOne(targetEntity = Agency.class)
	@JoinColumn(name = "agency_id")
	private Agency agency;
}
