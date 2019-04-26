
package design_pattern_tp3.product;

import java.util.List;

import design_pattern_tp3.Ingredient;
import design_pattern_tp3.Sauce;
import design_pattern_tp3.Thickness;

public abstract class Pizza
	{

	public Pizza(Thickness thickness, Sauce sauce, List<Ingredient> listIngredients)
		{
		this.isSpicy = false;
		this.isVegetarian = true;

		this.thickness = thickness.getThickness();
		this.lactose = sauce.getLactose();

		this.price = thickness.getPrice();
		this.price += sauce.getPrice();

		for(Ingredient i:listIngredients)
			{
			this.price += i.getPrice();
			this.lactose += i.getLactose();

			if (i.isSpicy())
				{
				this.isSpicy = true;
				}

			if (!i.isVegetarian())
				{
				this.isVegetarian = false;
				}
			}
		}

	public float getPrice()
		{
		return price;
		}

	public boolean isSpicy()
		{
		return this.isSpicy;
		}

	public float getLactose()
		{
		return this.lactose;
		}

	public boolean isVegetarian()
		{
		return this.isVegetarian;
		}

	public int getThickness()
		{
		return this.thickness;
		}

	@Override
	public String toString()
		{
		StringBuilder sb = new StringBuilder();
		sb.append("Prix : " + getPrice());
		sb.append(", Est piquante : " + isSpicy());
		sb.append(", Lactose : " + getLactose());
		sb.append(", Est végétarienne : " + isVegetarian());
		sb.append(", Eppaisseur : " + getThickness());
		return sb.toString();
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	//Input
	private float price;

	//Sauce
	private float lactose;

	//Thickness
	private int thickness;

	//Ingerdient
	private boolean isVegetarian;
	private boolean isSpicy;

	}
