
package design_pattern_tp3.factory;

import java.util.ArrayList;

import design_pattern_tp3.Ingredient;
import design_pattern_tp3.Sauce;
import design_pattern_tp3.Thickness;
import design_pattern_tp3.product.Catania;
import design_pattern_tp3.product.Pizza;

public class CataniaFactory extends PizzaFactory
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public CataniaFactory()
		{
		thickness = Thickness.PATE_EPAISSE;

		sauce = Sauce.TOMATE;

		listIngredients = new ArrayList<>();
		listIngredients.add(Ingredient.POMMES_DE_TERRE);
		listIngredients.add(Ingredient.SAUSSICES);
		listIngredients.add(Ingredient.BROCOLI);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public Pizza createPizza()
		{
		return new Catania(thickness, sauce, listIngredients);
		}
	}
