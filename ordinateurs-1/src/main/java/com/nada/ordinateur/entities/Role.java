package com.nada.ordinateur.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
private Long role_id;
private String role;
@Override
public String toString() {
	return this.role;}
public String getRole() {
	// TODO Auto-generated method stub
	return role;
}
}
