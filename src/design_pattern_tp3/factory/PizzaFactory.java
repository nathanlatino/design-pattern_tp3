
package design_pattern_tp3.factory;

import java.util.List;

import design_pattern_tp3.Ingredient;
import design_pattern_tp3.Sauce;
import design_pattern_tp3.Thickness;
import design_pattern_tp3.product.Pizza;

public abstract class PizzaFactory
	{

	public Pizza createPizza()
		{
		return null;
		}

	public Thickness getNewThickness()
		{
		return thickness;
		}

	public Sauce getNewSauce()
		{
		return sauce;
		}

	public List<Ingredient> getNewIngredients()
		{
		return listIngredients;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	protected List<Ingredient> listIngredients;
	protected Sauce sauce;
	protected Thickness thickness;

	}
