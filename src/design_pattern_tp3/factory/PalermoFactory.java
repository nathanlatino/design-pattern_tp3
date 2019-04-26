
package design_pattern_tp3.factory;

import java.util.ArrayList;

import design_pattern_tp3.Ingredient;
import design_pattern_tp3.Sauce;
import design_pattern_tp3.Thickness;
import design_pattern_tp3.product.Palermo;
import design_pattern_tp3.product.Pizza;

public class PalermoFactory extends PizzaFactory
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public PalermoFactory()
		{
		thickness = Thickness.PATE_EPAISSE;

		sauce = Sauce.CREME;

		listIngredients = new ArrayList<>();
		listIngredients.add(Ingredient.FORMAGE_TOMA);
		listIngredients.add(Ingredient.OIGNONS);
		listIngredients.add(Ingredient.ANCHOIS);
		listIngredients.add(Ingredient.TOMATES);
		listIngredients.add(Ingredient.HERBES);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public Pizza createPizza()
		{
		return new Palermo(thickness, sauce, listIngredients);
		}
	}
