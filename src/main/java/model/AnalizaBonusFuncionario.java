package model;

import interfaces.ICalculadoraBonus;

import java.util.ArrayList;

public class AnalizaBonusFuncionario {

	private ArrayList<ICalculadoraBonus> formaCalculoBonus;


	public AnalizaBonusFuncionario(ArrayList<ICalculadoraBonus> ICalculadoraBonusCollection) {
		formaCalculoBonus=ICalculadoraBonusCollection;
	}

	public AnalizaBonusFuncionario() {
		formaCalculoBonus=new ArrayList<>();
	}

	public void verificaSePossuiBonus(Funcionario funcionario) {
		for(ICalculadoraBonus bonus:formaCalculoBonus) {
			bonus.calculaBonus(funcionario);
		}
	}

	public void addFormaCalculoBonus(ICalculadoraBonus novoBonus) {
		formaCalculoBonus.add(novoBonus);
	}

	public void dropFormaCalculoBonus(ICalculadoraBonus bonusASerRemovido) {
		formaCalculoBonus.remove(bonusASerRemovido);
	}



}
