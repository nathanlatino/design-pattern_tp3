
package design_pattern_tp3.product;

import java.util.List;

import design_pattern_tp3.Ingredient;
import design_pattern_tp3.Sauce;
import design_pattern_tp3.Thickness;

public class Profunghi extends Pizza
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Profunghi(Thickness thickness, Sauce sauce, List<Ingredient> listIngredients)
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
		sb.append("Profunghi { ");
		sb.append(super.toString());
		sb.append(" }");
		return sb.toString();
		}
	}
