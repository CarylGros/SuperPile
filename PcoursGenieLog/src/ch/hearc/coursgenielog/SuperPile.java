
package ch.hearc.coursgenielog;

import java.util.Stack;

public class SuperPile extends Stack<Integer>
	{
	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private SuperPile()
		{

		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/
	public synchronized static SuperPile getInstance() // SIngleton
		{
		if (instance == null)
			{
			System.out.println("J'existe");
			instance = new SuperPile();
			}
		return instance;
		}

	public void Empiler(int x)
		{
		push(x);
		}

	public int Depiler()
		{
		if (taille() == 0) // Observable ..
			{
			notifyElement();
			}
		return pop();
		}

	public int Sommet() // FACADE
		{
		int first = pop();
		push(first);
		return first;
		}

	public int SousSommet() // FACADE
		{
		int first = pop();
		int second = pop();
		push(second);
		push(first);
		return second;
		}

	public int taille()
		{
		return size();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void notifyElement()
		{
		System.out.println("LA PILE EST VIDE");

		}
	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	private static SuperPile instance;
	}
