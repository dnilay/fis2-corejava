package org.example.model;

public class SpecialEditionCD extends CD{
	
	private String specialFeature;

	public SpecialEditionCD(int cdId,String cdName,int cdPrice,String specialFeature) {
		super(cdId,cdName,cdPrice);
		this.specialFeature = specialFeature;
	}
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails()+" Special Feature is: "+specialFeature;
	}

}
