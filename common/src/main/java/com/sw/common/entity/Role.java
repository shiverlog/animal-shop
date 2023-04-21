package com.sw.common.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer seq;
	
	@Column(length = 40, nullable = false, unique = true)
	private String name;
	
	@Column(length = 150, nullable = false)
	private String description;
	
	public Role() {
	}
	
	public Role(String name) {
		super();
		this.name = name;
	}
	
	public Role(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer id) {
		this.seq = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		return Objects.hash(seq);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(seq, other.seq);
	}

	@Override
	public String toString() {
		return "Role [name=" + name + "]";
	}
}
