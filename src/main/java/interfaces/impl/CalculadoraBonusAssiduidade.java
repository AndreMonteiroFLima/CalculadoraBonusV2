package interfaces.impl;

import interfaces.ICalculadoraBonus;
import model.Bonus;
import model.Funcionario;

public class CalculadoraBonusAssiduidade implements ICalculadoraBonus {

	@Override
	public void calculaBonus(Funcionario funcionario) {
		if(funcionario.getNumeroDeFaltas()==0) {
			funcionario.addBonus(new Bonus("Bonus de assiduidade", 1.03));
		}else if(funcionario.getNumeroDeFaltas()==1) {
			funcionario.addBonus(new Bonus("Bonus de assiduidade", 1.01));
		}else if(funcionario.getNumeroDeFaltas()==2) {
			funcionario.addBonus(new Bonus("Bonus de assiduidade", 1.005));
		}else if(funcionario.getNumeroDeFaltas()>2) {
			funcionario.addBonus(new Bonus("Bonus de assiduidade", 1));
		}
	}

}
