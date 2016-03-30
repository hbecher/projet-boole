package application.node.transformateur;

import application.node.Transformateur;

public class Non extends Transformateur
{
	@Override
	public boolean teste()
	{
		return false;
	}

	@Override
	public int numero_composant()
	{
		return 0;
	}

	@Override
	public String type_composant()
	{
		return null;
	}

	@Override
	public int nb_sortie()
	{
		return 0;
	}

	@Override
	public int nb_entree()
	{
		return 0;
	}
}
