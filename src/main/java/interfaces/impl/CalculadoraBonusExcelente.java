package interfaces.impl;

import interfaces.ICalculadoraBonus;
import model.Bonus;
import model.Funcionario;
import org.jetbrains.annotations.NotNull;

public class CalculadoraBonusExcelente implements ICalculadoraBonus {

    @Override
    public void calculaBonus(@NotNull Funcionario funcionario) {
        try {
            funcionario.setBonus(new Bonus("Excelente", 1.2));
        } catch (Exception e) {
            System.out.println("Erro ao calcular bonus: " + e.getMessage());
        }
    }
}
