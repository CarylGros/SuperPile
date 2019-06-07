
package ch.hearc.coursgenielog;

public class UseSuperPile
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
		Empiler(4);

		AfficherTaille();

		DepilerEtAfficher();

		SommetEtAfficher();

		SousSommetEtAfficher();

		ViderPile(4);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void ViderPile(int n)
		{
		for(int i = 0; i < n; i++)
			{
			SuperPile.getInstance().Depiler();
			}
		}

	private static void SousSommetEtAfficher()
		{
		System.out.println("Element une case en dessous du sommet : " + SuperPile.getInstance().SousSommet());
		}

	private static void SommetEtAfficher()
		{
		System.out.println("Element du sommet non retiré : " + SuperPile.getInstance().Sommet());
		}

	private static void DepilerEtAfficher()
		{
		System.out.println("Element du sommet et retiré : " + SuperPile.getInstance().Depiler());
		}

	private static void AfficherTaille()
		{
		System.out.println("Taille de la pile : " + SuperPile.getInstance().taille());
		}

	private static void Empiler(int n)
		{
		for(int i = 0; i < n; i++)
			{
			SuperPile.getInstance().Empiler(i);
			}

		}
	}
