package org.example.model;

public class CD {
	// default
	private int cdId;
	private String cdName;
	private int cdPrice;

	public CD() {

	}

	
	public CD(int cdId, String cdName, int cdPrice) {
		
		this.cdId = cdId;
		this.cdName = cdName;
		this.cdPrice = cdPrice;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 	return "CD ID: "+cdId+" CD Name: "+cdName+" CD Price Is: "+cdPrice;
	
	
	}

}
