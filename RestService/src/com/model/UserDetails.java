package com.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.cfg.Configuration;

@Entity(name="TB_USER_DETAILS")
public class UserDetails {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@ElementCollection
	@JoinTable(name="USER_ADDRESS", joinColumns = @JoinColumn(name="USER_ID"))
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type="long"))
	private Collection<Address> listOfAddress = new ArrayList<Address>();

	
	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	
	

}
