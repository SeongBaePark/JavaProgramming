package my.day04;

public class PizzaTopping {

	public static void main(String[] args) {
		String[] toppings = { "Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon" };
		
		for (int i = 0; i < toppings.length; i++)
		{
			System.out.println(toppings[i] +"");
		}
		
		for (String value : toppings)
		{
			System.out.print(value + " ");
		}


	}

}
