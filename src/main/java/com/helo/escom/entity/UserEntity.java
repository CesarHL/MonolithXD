package com.helo.escom.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "user")
public class UserEntity {

	@Id
	@Column(name = "id_user")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nb_name")
	@NotEmpty(message = "can't be empty")
	@Size(min = 1, max = 30, message = "must have a length between 1 and 30")
	private String name;

	@Column(name = "tx_first_last_name")
	@NotEmpty(message = "can't be empty")
	@Size(min = 1, max = 30, message = "must have a length between 1 and 30")
	private String firstLastName;

	@Column(name = "tx_second_last_name")
	@Size(max = 30, message = "must have a length between 1 and 30")
	private String secondLastName;

	@Column(name = "dt_birthdate")
    @DateTimeFormat
	private Date birthDate;

	@Column(name = "nb_username")
	@Size(max = 60, message = "must have a max length of 60")
	@Email
	@NotEmpty(message = "can't be empty")
	private String userName;

	@Column(name = "tx_phone")
	@Size(max = 10, message = "must have a max length of 10")
	private String phone;

	@Column(name = "tx_password")
	@NotEmpty(message = "can't be empty")
	private String password;


}
