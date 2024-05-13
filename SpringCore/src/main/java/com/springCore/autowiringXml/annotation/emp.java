package com.springCore.autowiringXml.annotation;

import java.net.Inet4Address;

import org.springframework.beans.factory.annotation.Autowired;

public class emp {
	
   private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	System.out.println("Setter injection");
	this.address = address;
}

public emp() {
	super();
	// TODO Auto-generated constructor stub
}
@Autowired
public emp(Address address) {
	super();
	System.out.println("Constructor injection");
	this.address = address;
}

@Override
public String toString() {
	return "emp [address=" + address + "]";
}

   
}