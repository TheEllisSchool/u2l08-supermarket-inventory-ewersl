import javax.swing.JOptionPane;

public class SuperMarket {
	public static void main(String [] args) {
		//create an instance of a class
		Item paperPlates = new Item (2.99, 20, "Paper Plates");
		Item birthdayCake = new Item (14.99, 1, "Birthday Cake"); 
		Flowers boquetOfRoses = new Flowers (10, 3, "Boquet of Roses", "Roses", "Red");
		Produce bananas = new Produce (0.44, 75, "Bananas", "Dec 20", 0.1); 
		Produce apples = new Produce (.69, 150, "Apples", "Jan 3", 0.1); 
		Item macandcheese = new Item (3.49, 60, "Mac and Cheese");

		System.out.println(paperPlates);
		
		
		
		double totalCost = 0;
		
		String input = JOptionPane.showInputDialog (null, 
				"We have paper plates, apples, soup, bouquet, and bananas." +
				"\n Which would you like?"); 
		String input2 = JOptionPane.showInputDialog(null, "How many would you like?"); 
		int amount = Integer.parseInt(input2); 
		
		if (input.equals("paper plates")) {
			int newQuantity = paperPlates.getQuantity()- amount;
			paperPlates.setQuantity(newQuantity);
			
			totalCost= totalCost + amount * paperPlates.getUnitPrice(); 
		}
		
		System.out.println("You purchased" + totalCost); 
		System.out.println("new paper plate values:" + paperPlates);
	}
}

