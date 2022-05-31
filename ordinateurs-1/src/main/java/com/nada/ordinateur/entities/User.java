package com.nada.ordinateur.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.nada.ordinateur.entities.Role;


@Entity
public class User {
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
private Long user_id;
private String username;
private String password;
private Boolean enabled=true;
 @ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
@JoinTable(name="user_role",joinColumns = @JoinColumn(name="user_id") ,
 inverseJoinColumns = @JoinColumn(name="role_id"))
private List<Role> roles;
 public String getPassword() {
	 return password;
	 }


	 public String getUsername() {
	 return username;
	 }


	 public Boolean getEnabled() {
	 	// TODO Auto-generated method stub
	 	return enabled;
	 }


	 public List<Role> getRoles() {
	 	// TODO Auto-generated method stub
	 	return roles;
	 }


	public void setPassword(String encode) {
		password=encode;
		
	}


	public void setRoles(Object object) {
		// TODO Auto-generated method stub
		
	}
}