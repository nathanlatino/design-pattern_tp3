
package design_pattern_tp3;

public enum Thickness
	{

PATE_FINE("Pâte fine", 4.35F, 2), PATE_EPAISSE("Pâte épaisse", 5.45F, 4);

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private Thickness(String name, float price, int thickness)
		{
		this.name = name;
		this.price = price;
		this.thickness = thickness;
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

	public int getThickness()
		{
		return this.thickness;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	private String name = "";
	private float price = 0F;
	private int thickness = 0;
	}
