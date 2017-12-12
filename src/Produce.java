import javax.swing.JOptionPane;

public class Produce extends Item {
	//attributes
	private String expiration; 
	private double weight; 
	
	//constructor
	public Produce(double up, int q, String n, String exp, double w) {
		//calls superclass constructor 
		super(up, q, n); 
		
		setExpiration(exp); 
		setWeight (w); 
	}
	public void setExpiration(String exp) {
		expiration = exp; 
		
		
	}
	public void setWeight (Double w) {
		if (w > 0) {
			weight = w; 
		} else {
			System.out.println("weight not set");
		}	
	}
	public String getExpiration() {
		return expiration; 
	}
	public double getWeight () {
		return weight; 
	}
}
