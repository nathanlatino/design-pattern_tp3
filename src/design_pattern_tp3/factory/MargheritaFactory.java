
package design_pattern_tp3.factory;

import java.util.ArrayList;

import design_pattern_tp3.Ingredient;
import design_pattern_tp3.Sauce;
import design_pattern_tp3.Thickness;
import design_pattern_tp3.product.Margherita;
import design_pattern_tp3.product.Pizza;

public class MargheritaFactory extends PizzaFactory
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public MargheritaFactory()
		{
		thickness = Thickness.PATE_FINE;

		sauce = Sauce.TOMATE;

		listIngredients = new ArrayList<>();
		listIngredients.add(Ingredient.MOZZARELLA);
		listIngredients.add(Ingredient.ORIGAN);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public Pizza createPizza()
		{
		return new Margherita(thickness, sauce, listIngredients);
		}

	}
