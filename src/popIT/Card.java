package popIT;

public class Card {
	
	private Rank rank;
	private Suit suit;
	private Color color;
	
	public Card(Rank r, Suit s, Color c){
		this.rank = r;
		this.suit = s;
		this.color = c;
	}
	
	public Rank getRank(){
		return this.rank;
	}
	
	public Suit getSuit(){
		return this.suit;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	public String toString(){
		StringBuffer out = new StringBuffer();
		out.append("Rank: ");
		out.append(this.rank.toString());
		out.append(" Suit: ");
		out.append(this.suit.toString());
		//Leave out color because it is not necessary for this game
		//out.append("\nColor: ");
		//out.append(this.color.toString());
		return out.toString();	
	}
}
