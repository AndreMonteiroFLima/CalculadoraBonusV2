package interfaces.impl;

import interfaces.ICalculadoraBonus;
import model.Bonus;
import model.Funcionario;

public class CalculadoraBonusNumeroDeMembrosNaFamilia implements ICalculadoraBonus {

	@Override
	public void calculaBonus(Funcionario funcionario) {
		Bonus bonus;
		bonus = new Bonus("Bonus por número de membros na família", (funcionario.getNumeroDeMembrosNaFamilia() * 0.005)+1);
	}

}
