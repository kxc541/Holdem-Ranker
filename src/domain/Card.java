package domain;

public class Card {
	
	String number;
    String suit;
    
    public Card(){}
    
    public Card(String n, String s){
    	
    	this.number = n;
    	this.suit = s;
	
    }
    
    public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
   
}
