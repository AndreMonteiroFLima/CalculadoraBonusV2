package interfaces.impl;

import interfaces.ICalculadoraBonus;
import model.Bonus;
import model.Funcionario;

import java.time.LocalDate;

public class CalculadoraBonusdeNatal implements ICalculadoraBonus {

	@Override
	public void calculaBonus(Funcionario funcionario) {
		LocalDate localDate = LocalDate.now();
		if(localDate.getMonthValue() == 12 && localDate.getDayOfMonth() == 25) {
			Bonus bonus = new Bonus("Bonus de Natal",  1.2);
		}
	}

}
