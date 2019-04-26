
package design_pattern_tp3.factory;

import java.util.ArrayList;

import design_pattern_tp3.Ingredient;
import design_pattern_tp3.Sauce;
import design_pattern_tp3.Thickness;
import design_pattern_tp3.product.Pizza;
import design_pattern_tp3.product.Profunghi;

public class ProfunghiFactory extends PizzaFactory
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public ProfunghiFactory()
		{
		thickness = Thickness.PATE_FINE;

		sauce = Sauce.TOMATE;

		listIngredients = new ArrayList<>();
		listIngredients.add(Ingredient.MOZZARELLA);
		listIngredients.add(Ingredient.JAMBON);
		listIngredients.add(Ingredient.CHAMPIGNON);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public Pizza createPizza()
		{
		return new Profunghi(thickness, sauce, listIngredients);
		}

	}
