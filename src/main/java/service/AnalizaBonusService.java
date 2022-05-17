package service;

import interfaces.ICalculadoraBonus;
import interfaces.impl.*;
import model.Funcionario;

import java.util.ArrayList;

public class AnalizaBonusService {

	private ArrayList<ICalculadoraBonus> formaCalculoBonus;


	public AnalizaBonusService(ArrayList<ICalculadoraBonus> ICalculadoraBonusCollection) {
		formaCalculoBonus=ICalculadoraBonusCollection;
	}

	public AnalizaBonusService() {
		formaCalculoBonus=new ArrayList<>();
		formaCalculoBonus.add(new CalculadoraBonusAssiduidade());
		formaCalculoBonus.add(new CalculadoraBonusdeNatal());
		formaCalculoBonus.add(new CalculadoraBonusNumeroDeFilhosNaFamilia());
		formaCalculoBonus.add(new CalculadoraBonusNumeroDeMembrosNaFamilia());
		formaCalculoBonus.add(new CalculadoraBonusPorTempoNaEmpresa());
		formaCalculoBonus.add(new CalculadoraDistanciaDoTrabalho());
	}

	public void verificaSePossuiBonus(Funcionario funcionario) {
		for(ICalculadoraBonus bonus:formaCalculoBonus) {
			bonus.calculaBonus(funcionario);
		}
	}

}
