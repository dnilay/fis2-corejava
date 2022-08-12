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


	public String getDetails()
	{
		return "CD ID: "+cdId+" CD Name: "+cdName+" CD Price Is: "+cdPrice;
	}

}
