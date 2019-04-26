
package design_pattern_tp3;

public enum Ingredient
	{

MOZZARELLA("Mozzarella", 8.85F, false, true, 10F),
ORIGAN("Origan", 4.55F, false, true, 0F),
JAMBON("Jambon", 3.25F, false, false, 0F),
CHAMPIGNON("Champignon", 2.75F, false, true, 0F),
FORMAGE_TOMA("Fromage toma", 6.45F, false, true, 15F),
OIGNONS("Oignons", 3.25F, false, true, 0F),
ANCHOIS("Anchois", 4.15F, false, false, 0F),
TOMATES("Tomates", 1.65F, false, true, 0F),
HERBES("Herbes", 6.95F, false, true, 0F),
SAUSSICES("Saussices", 5.15F, false, false, 0F),
POMMES_DE_TERRE("Pommes de terre", 9.45F, false, true, 0F),
BROCOLI("Brocoli", 7.85F, false, true, 0F);

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private Ingredient(String name, float price, boolean isSpicy, boolean isVegetarian, float lactose)
		{
		this.name = name;
		this.price = price;
		this.isSpicy = isSpicy;
		this.isVegetarian = isVegetarian;
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

	public boolean isSpicy()
		{
		return this.isSpicy;
		}

	public boolean isVegetarian()
		{
		return this.isVegetarian;
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
	private boolean isSpicy = false;
	private boolean isVegetarian = false;
	private float lactose = 0F;

	}
