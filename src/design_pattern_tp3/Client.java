
package design_pattern_tp3;

import design_pattern_tp3.factory.CataniaFactory;
import design_pattern_tp3.factory.MargheritaFactory;
import design_pattern_tp3.factory.PalermoFactory;
import design_pattern_tp3.factory.Pizzaiolo;
import design_pattern_tp3.factory.ProfunghiFactory;
import design_pattern_tp3.product.Pizza;

public class Client
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{

		Pizzaiolo pizzaiolo = new Pizzaiolo();

		MargheritaFactory mf = new MargheritaFactory();
		ProfunghiFactory prf = new ProfunghiFactory();
		PalermoFactory paf = new PalermoFactory();
		CataniaFactory cf = new CataniaFactory();

		Pizza margherita = pizzaiolo.makePizza(mf);

		System.out.println(margherita);

		Pizza profunghi = pizzaiolo.makePizza(prf);

		System.out.println(profunghi);

		Pizza palermo = pizzaiolo.makePizza(paf);

		System.out.println(palermo);

		Pizza catania = pizzaiolo.makePizza(cf);

		System.out.println(catania);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
