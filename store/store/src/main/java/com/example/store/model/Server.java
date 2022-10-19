package com.example.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="server")
public class Server {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="typeofdevice",nullable=false)
	private String typeofdevice;
	
	@Column(name="model",nullable=false)
	private String model;
	
	@Column(name="manufacturer",nullable=false)
	private String manufacturer;
	
	@Column(name="os",nullable=false)
	private String os;
	
	@Column(name="dateofpurchase",nullable=false)
	private String dateofpurchase;
	
	@Column(name="currentclient",nullable=false)
	private String currentclient;
	
	@Column(name="serielnumber",nullable=false)
	private Long serielnumber;
	
	@Column(name="location",nullable=false)
	private String location;
	
	@Column(name="status",nullable=false)
	private String status;
	
	@Column(name="ip",nullable=false)
	private String ip;
	
	public Server(Long id, String typeofdevice, String model, String manufacturer, String os, String dateofpurchase,
			String currentclient, Long serielnumber, String location, String status, String ip) {
		super();
		this.id = id;
		this.typeofdevice = typeofdevice;
		this.model = model;
		this.manufacturer = manufacturer;
		this.os = os;
		this.dateofpurchase = dateofpurchase;
		this.currentclient = currentclient;
		this.serielnumber = serielnumber;
		this.location = location;
		this.status = status;
		this.ip = ip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeofdevice() {
		return typeofdevice;
	}

	public void setTypeofdevice(String typeofdevice) {
		this.typeofdevice = typeofdevice;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getDateofpurchase() {
		return dateofpurchase;
	}

	public void setDateofpurchase(String dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}

	public String getCurrentclient() {
		return currentclient;
	}

	public void setCurrentclient(String currentclient) {
		this.currentclient = currentclient;
	}

	public Long getSerielnumber() {
		return serielnumber;
	}

	public void setSerielnumber(Long serielnumber) {
		this.serielnumber = serielnumber;
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

	public Server() {
		super();
	}
	
	
	

}
