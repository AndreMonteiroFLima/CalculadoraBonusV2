package interfaces.impl;

import interfaces.ICalculadoraBonus;
import model.Bonus;
import model.Funcionario;
import org.jetbrains.annotations.NotNull;

public class CalculadoraBonusBom implements ICalculadoraBonus {

    @Override
    public void calculaBonus(@NotNull Funcionario funcionario) {
        try {
            funcionario.setBonus(new Bonus("Bom", 1.05));
        } catch (Exception e) {
            System.out.println("Erro ao calcular bonus: " + e.getMessage());
        }
    }
}
