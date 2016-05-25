package fr.hbecher.boole.component.transformer;

import fr.hbecher.boole.component.Circuit;
import fr.hbecher.boole.component.Transformer;
import fr.hbecher.boole.component.connection.Output;

/**
 * Représente un "ou" logique.
 *
 * @see fr.hbecher.boole.component.Component
 * @see fr.hbecher.boole.component.Transformer
 */
public class Or extends Transformer
{
	public Or(Circuit circuit, Output out1, Output out2)
	{
		super("Or", circuit, 2, 1);

		connect(0, out1);
		connect(1, out2);
	}

	@Override
	public boolean getState(int port)
	{
		return port == 0 && (getInput(0).getState() || getInput(1).getState());
	}
}