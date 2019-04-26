
package design_pattern_tp3.product;

import java.util.List;

import design_pattern_tp3.Ingredient;
import design_pattern_tp3.Sauce;
import design_pattern_tp3.Thickness;

public class Margherita extends Pizza
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Margherita(Thickness thickness, Sauce sauce, List<Ingredient> listIngredients)
		{
		super(thickness, sauce, listIngredients);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder sb = new StringBuilder();
		sb.append("Margherita { ");
		sb.append(super.toString());
		sb.append(" }");
		return sb.toString();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
