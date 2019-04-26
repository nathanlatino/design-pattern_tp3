
package design_pattern_tp3;

public enum Sauce
	{

TOMATE("Sauce tomate", 6.75F, 0F), CREME("Crème", 9.85F, 20);

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private Sauce(String name, float price, float lactose)
		{
		this.name = name;
		this.price = price;
		this.lactose = lactose;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public String getName()
		{
		return this.name;
		}

	public float getPrice()
		{
		return this.price;
		}

	public float getLactose()
		{
		return this.lactose;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	private String name = "";
	private float price = 0F;
	private float lactose = 0F;
	}
