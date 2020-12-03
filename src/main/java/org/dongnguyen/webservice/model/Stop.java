package org.dongnguyen.webservice.model;

import javax.persistence.*;

@Entity(name = "stop")
@Table(indexes = { @Index(name = "index_code", columnList = "code", unique = true) })
public class Stop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "code")
	private String code;

	@Column(name = "name")
	private String name;

	@Column(name = "detail")
	private String detail;
}
