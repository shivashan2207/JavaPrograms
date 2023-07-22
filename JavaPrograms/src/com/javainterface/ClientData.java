package com.javainterface;

public class ClientData implements ClientInfo,Company {

	@Override
	public void clientData() {
	System.out.println("clent Data is 123");
		
		
	}

	@Override
	public void clientId() {
		System.out.println("clientid mura@123");
		
	}

	@Override
	public void clientName() {
		System.out.println("Gowtham");
		
	}

	@Override
	public void companyName() {
		System.out.println("greenstech");
		
	}
	public static void main(String[] args) {
		ClientData e = new ClientData();
		e.clientData();
		e.clientId();
		e.clientName();e.companyName();
	}

}
