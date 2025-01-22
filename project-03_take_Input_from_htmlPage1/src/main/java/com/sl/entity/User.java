package com.sl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "UserInput")
public class User {

	@Id
	public String name;

	public String address;

	public long phone;

}
