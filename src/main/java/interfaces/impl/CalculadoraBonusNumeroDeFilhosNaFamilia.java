package interfaces.impl;

import interfaces.ICalculadoraBonus;
import model.Bonus;
import model.Funcionario;

public class CalculadoraBonusNumeroDeFilhosNaFamilia implements ICalculadoraBonus {

	@Override
	public void calculaBonus(Funcionario funcionario) {
		Bonus bonus;
		bonus = new Bonus("Bonus por número de filhos", (funcionario.getNumeroDeMembrosNaFamilia() * 0.01)+1);
	}

}
