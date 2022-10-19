package com.example.store.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="mobiles")
public class Mobiles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="type",nullable = false)
	private String type;
	
	@Column(name="manufacturer",nullable = false)
	private String manufacturer;
	
	@Column(name="model",nullable = false)
	private String model;
	
	@Column(name="os",nullable = false)
	private String os;
	
	@Column(name="date",nullable = false)
	private String date;
	
	@Column(name="client",nullable = false)
	private String client;
	
	@Column(name="seriel",nullable = false)
	private Long seriel;
	
	@Column(name="location",nullable = false)
	private String location;
	
	@Column(name="status",nullable = false)
	private String status;
	
	@Column(name="ip",nullable = false)
	private String ip;
	
	@Column(name="server",nullable = false)
	private String server;
	
	@Column(name="phone",nullable = false)
	private Long phone;
	
	public Mobiles(Long id, String type, String manufacturer, String model, String os, String date, String client,
			Long seriel, String location, String status, String ip, String server, Long phone) {
		super();
		this.id = id;
		this.type = type;
		this.manufacturer = manufacturer;
		this.model = model;
		this.os = os;
		this.date = date;
		this.client = client;
		this.seriel = seriel;
		this.location = location;
		this.status = status;
		this.ip = ip;
		this.server = server;
		this.phone = phone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Long getSeriel() {
		return seriel;
	}

	public void setSeriel(Long seriel) {
		this.seriel = seriel;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Mobiles() {
		super();
	}
	
	

}
