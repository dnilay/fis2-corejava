package org.example.model;

public class InternationalCD extends CD{
	
	private String language;

	
	public InternationalCD(String language,int cdId,String cdName,int price) {
		super(cdId,cdName,price);
		this.language=language;
		
	}
	
	
@Override
public String toString() {
	// TODO Auto-generated method stub
		return super.toString()+" Language IS: "+language;
} {
	
	}
	

}
