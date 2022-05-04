package interfaces.impl;

import interfaces.ICalculadoraBonus;
import model.Bonus;
import model.Funcionario;

import java.time.LocalDate;

public class CalculadoraBonusPorTempoNaEmpresa implements ICalculadoraBonus {

	private LocalDate dataAtual;

	@Override
	public void calculaBonus(Funcionario funcionario) {
		dataAtual = LocalDate.now();
		Bonus bonus;
		if(funcionario.getAnoDeIngresso() - dataAtual.getYear() <= 0) {
			bonus = new Bonus("Bonus por tempo na empresa", 1);
		}else if(funcionario.getAnoDeIngresso() - dataAtual.getYear() <= 3) {
			bonus = new Bonus("Bonus por tempo na empresa", 1.05);
		}else if(funcionario.getAnoDeIngresso() - dataAtual.getYear() <= 5) {
			bonus = new Bonus("Bonus por tempo na empresa", 1.1);
		}else if(funcionario.getAnoDeIngresso() - dataAtual.getYear() >= 10) {
			bonus = new Bonus("Bonus por tempo na empresa", 1.12);
		}
	}

}
