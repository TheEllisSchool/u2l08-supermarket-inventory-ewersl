
public class Flowers extends Item {
	//attributes 
	private String vareity ; 
	private String color ; 
	
	//constructor 
	public Flowers (double up, int q, String n, String v, String c) {
		//calls superclass conductor 
		super (up, q, n); 
		
		setVareity(v); 
		setColor (c); 
	}
	public void setVareity (String v) {
		vareity = v;
	}
	public void setColor (String c) {
		color = c; 
	}
	public String getVareity() {
		return vareity; 
	}
	public String getColor () {
		return color; 
	}
	
	
}
