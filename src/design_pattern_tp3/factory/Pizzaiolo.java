
package design_pattern_tp3.factory;

import design_pattern_tp3.product.Pizza;

public class Pizzaiolo
	{

	public Pizza makePizza(PizzaFactory pizzaFactory)
		{
		return pizzaFactory.createPizza();
		}

	}
