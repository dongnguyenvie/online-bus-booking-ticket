package org.dongnguyen.webservice.model;

import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "agency")
public class Agency {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "code")
	private String code;

	@Column(name = "name")
	private String name;

	@Column(name = "details")
	private String details;

	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "owner_id")
	private User owner;
}
